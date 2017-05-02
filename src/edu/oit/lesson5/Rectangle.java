package edu.oit.lesson5;

public class Rectangle {
    private int sides = 4;
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
    }

    public int getSides() {
        return sides;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    // @Override
    public double getArea() {
        return calculateArea();
    }

    public int calculateArea() {
        return length * width;
    }
}
