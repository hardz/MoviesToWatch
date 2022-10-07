package com.freshlybakedandroid.core.data.di

import com.freshlybakedandroid.core.data.repository.DiscoverMovieRepository
import com.freshlybakedandroid.core.data.repository.DiscoverMovieRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class DataModule {
    @Binds
    abstract fun discoverMovieRepo(
        discoverMovieRepositoryImpl: DiscoverMovieRepositoryImpl
    ): DiscoverMovieRepository
}