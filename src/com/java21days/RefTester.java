package com.java21days;

import java.awt.Point;

public class RefTester {

    public static void main(String[] args)
    {
        Point pt1;
        Point pt2;
        
        pt1 = new Point(100, 100);
        pt2 = pt1;
        
        pt1.setLocation(200, 200);
        System.out.println("Point1: " + pt1.getX() + ", " + pt1.getY());
        System.out.println("Point2: " + pt2.getX() + ", " + pt2.getY());
       
    }
}
