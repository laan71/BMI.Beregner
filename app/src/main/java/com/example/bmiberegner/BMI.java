package com.example.bmiberegner;
public class BMI {

    public static double calc(double weight, double height) {
        double heightT2=height*height;
       return weight/(heightT2);

    }
}
