package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.util.List;

/**
 * Created by Justyna on 14.01.2018.
 */

public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {


    private static final String LOG_TAG = EarthquakeLoader.class.getName();
    private String mUrl;

    public EarthquakeLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }



    @Override
    protected void onStartLoading() {
        forceLoad();
        Log.i(LOG_TAG, "TEST: startLoading() called");

    }

    @Override
    public List<Earthquake> loadInBackground() {
        if (mUrl == null) {
            return null;
        }


        List<Earthquake> earthquakes = QueryUtils.fetchEarthquakeData(mUrl);
        Log.i(LOG_TAG, "TEST: loadInBackground() called");
        return earthquakes;

    }
}
