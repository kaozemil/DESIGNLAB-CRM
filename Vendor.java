package com.company;

import java.util.ArrayList;

/**
 * Created by Emil on 2017-09-15.
 */
//A seller with unique fields, that has costumers and its own event log
public class Vendor extends User {
    private ArrayList<Costumer> costumers;
    private VendorEventLog vendorEventLog;

    public Vendor(){
    }
}
