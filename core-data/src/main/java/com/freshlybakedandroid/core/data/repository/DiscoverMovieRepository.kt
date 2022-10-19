package com.freshlybakedandroid.core.data.repository

import com.freshlybakedandroid.core.network.model.DiscoverMovieResponse

interface DiscoverMovieRepository {
//    suspend fun fetchDiscoverMovieList(page: Int): Result<DiscoverMovieResponse>
    suspend fun fetchDiscoverMovieList(page: Int): Result<DiscoverMovieResponse>
}