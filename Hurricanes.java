package com.malko;

import java.util.*;

/**
 * Created by MDK177 on 8/19/2015.
 */
public class Hurricanes {
    public static void main(String[] args){
        // Declare variables
        Hurricane hurricane1, hurricane2;
        int windSpeed;
        Scanner scanner;
        hurricane1 = new Hurricane();
        hurricane2 = new Hurricane();
        scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter the wind speed (hurricane1): ");
        windSpeed = scanner.nextInt();
        hurricane1.setWindSpeed(windSpeed);
        hurricane1.setCategroy();

        System.out.print("Enter the wind speed (hurricane2): ");
        windSpeed = scanner.nextInt();
        hurricane2.setWindSpeed(windSpeed);
        hurricane2.setCategroy();

        // Output
        System.out.println("Hurricane1 is category " + hurricane1.getCategory());
        System.out.println("Hurricane2 is category " + hurricane2.getCategory());

        // Compare
        if(hurricane1.getCategory() > hurricane2.getCategory())
            System.out.print("Hurricane1 is stronger.");
        else
            System.out.print("Hurricane2 is stronger");
    }
}
