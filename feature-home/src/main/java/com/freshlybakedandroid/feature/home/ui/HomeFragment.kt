package com.freshlybakedandroid.feature.home.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.freshlybakedandroid.core.model.DiscoverMovieResponse
import com.freshlybakedandroid.feature.home.R
import com.freshlybakedandroid.feature.home.databinding.FragmentHomeBinding
import com.freshlybakedandroid.feature.home.viewmodel.DiscoverMovieViewModel
import dagger.hilt.android.AndroidEntryPoint


/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
@AndroidEntryPoint
class HomeFragment : Fragment() {

    private lateinit var mBinding : FragmentHomeBinding
    private val mDiscoverMovieViewModel: DiscoverMovieViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

        initViews()
        return mBinding.root
    }

    private fun initViews() {
        Log.e("DEBUG", "initViews --->>")
        mDiscoverMovieViewModel.loadDiscoverMovieData(1)
        mDiscoverMovieViewModel.discoverMovieResponse.observe(viewLifecycleOwner, Observer<DiscoverMovieResponse?> {
            Log.e("DEBUG", "response in UI -- ${it.movieResults.get(0).title}")

//            it.movieResults
        })

        mDiscoverMovieViewModel.loadTrendingMediaData("all", "day" )
        mDiscoverMovieViewModel.trendingMediaResponse.observe(viewLifecycleOwner) {
            Log.e("DEBUG", "Trending Media Data ${it.movieResults.get(0).title}")
        }

        mDiscoverMovieViewModel.loadSearchMovieData("john wick")
        mDiscoverMovieViewModel.searchMovieResponse.observe(viewLifecycleOwner) {
            Log.e("DEBUG", "Search Movie Data ${it.movieResults.get(0).title}")
        }
    }
}