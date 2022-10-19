package com.freshlybakedandroid.core.data.di

import com.freshlybakedandroid.core.data.repository.DiscoverMovieRepository
import com.freshlybakedandroid.core.data.repository.DiscoverMovieRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {
    @Binds
    abstract fun discoverMovieRepo(discoverMovieRepositoryImpl: DiscoverMovieRepositoryImpl): DiscoverMovieRepository
}