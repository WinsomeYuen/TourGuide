package com.example.winsome.tourguide;

import android.util.Log;

public class Attraction {
    private String mTitle;
    private String mLocation;
    private int mResourceImageId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private String mDescription;

    public Attraction(String title, String location, String description) {
        mTitle = title;
        mLocation = location;
        mDescription = description;
    }

    public Attraction(String title, String location, int imageId, String description) {
        mTitle = title;
        mLocation = location;
        mResourceImageId = imageId;
        mDescription = description;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmLocationn() {return mLocation;}

    public int getmResourceImageId() {
        return mResourceImageId;
    }

    public boolean hasImage() {
        return mResourceImageId != NO_IMAGE_PROVIDED;
    }

    public String getmDescription() { return mDescription; }

}
