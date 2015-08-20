package com.malko;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here

        //System.out.println("Hello World!");
        //System.out.println("Learning Java!");

        /* // Leah and dad coding
        String name;
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.print("Enter an animal");
        name = scanner.nextLine();
        System.out.println("Hello you " + name);
        */

       /* // Chpt1 QuadEq
        double a, b, c, root1, root2, sqrtDiscr;
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.print("Enter a");
        a = scanner.nextDouble();
        System.out.print("Enter b");
        b = scanner.nextDouble();
        System.out.print("Enter c");
        c = scanner.nextDouble();

        sqrtDiscr = Math.sqrt(Math.pow(b,2) - 4*a*c);
        root1 = (-b + sqrtDiscr) / (2*a);
        root2 = (-b - sqrtDiscr) / (2*a);

        System.out.println();
        System.out.println("Two roots of the equation, " + a + "*x*x + " + b + "*x + " + c + " = 0, are");
        System.out.printf("%.2f and %.2f.", root1, root2);
        */

        /*// Chpt 1 Ex 6
        System.out.println("**    **");
        System.out.println("**    **");
        System.out.println("  ****  ");
        System.out.println("  ****  ");
        System.out.println("  ****  ");
        System.out.println("  ****  ");
        System.out.println("**    **");
        System.out.println("**    **");
        */

        /*// Chpt 1 Ex 5
        System.out.println("alpha");
        System.out.println();
        System.out.print(" beta");
        System.out.println(" gamma");
        */

        /*// Chpt1 Ex 7
        int value1 = 5;
        int value2 = 9;
        int value3 = 4;

        value1 = value2;
        value2 = value3;
        value3 = value1;
        */

        /*// Chpt1 Ex 8a
        double value4, x, y, z;
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.print("Enter x");
        x = scanner.nextDouble();
        System.out.print("Enter y");
        y = scanner.nextDouble();
        System.out.print("Enter z");
        z = scanner.nextDouble();

        value4 = 49*Math.pow(x, 15.0)/y+z;
        System.out.printf("%.2f", value4);
        */

        // Chpt1 Ex 8b
        //double s = r*Math.PI * Math.sqrt(Math.pow(r,2) + Math.pow(h,2));

        /*// Chpt 1 Ex
        double x;
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        x = scanner.nextDouble();
        System.out.println("Two to the power of " + x + " is " + Math.pow(2, x));
        */

       /* // Chapter 4 Ex 3
       int sum;
       int count;
       sum = 0;
       count =1 ;
       while(sum < 10){
         sum = sum + count;
         count++;
         System.out.println("sum = " + sum);
         System.out.println("count = " + count);
       }
       System.out.println("sum = " + sum);
       System.out.println("count = " + count);
       */

        /* // Chapter 4 Ex 4
       int sum = 2;
       int number = 3;
       do{
         sum = sum + number;
         number++;
         System.out.println("sum = " + sum);
         System.out.println("number = " + number);
       }while(sum < 3*number);
       System.out.println("sum = " + sum);
       System.out.println("sum = " + sum);
       */

       /*// Chapter 4 Ex 5
       int outer = 1;
       while(outer < 4){
          int inner = 1;
          while(inner <= outer){
            System.out.println("outer is " + outer + " inner is " + inner);
            inner += 3;
          }
        outer += 2;
        System.out.println("outer is " + outer + " inner is " + inner);
       }
      */

      /*// Chapter 4 Ex 6
      int i, j;
      for(i = 1; i <= 5; i++){
        for(j = 1; j <= 5-i; j++)
           System.out.print(" ");

        for(j = 1; j <= 2*i; j++)
           System.out.print("*");
      System.out.println();
     }*/

     int i;

     System.out.println("Original Price 30% off 50% off 70% off");

     for(i = 5; i <= 50; i+=5){
        double cost;
        cost = i;

        System.out.printf("%10.2f %10.2f %7.2f %7.2f", cost, cost *.7, cost *.5, cost *.3);
        System.out.println();
     }

    }
}
