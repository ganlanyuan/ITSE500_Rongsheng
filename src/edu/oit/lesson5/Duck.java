package edu.oit.lesson5;

public class Duck implements Flyable, Swimable {
    
    @Override
    public void fly() {
        System.out.println("fly");
    }
    
    @Override
    public void swim() {
        System.out.println("Swim on water");
    }
}
