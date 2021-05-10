package com.java21days;

public class Variables {

    public static void main(String[] args)
    {
        final char UP = 'U';
        byte initialLevel = 12;
        short location = 13250;
        int score = 3500100;
        boolean newGame = true;
        int x = 42;
        int y = x++;
        int z = ++x;
        System.out.println(x + "\n" + y + "\n" + z);
        
        System.out.println("Level: " + initialLevel);
        System.out.println("Up: " + UP); 
    }

}
