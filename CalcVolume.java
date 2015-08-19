package com.malko;

import java.util.*;

/**
 * Created by MDK177 on 8/18/2015.
 */
public class CalcVolume {
    public static void main(String[] args){
        // declare variables
        double radius, height, innerRadius;
        Cone cone;
        HollowCylinder hollowCylinder;
        Scanner scanner;
        cone = new Cone();
        hollowCylinder = new HollowCylinder();
        scanner = new Scanner(System.in);

        // Input
        System.out.println("Input for the cone");
        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();
        System.out.print("Enter the height: ");
        height = scanner.nextDouble();
        System.out.println();
        cone.setRadius(radius);
        cone.setHeight(height);

        System.out.println("Input for the hollow cylinder");
        System.out.print("Enter the inner radius: ");
        innerRadius = scanner.nextDouble();
        System.out.print("Enter the outer radius: ");
        radius = scanner.nextDouble();
        System.out.print("Enter the height: ");
        height = scanner.nextDouble();
        hollowCylinder.setInnerRadius(innerRadius);
        hollowCylinder.setOuterRadius(radius);
        hollowCylinder.setHeight(height);

        System.out.print("The volume of the cone with a radius of ");
        System.out.printf("%.2f cm and a height of %.2f cm is %.2f cubic cm", radius, height, cone.computeVolume());
        System.out.println();
        System.out.print("The volume of the hollow cylinder with a inner radius of ");
        System.out.printf("%.2f cm, an outer radius of %.2f cm, and a height of %.2f cm is %.2f cubic cm", innerRadius, radius, height, hollowCylinder.computeVolume());
    }
}
