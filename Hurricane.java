package com.malko;

/**
 * Created by MDK177 on 8/19/2015.
 */
public class Hurricane {
    // Data member
    private int windSpeed;
    private int category;

    // Constructor
    public Hurricane(){
        category = 0;
        windSpeed = 0;
    }

    // mutator
    public void setWindSpeed(int inWindSpeed){
        windSpeed = inWindSpeed;
    }

    public void setCategroy(){
        if(windSpeed > 155)
            category = 5;
        else
            if(windSpeed >= 131)
                category = 4;
            else
                if(windSpeed >= 111)
                    category = 3;
                else
                    if(windSpeed >= 96)
                        category = 2;
                    else
                        if(windSpeed >= 74)
                            category = 1;
    }

    // Accessor
    public int getWindSpeed(){
        return windSpeed;
    }

    public int getCategory(){
        return category;
    }
}
