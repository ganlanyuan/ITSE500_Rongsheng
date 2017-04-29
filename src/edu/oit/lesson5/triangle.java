package edu.oit.lesson5;

public class triangle extends Shape {
    private int sides = 3;
    private int hypotenuse;
    private int opposite;
    private int adjacent;
    
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
