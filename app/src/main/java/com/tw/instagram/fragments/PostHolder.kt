package com.tw.instagram.fragments

import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.tw.instagram.R
import com.tw.instagram.databinding.FragmentPostHolderBinding
import com.tw.instagram.models.Post

class PostHolder(private val binding: FragmentPostHolderBinding) : RecyclerView.ViewHolder(binding.root){
    fun bind(post: Post) {
        binding.apply {
            binding.profileNameTextView.text = post.userId
            binding.captionTextview.text = post.caption
            binding.likeTextview.text = "${post.noOfLikes} likes"
            Picasso.get().load(post.imageUrl).into(binding.postImageView)
            Picasso.get().load(post.imageUrl).into(binding.profileImageView)
        }
    }

}
