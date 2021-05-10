package com.java21days;

public class WordNumber {

    public static void main(String[] args) {

	String[] numberStringArr = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
	for(int i = 0; i < numberStringArr.length;i++) {
	    long newNumber = stringToLong(numberStringArr[i]);
	    System.out.print(newNumber);
	}
    }
    
    public static long stringToLong(String digit) {
	long longifiedDigits = 0;
	
	switch (digit) {
	case "one":
	    longifiedDigits = 1;
	    break;
	case "two":
	    longifiedDigits += 2;
	    break;
	case "three":
	    longifiedDigits += 3;
	    break;
	case "four":
	    longifiedDigits += 4;
	    break;
	case "five":
	    longifiedDigits += 5;
	    break;
	case "six":
	    longifiedDigits += 6;
	    break;
	case "seven":
	    longifiedDigits += 7;
	    break;
	case "eight":
	    longifiedDigits += 8;
	    break;
	case "nine":
	    longifiedDigits += 9;
	    break;
	case "ten":
	    longifiedDigits += 10;
	    break;
	}
	return longifiedDigits;
    }

}
