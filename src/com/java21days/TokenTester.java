package com.java21days;

import java.util.StringTokenizer;

public class TokenTester {

    public static void main(String[] args)
    {
        StringTokenizer st1;
        StringTokenizer st2;
        StringTokenizer birthdayString;
        
        String birthday = "06/08/1989";
        birthdayString = new StringTokenizer(birthday, "/");
        while(birthdayString.hasMoreTokens()) {
            System.out.println("Printing out tokens from B-day:" 
                                + birthdayString.nextToken());
        }
        
        String month = birthday.substring(0, 2);
        String day = birthday.substring(3, 5);
        String year = birthday.substring(6, 10);
        System.out.println("Birthday month: " + month);
        System.out.println("Birthday day: " + day);
        System.out.println("Birthday year: " + year);
        
        String quote1 = "GOOG 530.80 -9.98";
        st1 = new StringTokenizer(quote1);
        System.out.println("Token 1: " + st1.nextToken());
        System.out.println("Token 2: " + st1.nextToken());
        System.out.println("Token 3: " + st1.nextToken());
        
        String quote2 = "RHT@75.00@0.22";
        st2 = new StringTokenizer(quote2, "@");
        while(st2.hasMoreTokens()) {
            System.out.print("\nToken1: " + st2.nextToken());
        }      
    }

}
