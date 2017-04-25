package edu.oit.lesson4;

public class Animal {
    public String name;
    private int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public Animal() {
        
    }
    
    public void move () {
        System.out.println("move");
    }
    public void eat () {
        System.out.println("eat");
    }
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.move();
        cat.name = "Kitty";
        cat.catchMouse();
        cat.eat();
    }

}
