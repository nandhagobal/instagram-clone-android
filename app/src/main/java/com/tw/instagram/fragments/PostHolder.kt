package com.tw.instagram.fragments

import androidx.recyclerview.widget.RecyclerView
import com.tw.instagram.databinding.FragmentPostHolderBinding
import com.tw.instagram.models.Post

class PostHolder(private val binding: FragmentPostHolderBinding) : RecyclerView.ViewHolder(binding.root){
    fun bind(post: Post) {
        binding.apply {
            binding.profileNameTextView.text = post.userId
        }
    }

}
