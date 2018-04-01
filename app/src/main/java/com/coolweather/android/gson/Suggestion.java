package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ssc on 2018/3/25.
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    public Sport sport;

    @SerializedName("cw")
    public CarWash carWash;

    public class Comfort {

        @SerializedName("txt")
        public String info;

    }

    public class Sport {

        @SerializedName("txt")
        public String info;

    }

    public class CarWash {

        @SerializedName("txt")
        public String info;

    }
}
