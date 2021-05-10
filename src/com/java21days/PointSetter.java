package com.java21days;

import java.awt.Point;

public class PointSetter {

    public static void main(String[] args)
    {
        Point location = new Point(4, 13);
        
        System.out.println("Starting Location: " 
                           + "\nX equals " + location.getX() 
                           + "\nY equals " + location.getY());

        System.out.println("\nMoving to (7, 6)");
        location.setLocation(7, 6);

        System.out.println("\nEnding location: "
                            + "\nX equals " + location.getX()
                            + "\nY equals " + location.getY());
    }

}
