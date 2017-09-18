package com.company;

/**
 * Created by Emil on 2017-09-18.
 */

//NOT IN USE ATM
public class Transaction {
    private Costumer costumer;
    private Vendor vendor;
    private Product product;

    public Transaction(Costumer costumer, Vendor vendor, Product product){
        this.costumer = costumer;
        this.vendor = vendor;
        this.product = product;
    }

    public void purchaseMade(){

    }
}
