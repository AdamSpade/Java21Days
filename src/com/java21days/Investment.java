package com.java21days;

public class Investment {

    public static void main(String[] args)
    {
        double amount = 14_000;
        returnInvestment(amount);
    }
    
    public static double returnInvestment(double startingAmount) {
        startingAmount += (startingAmount * 0.40);
        System.out.printf("%.2f\n", startingAmount);
        startingAmount -= 1500;
        System.out.printf("%.2f\n", startingAmount);
        startingAmount += (startingAmount * 0.12);
        System.out.printf("%.2f\n", startingAmount);
        return startingAmount;
    }

}
