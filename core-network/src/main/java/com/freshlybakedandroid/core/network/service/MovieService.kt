package com.freshlybakedandroid.core.network.service

import com.freshlybakedandroid.core.model.DiscoverMovieResponse
import com.freshlybakedandroid.core.network.BuildConfig
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieService {

//    https://api.themoviedb.org/3/discover/movie?language=en&sort_by=popularity.desc&page=1&api_key=
//    https://api.themoviedb.org/3/discover/movie?language=en&sort_by=popularity.desc&api_key=
    // We have to manage all type of response to handle  success, failure and exception or error
    @GET("discover/movie?language=en&sort_by=popularity.desc&api_key=${BuildConfig.API_KEY}")
    suspend fun fetchDiscoverMovie(@Query("page") page: Int): Result<DiscoverMovieResponse>

    // https://api.themoviedb.org/3/trending/all/day?api_key=<<api_key>>
//    media_type Allowed Values: all, movie, tv, person
//    time_window Allowed Values: day, week
    @GET("trending/{media_type}/{time_window}?&api_key=${BuildConfig.API_KEY}")
    suspend fun fetchTrendingMedia(@Path("media_type") mediaType: String, @Path("time_window") timeWindow: String): Result<DiscoverMovieResponse>


//    https://api.themoviedb.org/3/search/movie?api_key=&query=john wick
    @GET("search/movie?&api_key=${BuildConfig.API_KEY}")
    suspend fun fetchSearchMovie(@Query("query") query: String): Result<DiscoverMovieResponse>
}