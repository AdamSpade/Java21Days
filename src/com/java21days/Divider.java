package com.java21days;

public class Divider {

    public static void main(String[] args)
    {
        double amountOne = 15;
        double amountTwo = 6;
        divideAndModulo(amountOne, amountTwo);
        
    }
    
    public static void divideAndModulo(double one, double two) {
        double divide = one / two;
        double remainder = one%two;
        System.out.println("Result: " + divide + "\tRemainder: " + remainder);
    }

}
