package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ssc on 2018/3/25.
 */

public class Weather {

    public Basic basic;

    public String status;

    public Now now;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

    public AQI aqi;

    public Suggestion suggestion;

}
