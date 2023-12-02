package com.freshlybakedandroid.core.data.repository

import com.freshlybakedandroid.core.model.DiscoverMovieResponse
import com.freshlybakedandroid.core.network.service.MovieService
import javax.inject.Inject

class DiscoverMovieRepositoryImpl @Inject constructor(private val movieService: MovieService): DiscoverMovieRepository {

    override suspend fun fetchDiscoverMovieList(page: Int): Result<DiscoverMovieResponse> {
        //We Can Manage This data Offline First currently fetch from network data
        val result = movieService.fetchDiscoverMovie(page)
        return result
    }

    override suspend fun fetchTrendingMedia(mediaType: String, timeWindow: String ): Result<DiscoverMovieResponse> {
        //We Can Manage This data Offline First currently fetch from network data
        return  movieService.fetchTrendingMedia(mediaType, timeWindow)
    }

    override suspend fun fetchSearchMovie(query: String): Result<DiscoverMovieResponse> {
        return movieService.fetchSearchMovie(query)
    }
}