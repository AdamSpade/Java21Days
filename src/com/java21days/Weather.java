package com.java21days;

public class Weather {

    public static void main(String[] args)
    {
        float fah = 86;
        System.out.println(fah + " degrees Fahrenheit is ...");
        
        // To convert Fahrenheit into Celsius
        // begin by subtracting 32
        fah -= 32;
        
        // Divide the return value by 9
        fah /= 9;
        
        // Multiply the return value by 5
        fah *= 5;
        
        System.out.println(fah + " degrees Celsius\n");
        
        float cel = 33;
        System.out.println(cel + " degrees Celsius is ...");
        
        // To convert Celsius to Fahrenheit
        // begin by multiplying by 9
        cel *= 9;
        
        // Divide the return value by 5
        cel /= 5;
        
        // Add 32 to the return value
        cel += 32;
        System.out.println(cel + " degrees Fahrenheit");
        
    }

}
