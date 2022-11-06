package com.freshlybakedandroid.core.network.service

import com.freshlybakedandroid.core.model.DiscoverMovieResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieService {

//    https://api.themoviedb.org/3/discover/movie?language=en&sort_by=popularity.desc&page=1&api_key=87c1a85de96a7a712a063156b842ad8e
//    https://api.themoviedb.org/3/discover/movie?language=en&sort_by=popularity.desc&api_key=87c1a85de96a7a712a063156b842ad8e
    // We have to manage all type of response to handle  success, failure and exception or error
    @GET("discover/movie?language=en&sort_by=popularity.desc&api_key=87c1a85de96a7a712a063156b842ad8e")
    suspend fun fetchDiscoverMovie(@Query("page") page: Int): Result<DiscoverMovieResponse>
}