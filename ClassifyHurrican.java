package com.malko;

import java.util.*;

/**
 * Created by MDK177 on 8/19/2015.
 */
public class ClassifyHurrican {
    public static void main(String[] args){
        // declare variables
        int windSpeed;
        Scanner scanner;
        scanner = new Scanner(System.in);

        // Input wind speed
        System.out.print("Enter the wind speed (mph): ");
        windSpeed = scanner.nextInt();

        // Determine the category
        if(windSpeed > 155)
            System.out.println("The hurricane is category 5.");
        else
            if(windSpeed >= 131)
                System.out.println("The hurricane is category 4.");
            else
                if(windSpeed >= 111)
                    System.out.println("The hurricane is category 3.");
                else
                    if(windSpeed >= 96)
                        System.out.println("The hurricane is category 2.");
                    else
                        if(windSpeed >= 74)
                            System.out.println("The hurricane is category 1.");
                        else
                            if(windSpeed >= 0)
                                System.out.println("Not a hurricane.");
                            else
                                System.out.println("Invalid wind speed.");
    }
}
