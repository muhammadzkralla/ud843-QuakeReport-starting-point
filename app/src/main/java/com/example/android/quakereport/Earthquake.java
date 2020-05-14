package com.example.android.quakereport;

public class Earthquake {

    // variable to store earthquake information
    private String mLocation;
    /** Time of the earthquake */
    private long mTimeInMilliseconds;
    private double mMagnitude;
    private String mUrl;




    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }
    //getter Function

    /**
     * Returns the magnitude of the earthquake.
     */
    public double getMagnitude() {
        return mMagnitude;
    }

    // return the location of the earthquake
    public String getLocation() {
        return mLocation;
    }


    /**
     * Returns the time of the earthquake.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }




}
