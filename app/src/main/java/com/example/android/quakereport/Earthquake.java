package com.example.android.quakereport;

/**
 * Created by Justyna on 04.12.2017.
 */

public class Earthquake {
    private String mMagnitude;



    private String mLocation;
    private String mDate;
    public Earthquake(String magnitude, String location, String date ){
        mMagnitude=magnitude;
        mLocation=location;
        mDate=date;
    }
    public String getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public String getmDate() {
        return mDate;
    }


}
