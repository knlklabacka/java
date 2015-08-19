package com.malko;

/**
 * Created by MDK177 on 8/18/2015.
 */
public class Cone {
    // Declare members
    private double radius, height;

    // Constructor
    public Cone(){
        radius = 0.0;
        height = 0.0;
    }

    // Accessor
    public double getRadius(){
        return radius;
    }

    public double getHeight(){
        return height;
    }

    // Mutator
    public void setRadius(double inRadius){
        radius = inRadius;
    }

    public void setHeight(double inHeight){
        height = inHeight;
    }

    // Compute volume
    public double computeVolume(){
        return 1.0/3.0*Math.PI*Math.pow(radius,2)*height;
    }
}
