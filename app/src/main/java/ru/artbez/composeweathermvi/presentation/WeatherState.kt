package ru.artbez.composeweathermvi.presentation

import ru.artbez.composeweathermvi.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
