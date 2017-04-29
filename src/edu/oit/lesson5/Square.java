package edu.oit.lesson5;

public class Square extends Shape {
    private int sides = 4;
    private int width;

    @Override
    public double geArea() {
        // TODO Auto-generated method stub
        return calculateArea();
    }
    
    public int calculateArea() {
        return width * width;
    }
}
