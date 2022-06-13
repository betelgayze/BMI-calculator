package com.hillel.bmi;

public class Application {

    public static void main(String[] args) {
        CalculateBMI calculator = new CalculateBMI();
        float height = 1.5F;
        int weight = 50;
        String result = calculator.calculate(weight, height);

System.out.println(result);

        }
    }