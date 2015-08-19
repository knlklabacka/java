package com.malko;

/**
 * Created by MDK177 on 8/18/2015.
 */
public class Circle {
    // Data member
    private double radius;

    // Constructor
    public Circle(){
        radius = 0.0;
    }

    // Mutator
    public void setRadius(double inRadius){
        radius = inRadius;
    }

    // Calculate radius
    public double computeArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    // Accessor
    public double getRadius(){
        return radius;
    }
}
