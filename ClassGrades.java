package com.malko;

import java.util.*;

/**
 * Created by MDK177 on 8/20/2015.
 */
public class ClassGrades {
    public static void main(String[] args){
        // declare variables
        Grades class1;
        int score;
        char letter;
        Scanner scanner;
        class1 = new Grades();
        scanner = new Scanner(System.in);

        //priming read
        System.out.print("Enter a score or -1 to stop: ");
        score = scanner.nextInt();

        if(score == -1)
            System.out.println("No scores were entered.");
        else{
            // loop to enter scores
            while(score != -1){
                class1.enterGrade(score);
                System.out.print("Enter a score or -1 to stop: ");
                score = scanner.nextInt();
            }

            // print distribution and percent
            System.out.println();
            System.out.println("Grade Distribution Percent(%)");
            for(letter = 'A'; letter < 'E'; letter++){
                System.out.printf("%3c %6d %7.1f", letter, class1.getNumStudents(letter), class1.getPercent(letter));
                System.out.println();
            }

            System.out.printf("%3c %6d %7.1f", 'F', class1.getNumStudents('F'), class1.getPercent('F'));
            System.out.println();
        }

    }
}
