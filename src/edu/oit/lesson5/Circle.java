package edu.oit.lesson5;

public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    // @Override
    public double getArea() {
        return calculateArea();
    }

    private double calculateArea() {
        return radius * radius * Math.PI;
    }
}
