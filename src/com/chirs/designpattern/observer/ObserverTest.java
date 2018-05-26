package com.chirs.designpattern.observer;

/**
 * Created by Admin on 2018/5/26.
 */
public class ObserverTest {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        GeneralDisplay generalDisplay = new GeneralDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        Weather weather = new Weather(1f, 2f, 3f);
        weatherData.setWeather(weather);
    }
}
