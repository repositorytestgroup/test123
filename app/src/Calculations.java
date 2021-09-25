package com.example.lab003;

public class Calculations {
    protected double convertCelciusToFahrenheit(double value){
        double ans =(value*9/5)+32;
        return ans;
    }

    protected double convertFahrenheitToCelcius(double value){
        double ans =(value-32)*5/9;
        return ans;
    }

}
