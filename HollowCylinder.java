package com.malko;

/**
 * Created by MDK177 on 8/18/2015.
 */
public class HollowCylinder {
    // Declare members
    private double innerRadius, outerRadius, height;

    // Constructor
    public HollowCylinder(){
        innerRadius = 0.0;
        outerRadius = 0.0;
        height = 0.0;
    }

    public double getInnerRadius() {
        return innerRadius;
    }

    public void setInnerRadius(double innerRadius) {
        this.innerRadius = innerRadius;
    }

    public double getOuterRadius() {
        return outerRadius;
    }

    public void setOuterRadius(double outerRadius) {
        this.outerRadius = outerRadius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Compute volume
    public double computeVolume(){
        return Math.PI*height*(Math.pow(outerRadius,2) - Math.pow(innerRadius,2));
    }
}
