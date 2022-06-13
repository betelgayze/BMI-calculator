package com.hillel.bmi;

public class CalculateBMI {

    public String calculate(int weight, float height) {
        float bmi = weight /
                (height * height);
        String result;

        if ((weight <= 0) || (weight >= 500)) {
            result = "Weight has to be more than 0 and less than 500 kg";}
        else {
            if((height <= 0) || (height >=2.5)) {
                result = "Height has to be more than 0 and less than 2.5 m";}
            else {
                if (bmi < 18.5) {
                    result = bmi + "\n" + "Underweight" ;}
                else
                    if ((bmi >= 18.5) && (bmi < 25)) {
                    result = bmi + "\n" + "Normal weight";}
                    else
                        if (bmi >= 25) {
                    result = bmi + "\n" + "Overweight";}
                        else result = null;

            }
        }
        return result;

    }
}