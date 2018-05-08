package com.sturc.Observer;

import com.sturc.Observer.Displays.CurrentConditionsDisplay;
import com.sturc.Observer.Displays.ForecastDisplay;
import com.sturc.Observer.Displays.HeatIndexDisplay;
import com.sturc.Observer.Displays.StatisticsDisplay;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(30, 10, 700);
        weatherData.setMeasurements(32, 20, 670);
        weatherData.setMeasurements(35, 30, 650);
    }
}
