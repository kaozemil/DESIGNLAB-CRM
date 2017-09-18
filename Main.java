package com.company;

public class Main {

    public static void main(String[] args) {



        Costumer costumer1 = new Costumer(2, 2);
        costumer1.setId(1234);
        costumer1.setName("Emil");
        costumer1.setAddress("Fleminggatan 35");


        Costumer costumer2 = new Costumer(4, 5);
        costumer2.setId(5555);
        costumer2.setName("Herp");
        costumer2.setAddress("Gatan 4");


        Product product1 = new Product("Apple", 6);

        Vendor vendor1 = new Vendor(1111, "john", "doucheSteet 3");
        vendor1.addCostumer(costumer1);
        vendor1.addCostumer(costumer2);
        VendorEventLog vendorEventLog1 = new VendorEventLog(vendor1);
        vendorEventLog1.addObserver(vendor1);

        Vendor vendor2 = new Vendor(2222, "Frubadub", "HerpiderpAvenue 82");
        vendor2.addCostumer(costumer2);
        VendorEventLog vendorEventLog2 = new VendorEventLog(vendor2);



        vendorEventLog1.madeASale(product1, costumer1);
        vendorEventLog1.hasModifiedACostumer(costumer1, vendor1);


    }
}
