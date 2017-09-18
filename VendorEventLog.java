package com.company;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Emil on 2017-09-15.
 */
public class VendorEventLog extends EventLog {

    EventLog eventLog1 = new EventLog();

    //Vem ska vara observer?

    public void madePurchase(Product product, Costumer costumer){
        try {
            PrintWriter writer = new PrintWriter(new FileOutputStream(new File("VendorEventLog.txt"), true));
            writer.println("Costumer by name: "+costumer.getName()+" ID: "+costumer.getId()+" has made the following purchase:");
            writer.println(product.getName());
            writer.println(product.getQuantity());
            writer.println(product.getPurchaseDate());
            writer.println("-----------------------END OF LOG--------------------------");
            writer.close();

            String message = costumer.getId()+", new purchase";
            setChanged();
            notifyObservers(message);
        } catch (IOException e) {
            // do something, notify an exception log?
        }
    }


}
