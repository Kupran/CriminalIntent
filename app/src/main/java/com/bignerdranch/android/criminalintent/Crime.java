package com.bignerdranch.android.criminalintent;

import java.util.Date;
import java.util.UUID;

public class Crime {
    private Date mDate;
    private String mSuspect;

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean pSolved) {
        mSolved = pSolved;
    }

    public String getSuspect() {
        return mSuspect;
    }

    public void setSuspect(String suspect) {
        mSuspect = suspect;
    }

    public String getPhotoFilename() {
        return "IMG_" + getId().toString() + ".jpg";
    }

    private boolean mSolved;

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date pDate) {
        mDate = pDate;
    }

    public UUID getID() {

        return mID;
    }

    private UUID mID;

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String pTitle) {
        mTitle = pTitle;
    }

    private String mTitle;



    public Crime() {

        this(UUID.randomUUID());
    }

    public Crime(UUID id) {
        mID = id;
        mDate = new Date();
    }

    public UUID getId() {
        return mID;
    }

    public int size() {
        return 0;
    }

    public Crime get(int pPosition) {
        return null;
    }
}
