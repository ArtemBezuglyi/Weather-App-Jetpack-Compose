package ru.artbez.composeweathermvi.domain.repository

import ru.artbez.composeweathermvi.domain.util.Resource
import ru.artbez.composeweathermvi.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}