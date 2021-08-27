/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Turner
 */
package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class App 
{
    public static void formulateMessage(int ftSq, double mSq)
    {
        DecimalFormat three = new DecimalFormat("#0.000");
        System.out.println("The area is \n" + ftSq + " square feet\n" + three.format(mSq) + " square meters");
    }

    public static void calcMeasurements(Map<String, Integer> measurements)
    {
        int ftSq = measurements.get("width") * measurements.get("length");
        double mSq = ftSq * 0.0929;
        formulateMessage(ftSq, mSq);
    }

    public static void getMeasurements()
            throws IOException
    {
        Map<String, Integer> measurements = new HashMap<>();
        System.out.println("What is the length of the room in feet? ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        measurements.put("length", Integer.parseInt(reader.readLine()));

        System.out.println("What is the width of the room in feet? ");
        measurements.put("width", Integer.parseInt(reader.readLine()));
        System.out.println("You entered the dimensions of " + measurements.get("length") +" feet by "
        + measurements.get("width") + " feet.");
        calcMeasurements(measurements);
    }

    public static void main( String[] args ) throws IOException {

        getMeasurements();
    }
}
