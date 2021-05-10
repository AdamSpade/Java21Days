package com.java21days;

public class Dimensions {

    int height;
    int weight;
    int depth;
    
    public static void main(String[] args)
    {  
        Dimensions dimensionObj = new Dimensions();
        dimensionObj.setHeight(100);
        dimensionObj.setWeight(200);
        dimensionObj.setDepth(150);
        
        System.out.println("Height is: " + dimensionObj.getHeight() + "ft.");
        System.out.println("Weight is: " + dimensionObj.getWeight() + "lbs.");
        System.out.println("Depth is: " + dimensionObj.getDepth() + " what ever unit is used to measure depth :P.");
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public int getWeight()
    {
        return weight;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    public int getDepth()
    {
        return depth;
    }

    public void setDepth(int depth)
    {
        this.depth = depth;
    } 
}
