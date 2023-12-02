package com.freshlybakedandroid.core.data.repository

import com.freshlybakedandroid.core.model.DiscoverMovieResponse


interface DiscoverMovieRepository {
    suspend fun fetchDiscoverMovieList(page: Int): Result<DiscoverMovieResponse>
    suspend fun fetchTrendingMedia(mediaType: String, timeWindow: String): Result<DiscoverMovieResponse>
    suspend fun fetchSearchMovie(query: String): Result<DiscoverMovieResponse>
}