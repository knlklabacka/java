package com.malko;

/**
 * Created by MDK177 on 8/19/2015.
 */
public class Thermometer {
    // Declare variables
    private double temperature;

    // Constructor
    public Thermometer(){
        temperature = 0.0;
    }

    // Accessor
    public double getTemperature(){
        return temperature;
    }

    // Mutator
    public void setTemperature(double inTemperature){
        temperature = inTemperature;
    }
}
