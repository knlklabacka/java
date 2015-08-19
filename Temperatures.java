package com.malko;

import java.util.*;

/**
 * Created by MDK177 on 8/19/2015.
 */
public class Temperatures {
    public static void main(String[] args){
        Thermometer city1, city2, city3;
        double temp1, temp2, temp3;

        city1 = new Thermometer();
        city2 = new Thermometer();
        city3 = new Thermometer();

        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.print("Enter the temperature of city1: ");
        temp1 = scanner.nextDouble();
        city1.setTemperature(temp1);

        System.out.print("Enter the temperature of city2: ");
        temp2 = scanner.nextDouble();
        city2.setTemperature(temp2);

        System.out.print("Enter the temperature of city3: ");
        temp3 = scanner.nextDouble();
        city3.setTemperature(temp3);

        if(city1.getTemperature() > city2.getTemperature() && city1.getTemperature() > city3.getTemperature())
            System.out.println("City1 is the hottest city.");
        else
            if(city2.getTemperature() > city1.getTemperature() && city2.getTemperature() > city3.getTemperature())
                System.out.println("City2 is the hottest city.");
            else
                if(city3.getTemperature() > city1.getTemperature() && city3.getTemperature() > city2.getTemperature())
                    System.out.println("City3 is the hottest city.");
    }
}
