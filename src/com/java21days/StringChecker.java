package com.java21days;

public class StringChecker {

    public static void main(String[] args)
    {
        int accountBalance = 5500;
        System.out.format("Balance: $%,d%n", accountBalance);
        System.out.printf("Balance: $%,d%n", accountBalance);
        
        double pi = Math.PI;
        System.out.printf("Pi to the 11th digit: %.12f%n", + pi);
        
        Integer newNum = new Integer(5567);
        int newInt = newNum.intValue();
        System.out.println(newInt);
        String newInt2 = newNum.toString();
        System.out.println(newInt2);
        String strNumber = "100";
        int strToNumber = Integer.parseInt(strNumber);
        System.out.println(strToNumber);
        int findVal = Integer.valueOf(strNumber);
        System.out.println(findVal);
        System.out.println(strNumber.getClass().getName());
        Object obiwan = new Object();
        boolean check1 = obiwan instanceof String;
        System.out.println(check1);
        
        String str = "A Lannister always pays his debts";
        System.out.println("The string is: " + str);
        System.out.println("The length of this string is: " + str.length() + " characters");
        System.out.println("The character at position 6: " + str.charAt(6));
        System.out.println("The substring from 12 to 18: " + str.substring(12, 18));
        System.out.println("The index of the secondd 't': " + str.indexOf('t', str.indexOf('t') + 1));
        System.out.println("The index of the beginning of the "
                + "substring \"debts\": " + str.indexOf("debts"));
        System.out.println("The string in uppercase: " + str.toUpperCase());
    }

}
