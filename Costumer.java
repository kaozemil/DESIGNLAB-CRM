package com.company;

import java.util.ArrayList;

/**
 * Created by Emil on 2017-09-15.
 */
//A costumer with unique fields, that has an event log and location specifiers
public class Costumer extends User {
    private int longitude;
    private int latitude;
    private ArrayList<Vendor> vendors;

    public Costumer(int longitude, int latitude){
        this.longitude = longitude;
        this.latitude = latitude;
    }


    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

}
