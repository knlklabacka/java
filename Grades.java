package com.malko;

/**
 * Created by MDK177 on 8/20/2015.
 */
public class Grades {
    // declare variables

    private int numA, numB, numC, numD, numF, count;

    // constructor
    public Grades(){
        numA = 0;
        numB = 0;
        numC = 0;
        numD = 0;
        numF = 0;
    }

    // Methods
    public void enterGrade(int score){
        if(score >= 0 && score <= 100){
            count++;
            if(score < 60)
                numF++;
            else
                if(score < 70)
                    numD++;
                else
                    if(score < 80)
                        numC++;
                    else
                        if(score < 90)
                            numB++;
                        else
                            numA++;

        }
    }

    public int getNumStudents(char grade){
       int numStudents;
        switch(grade){
            case 'A': numStudents = numA;
                      break;
            case 'B': numStudents = numB;
                      break;
            case 'C': numStudents = numC;
                      break;
            case 'D': numStudents = numD;
                      break;
            case 'F': numStudents = numF;
                      break;
            default:  numStudents = -1;
        }
        return numStudents;
    }

    public double getPercent(char grade){
        double percent;
        switch(grade){
            case 'A': percent = 100.0*numA/count;
                break;
            case 'B': percent = 100.0*numA/count;
                break;
            case 'C': percent = 100.0*numA/count;
                break;
            case 'D': percent = 100.0*numA/count;
                break;
            case 'F': percent = 100.0*numA/count;
                break;
            default: percent = -1;
        }
        return percent;
    }

}
