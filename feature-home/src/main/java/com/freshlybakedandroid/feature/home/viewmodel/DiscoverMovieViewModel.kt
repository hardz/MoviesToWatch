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

    fun loadDiscoverMovieData(page: Int){
        viewModelScope.launch {
            val result = discoverMovieRepository.fetchDiscoverMovieList(page)
            result.onSuccess {
                Log.e("DEBUG", "Success data ---- ${it.movieResults[0].title}")
                _discoverMovieResponse.value = it
            }.onFailure {
                Log.e("DEBUG", "Failure data ---- ${it.toString()}")
            }
        }
    }
}