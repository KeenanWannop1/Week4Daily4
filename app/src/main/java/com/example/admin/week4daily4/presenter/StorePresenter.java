package com.example.admin.week4daily4.presenter;

import android.location.Location;

import com.example.admin.week4daily4.model.StoreLocation;
import com.example.admin.week4daily4.model.Venue;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StorePresenter {


    public static List<Location> sortLocations(List<Location> locations, final double myLatitude, final double myLongitude) {
                final double currentLatitude = 35;
                final double currentLongitude = -80;


        Comparator comp = new Comparator<Location>() {
            @Override
            public int compare(Location o, Location o2) {
                float[] result1 = new float[3];
                Location.distanceBetween(currentLatitude, currentLongitude, o.getLatitude(), o.getLongitude(), result1);
                Float distance1 = result1[0];

                float[] result2 = new float[3];
                Location.distanceBetween(currentLatitude, currentLongitude, o2.getLatitude(), o2.getLongitude(), result2);
                Float distance2 = result2[0];

                return distance1.compareTo(distance2);
            }
        };


        Collections.sort(locations, comp);
        return locations;
    }
}
