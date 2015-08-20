package com.malko;

import java.util.*;

/**
 * Created by MDK177 on 8/20/2015.
 */
public class Scores {
    public static void main(String[] args){
        // Declare variables
        int score, highestScore, count;
        double sum;
        Scanner scanner;
        highestScore = 0;
        count = 0;
        sum = 0.0;
        scanner = new Scanner(System.in);

        //priming read
        System.out.print("Enter a score or -1 to stop: ");
        score = scanner.nextInt();
        if(score == -1)
            System.out.println("No scores were entered.");
        else{
            // loop to enter scores
            highestScore = score;
            while(score != -1){
                if(highestScore < score)
                    highestScore = score;
                count++;
                sum += score;
                System.out.print("Enter a scope or -1 to stop; ");
                score = scanner.nextInt();
            }

            // compute and output average and highest score
            System.out.println();
            System.out.printf("Average score is %.2f.", sum/count);
            System.out.println();
            System.out.println("The high score is " + highestScore + ".");
        }
    }
}
