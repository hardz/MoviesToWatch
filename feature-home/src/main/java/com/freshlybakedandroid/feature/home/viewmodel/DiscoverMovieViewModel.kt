package com.freshlybakedandroid.feature.home.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.freshlybakedandroid.core.data.repository.DiscoverMovieRepository
import com.freshlybakedandroid.core.model.DiscoverMovieResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DiscoverMovieViewModel @Inject constructor(private val discoverMovieRepository: DiscoverMovieRepository): ViewModel() {

    private val _discoverMovieResponse = MutableLiveData<DiscoverMovieResponse>()
    var discoverMovieResponse: LiveData<DiscoverMovieResponse> = _discoverMovieResponse

    private val _trendingMediaResponse = MutableLiveData<DiscoverMovieResponse>()
    var trendingMediaResponse: LiveData<DiscoverMovieResponse> = _trendingMediaResponse

    private val _searchMovieResponse = MutableLiveData<DiscoverMovieResponse>()
    var searchMovieResponse: LiveData<DiscoverMovieResponse> = _searchMovieResponse

    fun loadDiscoverMovieData(page: Int){
        viewModelScope.launch {
            val result = discoverMovieRepository.fetchDiscoverMovieList(page)
            result.onSuccess {
                Log.e("DEBUG", "loadDiscoverMovieData Success data ---- ${it.movieResults[0].title}")
                _discoverMovieResponse.value = it
            }.onFailure {
                Log.e("DEBUG", "loadDiscoverMovieData Failure data ---- ${it.toString()}")
            }
        }
    }

    fun loadTrendingMediaData(mediaType: String, timeWindow: String){
        viewModelScope.launch {
            val result = discoverMovieRepository.fetchTrendingMedia(mediaType, timeWindow)
            result.onSuccess {
                Log.e("DEBUG", "loadTrendingMediaData Success data ---- ${it.movieResults[0].title}")
                _trendingMediaResponse.value = it
            }.onFailure {
                Log.e("DEBUG", "loadTrendingMediaData Failure data ---- ${it.toString()}")
            }
        }
    }

    fun loadSearchMovieData(query: String){
        viewModelScope.launch {
            val result = discoverMovieRepository.fetchSearchMovie(query)
            result.onSuccess {
                Log.e("DEBUG", "loadSearchMovieData Success data ---- ${it.movieResults[0].title}")
                _searchMovieResponse.value = it
            }.onFailure {
                Log.e("DEBUG", "loadSearchMovieData Failure data ---- ${it.toString()}")
            }
        }
    }
}