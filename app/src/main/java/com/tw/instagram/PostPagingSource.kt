package com.tw.instagram

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.tw.instagram.api.Api
import com.tw.instagram.models.Post
import kotlinx.coroutines.delay
import kotlin.math.max

private const val STARTING_KEY = 0
private const val LOAD_DELAY_MILLIS = 1000L

class PostPagingSource : PagingSource<Int, Post>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Post> {
        val startKey = params.key ?: STARTING_KEY
        if (startKey != STARTING_KEY) delay(LOAD_DELAY_MILLIS)
        val response =
            Api.create().getPosts(params.key?.div(params.loadSize) ?: startKey, params.loadSize)

        return LoadResult.Page(
            data = response.content,
            prevKey = when (startKey) {
                STARTING_KEY -> null
                else -> when (val prevKey = ensureValidKey(startKey - params.loadSize)) {
                    STARTING_KEY -> null
                    else -> prevKey
                }
            },
            nextKey = if (response.content.isEmpty()) null else startKey + params.loadSize
        )
    }

    override fun getRefreshKey(state: PagingState<Int, Post>): Int? {
        val anchorPosition = state.anchorPosition ?: return null
        val article = state.closestItemToPosition(anchorPosition) ?: return null
        return ensureValidKey(key = article.id - (state.config.pageSize / 2))
    }

    private fun ensureValidKey(key: Int) = max(STARTING_KEY, key)


}
