package com.company;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import java.util.function.Supplier;

public class SupplierClass  {



    public void currentTime() {

        Supplier<Timestamp> currentTime = () -> new Timestamp(System.currentTimeMillis());
        System.out.println("Current date => " + currentTime.get());
    }
}
