package com.freshlybakedandroid.feature.home.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
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

    lateinit var mBinding : FragmentHomeBinding
//    lateinit var mDiscoverMovieViewModel: DiscoverMovieViewModel
    private val mDiscoverMovieViewModel: DiscoverMovieViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

        initViews()
        return mBinding.root
    }

    private fun initViews() {
        mDiscoverMovieViewModel.loadDiscoverMovieData(1)
    }

}