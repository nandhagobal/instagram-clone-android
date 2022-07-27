package com.tw.instagram.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.tw.instagram.models.Post
import com.tw.instagram.repositories.PostRepository
import kotlinx.coroutines.flow.Flow

private const val ITEMS_PER_PAGE = 2

class HomeViewModel(private val postRepository: PostRepository) : ViewModel() {

    val items : Flow<PagingData<Post>> = Pager(
        config = PagingConfig(ITEMS_PER_PAGE, enablePlaceholders = false),
        pagingSourceFactory = { postRepository.postPagingSource }
    ).flow.cachedIn(viewModelScope)

}