package edu.oit.lesson5;

public class Triangle extends Shape {
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
    
    @Override
    public double geArea() {
        // TODO Auto-generated method stub
        return calculateArea();
    }

    private double calculateArea() {
        double s = (hypotenuse + opposite + adjacent) / 2;
        return Math.sqrt(s * (s - hypotenuse) * (s - opposite) * (s - adjacent));
    }

}
