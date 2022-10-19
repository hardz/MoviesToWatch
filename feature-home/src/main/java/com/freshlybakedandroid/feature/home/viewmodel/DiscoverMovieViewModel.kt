package com.freshlybakedandroid.feature.home.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.freshlybakedandroid.core.data.repository.DiscoverMovieRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DiscoverMovieViewModel @Inject constructor(private val discoverMovieRepository: DiscoverMovieRepository): ViewModel() {

    fun loadDiscoverMovieData(page: Int){
        viewModelScope.launch {
            val result = discoverMovieRepository.fetchDiscoverMovieList(page)
            if (result.isSuccess) {
//                val data = result.getOrNull()
                Log.e("DEBUG", "data ---- ${result.toString()}")
                // handle data
            } else {
                // handle error case
            }
        }
    }
}