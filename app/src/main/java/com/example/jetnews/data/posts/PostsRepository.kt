package com.example.jetnews.data.posts

import com.example.jetnews.data.Result
import com.example.jetnews.model.Post
import com.example.jetnews.model.PostsFeed
import kotlinx.coroutines.flow.Flow

interface PostsRepository {
    /**
     * Get a specific JetNews post.
     */
    suspend fun getPost(postId: String?): Result<Post>

    /**
     * Get JetNews posts.
     */
    suspend fun getPostsFeed(): Result<PostsFeed>

    /**
     * Observe the current favorites
     */
    fun observeFavorites(): Flow<Set<String>>

    /**
     * Toggle a postId to be a favorite or not.
     */
    suspend fun toggleFavorite(postId: String)
}