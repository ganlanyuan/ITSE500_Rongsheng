package edu.oit.lesson8;

public class Vehicle {
    private double speed;
    private double size;
    
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setSpeed(20);
        vehicle.setSize(200);

        System.out.println("Vehicle's initial speed is " + vehicle.getSpeed() + ".");
        System.out.println("Vehicle's initial size is " + vehicle.getSize() + ".");
        
        vehicle.speedUp(2);
        System.out.println("Vehicle's speed is " + vehicle.getSpeed() + " after speeded up.");
        
        vehicle.speedDown(1.5);
        System.out.println("Vehicle's speed is " + vehicle.getSpeed() + " after speeded down.");
    }
    
    public Vehicle(double speed, double size) {
        this.speed = speed;
        this.size = size;
    }
    
    public Vehicle(int speed) {
        this.speed = speed;
    }
    
    public Vehicle() {
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
    
    public void speedUp(double num) {
        this.speed = this.speed * num;
    }

    public void speedDown(double num) {
        this.speed = this.speed / num;
    }

}
