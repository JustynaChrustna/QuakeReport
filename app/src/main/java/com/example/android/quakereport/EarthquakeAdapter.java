package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Justyna on 04.12.2017.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {


    public EarthquakeAdapter(Context context, ArrayList<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }
        Earthquake currentEarthquake= getItem(position);
        TextView magnitudeTextView= (TextView) listItemView.findViewById(R.id.magnitude);
        magnitudeTextView.setText(currentEarthquake.getmMagnitude());
        TextView locationTextView= (TextView) listItemView.findViewById(R.id.location);
        locationTextView.setText(currentEarthquake.getmLocation());
        TextView dateTextView= (TextView) listItemView.findViewById(R.id.date);
        Date dateObject =new Date(currentEarthquake.getmTimeInMilliseconds());
        String formattedDate=formatDate(dateObject);
        dateTextView.setText(formattedDate);
        TextView timeView= (TextView) listItemView.findViewById(R.id.time);
        String formattedTime=formatTime(dateObject);
        timeView.setText(formattedTime);

        return listItemView;
    }
    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }
    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }
}
