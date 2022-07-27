package com.tw.instagram.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import com.tw.instagram.databinding.FragmentPostHolderBinding
import com.tw.instagram.fragments.PostHolder
import com.tw.instagram.models.Post

class PostAdapter : PagingDataAdapter<Post, PostHolder>(POST_DIFF_CALLBACK) {
    override fun onBindViewHolder(holder: PostHolder, position: Int) {
        val item = getItem(position)
        if (item != null) {
            holder.bind(item)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostHolder {
        return PostHolder(
            FragmentPostHolderBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    companion object {
        private val POST_DIFF_CALLBACK =  object : DiffUtil.ItemCallback<Post>() {
            override fun areItemsTheSame(oldItem: Post, newItem: Post): Boolean =
                oldItem.id == newItem.id

            override fun areContentsTheSame(oldItem: Post, newItem: Post): Boolean =
                oldItem == newItem
        }
    }

}
