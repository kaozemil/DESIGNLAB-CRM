package com.company;

import java.util.Date;

/**
 * Created by Emil on 2017-09-15.
 */
public class Product {
    private String name;
    private int quantity;
    private Date purchaseDate;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

}
