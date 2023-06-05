package ru.artbez.composeweathermvi.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.artbez.composeweathermvi.data.location.DefaultLocationTracker
import ru.artbez.composeweathermvi.data.repository.WeatherRepositoryImpl
import ru.artbez.composeweathermvi.domain.location.LocationTracker
import ru.artbez.composeweathermvi.domain.repository.WeatherRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindWeatherRepository(
        weatherRepositoryImpl: WeatherRepositoryImpl
    ) : WeatherRepository
}