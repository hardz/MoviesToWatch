package com.freshlybakedandroid.core.data.repository

import com.freshlybakedandroid.core.model.DiscoverMovieResponse


interface DiscoverMovieRepository {
    suspend fun fetchDiscoverMovieList(page: Int): Result<DiscoverMovieResponse>
}