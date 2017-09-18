package com.company;

/**
 * Created by Emil on 2017-09-15.
 */
public class CostumerWeatherResearch implements WeatherSummary {
    private String currentWeather;

    public CostumerWeatherResearch(){

    }

    @Override
    public String currentWeatherSummary(double latitude, double longitude) {
        //todo: current weather download via coords blabla
        currentWeather = "12N, 2m/s";
        return this.currentWeather;
    }
}
