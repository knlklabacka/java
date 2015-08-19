package com.malko;

import java.util.*;

/**
 * Created by MDK177 on 8/18/2015.
 */
public class CalcAreaCircle {
    public static void main(String[] args){
        // Declare variables
        double radius;
        Circle circle;
        Scanner scanner;
        circle = new Circle();
        scanner = new Scanner(System.in);

        // Input radius
        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();
        circle.setRadius(radius);

        // Compute and output
        System.out.println();
        System.out.print("The area of the circle with a radius of");
        System.out.printf(" %.2f cm is %.2f", radius, circle.computeArea());
        System.out.println(" square cm.");
    }
}
