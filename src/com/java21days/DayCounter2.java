package com.java21days;

public class DayCounter2 {
    public static void main(String[] args) {
	int months = 12;
	int year = 2021;
	for(int i = 1; i <= months; i++) {
	    month(i);	    
	    for(int j = 1; j <= countDays(i, year); j++) {
		System.out.print(j + ordinals(j) + ", ");
	    }
	    System.out.println();
	}
    }

    static String ordinals(int date) {
	String ordinal = "";
	switch (date) {
	case 1:
	case 21:
	case 31:
	    ordinal = "st";
	    break;
	case 2:
	case 22:
	    ordinal = "nd";
	    break;
	case 3:
	case 23:
	    ordinal = "rd";
	    break;
	default:
	    ordinal = "th";
	}
	return ordinal;
    }
    
    static void month(int month) {
	switch(month) {
	case 1:
	    System.out.println("January: ");
	    break;
	case 2:
	    System.out.println("February: ");
	    break;
	case 3:
	    System.out.println("March: ");
	    break;
	case 4:
	    System.out.println("April: ");
	    break;
	case 5:
	    System.out.println("May: ");
	    break;
	case 6:
	    System.out.println("June: ");
	    break;
	case 7:
	    System.out.println("July: ");
	    break;
	case 8:
	    System.out.println("August: ");
	    break;
	case 9:
	    System.out.println("September: ");
	    break;
	case 10:
	    System.out.println("October: ");
	    break;
	case 11:
	    System.out.println("November: ");
	    break;
	case 12:
	    System.out.println("December: ");
	    break;
	}
    }
    
    static int countDays(int month, int year) {
	int count = -1;
	switch (month) {
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
	    count = 31;
	    break;
	case 4:
	case 6:
	case 9:
	case 11:
	    count = 30;
	    break;
	case 2:
	    if (year % 4 == 0)
		count = 29;
	    else
		count = 28;
	    if ((year % 100 == 0) && (year % 400 != 0))
		count = 28;
	}
	return count;
    }
}
