package com.example.android.quakereport;

/**
 * Created by Justyna on 04.12.2017.
 */

public class Earthquake {
    private String mMagnitude;



    private String mLocation;
    private long mTimeInMilliseconds;
    public Earthquake(String magnitude, String location, long date ){
        mMagnitude=magnitude;
        mLocation=location;
        mTimeInMilliseconds=date;
    }
    public String getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public long getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }


}
