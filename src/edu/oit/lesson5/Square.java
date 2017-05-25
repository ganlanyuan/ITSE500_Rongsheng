package edu.oit.lesson5;

public class Square extends Shape {
    private int sides = 4;
    private int width;
    
    public Square(int width) {
        this.width = width;
    }

    public Square() {
    }

    public int getSides() {
        return sides;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double geArea() {
        // TODO Auto-generated method stub
        return calculateArea();
    }
    
    public int calculateArea() {
        return width * width;
    }
}
