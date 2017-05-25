package edu.oit.lesson4;

public class Point {
    private int ordinateX;
    private int ordinateY;
    
    public static double getDistance (int x, int y) {
        return Math.sqrt(x * x + y * y);
    }

    public static void main(String[] args) {
        Point point1 = new Point();
        point1.setOrdinateX(10);
        point1.setOrdinateY(20);
        
        Point point2 = new Point();
        point2.setOrdinateX(20);
        point2.setOrdinateY(30);
        
        int disX = point2.getOrdinateX() - point1.getOrdinateX();
        int disY = point2.getOrdinateY() - point1.getOrdinateY();
        
        System.out.println(Point.getDistance(disX, disY));
    }

    public int getOrdinateX() {
        return ordinateX;
    }

    public void setOrdinateX(int ordinateX) {
        this.ordinateX = ordinateX;
    }

    public int getOrdinateY() {
        return ordinateY;
    }

    public void setOrdinateY(int ordinateY) {
        this.ordinateY = ordinateY;
    }
}
