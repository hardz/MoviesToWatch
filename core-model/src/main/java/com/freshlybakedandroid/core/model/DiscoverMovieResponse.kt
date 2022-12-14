package com.freshlybakedandroid.core.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DiscoverMovieResponse(
    @Json(name = "page")
    val page: Int,
    @Json(name = "results")
    val movieResults: List<MovieResult>,
    @Json(name = "total_pages")
    val totalPages: Int,
    @Json(name = "total_results")
    val totalResults: Int
)