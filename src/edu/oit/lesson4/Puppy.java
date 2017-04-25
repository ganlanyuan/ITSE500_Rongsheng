package edu.oit.lesson4;

public class Puppy{
    private String name = "ww";
    public int age;
    
    public Puppy (String name) {
        this.name = name;
    }
    
    public Puppy (String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public Puppy () {
    }
    
    public void say () {
        System.out.println(this.name);
    }

    public void setName (String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public static void main (String[] args) {
        Puppy puppy = new Puppy("ww", 3);
        puppy.name = "Red";
        
        System.out.println("Puppy1 name is " + puppy.name + ", age is " + puppy.age + ".");
    }
}
