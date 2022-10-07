package com.freshlybakedandroid.core.data.repository

import com.freshlybakedandroid.core.network.model.DiscoverMovieResponse
import com.freshlybakedandroid.core.network.service.MovieService
import javax.inject.Inject

class DiscoverMovieRepositoryImpl @Inject constructor(private val movieService: MovieService) {

    suspend fun fetchDiscoverMovieList(page: Int) { //: DiscoverMovieResponse
        //We Can Manage This data Offline First currently fetch from network data
        suspend fun getDiscoverMovieData() = movieService.fetchDiscoverMovie(page)
    }
}