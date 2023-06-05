package ru.artbez.composeweathermvi.data.repository

import ru.artbez.composeweathermvi.data.mappers.toWeatherInfo
import ru.artbez.composeweathermvi.data.remote.WeatherApi
import ru.artbez.composeweathermvi.domain.repository.WeatherRepository
import ru.artbez.composeweathermvi.domain.util.Resource
import ru.artbez.composeweathermvi.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi
): WeatherRepository {
    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    long = long
                ).toWeatherInfo()
            )
        } catch (e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred.")
        }
    }

}