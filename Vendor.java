package com.company;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Emil on 2017-09-15.
 */
//A seller with unique fields, that has costumers and its own event log
public class Vendor extends User implements Observer {
    private ArrayList<Costumer> costumers;
    private VendorEventLog vendorEventLog;

    public Vendor(int id, String name, String adress){
        this.setId(id);
        this.setName(name);
        this.setAddress(adress);
        costumers = new ArrayList<>();
    }

    public ArrayList<Costumer> getCostumers() {
        return costumers;
    }

    public void addCostumer(Costumer costumer) {
        this.costumers.add(costumer);
    }

    public VendorEventLog getVendorEventLog() {
        return vendorEventLog;
    }

    public void setVendorEventLog(VendorEventLog vendorEventLog) {
        this.vendorEventLog = vendorEventLog;
    }

    @Override
    public void update(Observable o, Object arg) {
        String message = (String) arg;
        System.out.println("OBSERVED --- "+message);
    }
}
