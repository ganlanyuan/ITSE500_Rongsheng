package edu.oit.lesson4;

public class Cat extends Animal {
    private String type;
    
    public Cat(String name, int age, String type) {
        super(name, age);
        this.type = type;
    }
    
    public Cat() {}
    public void eat() {
        System.out.println(this.name + " is eating.");
    }
    public void catchMouse() {
        System.out.println("I can catch mouse.");
        super.eat();
    }
    
    public static void main(String[] args) {

    }

}
