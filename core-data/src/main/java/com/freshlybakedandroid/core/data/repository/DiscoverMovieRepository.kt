package com.freshlybakedandroid.core.data.repository

import com.freshlybakedandroid.core.network.model.DiscoverMovieResponse

interface DiscoverMovieRepository {

//    @WorkerThread
    fun fetchDiscoverMovieList(page: Int): Result<DiscoverMovieResponse>//: DiscoverMovieResponse
}