package edu.oit.lesson4;

public abstract class Shape {
    
    abstract double getArea();
    
    public static void main(String[] args) {
        // square
        Shape square = new Square(3);
        System.out.println("The square covers an area of " + square.getArea() + ".");

        // rectangle
        Shape rectangle = new Rectangle(5, 3);
        System.out.println("The rectangle covers an area of " + rectangle.getArea() + ".");

        // circle
        Shape circle = new Circle(4);
        System.out.println("The circle covers an area of " + circle.getArea() + ".");

        // triangle
        Shape triangle = new Triangle(7, 5, 4);
        System.out.println("The triangle covers an area of " + triangle.getArea() + ".");
    }
}

class Square extends Shape {
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

    public double getArea() {
        return calculateArea();
    }

    public int calculateArea() {
        return width * width;
    }
}

class Rectangle extends Shape {
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

    public double getArea() {
        return calculateArea();
    }

    public int calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
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

    public double getArea() {
        return calculateArea();
    }

    private double calculateArea() {
        return radius * radius * Math.PI;
    }
}

class Triangle extends Shape {
    private int sides = 3;
    private int hypotenuse;
    private int opposite;
    private int adjacent;

    public Triangle(int hypotenuse, int opposite, int adjacent) {
        this.hypotenuse = hypotenuse;
        this.opposite = opposite;
        this.adjacent = adjacent;
    }

    public Triangle() {
    }

    public int getSides() {
        return sides;
    }

    public int getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(int hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    public int getOpposite() {
        return opposite;
    }

    public void setOpposite(int opposite) {
        this.opposite = opposite;
    }

    public int getAdjacent() {
        return adjacent;
    }

    public void setAdjacent(int adjacent) {
        this.adjacent = adjacent;
    }

    public double getArea() {
        return calculateArea();
    }

    private double calculateArea() {
        double s = (hypotenuse + opposite + adjacent) / 2;
        return Math.sqrt(s * (s - hypotenuse) * (s - opposite) * (s - adjacent));
    }
}
