package com.tw.instagram.models

data class PostResponse(val content : List<Post>)
data class Post(val id: Int,
                val userId: String,
                val imageUrl: String,
                val noOfLikes: Int,
                val caption: String)
