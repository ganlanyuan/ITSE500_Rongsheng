package edu.oit.lesson4;

public class Fruit {
    public boolean isEatable = true;
    private int count = 0;

    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        
        Apple apple = new Apple();
        apple.setCount(300);
        Banana banana = new Banana(200);
        Orange orange = new Orange();
        orange.setCount(300);
        
        fruit.setCount(apple, banana, orange);
        
        System.out.println("There are " + apple.getCount() + " " + apple.getType() + "s, " + banana.getCount() + " " + banana.getType() + "s, " + orange.getCount() + " " + orange.getType() + "s.");
        System.out.println(fruit.getCount() + " fruit in total in this garden.");
    }

    public static int add(int[] args) {
        int count = 0;
        int len = args.length;

        for (int i = 0; i < len; i++) {
            count += args[i];
        }
        return count;
    }
    
    public int getCount() {
        return count;
    }
    
    public void setCount(Apple apple, Banana banana, Orange orange) {
        int[] countList = { apple.getCount(), banana.getCount(), orange.getCount()};
        this.count = Fruit.add(countList);
    }

}

class Apple extends Fruit {
    private String type = "Apple";
    private String color = "red";
    private int count = 0;
    
    public Apple(int count) {
        this.count = count;
    }
    
    public Apple() {
    }
    
    public int getCount() {
        return count;
    }
    
    public void setCount(int count) {
        this.count = count;
    }

    public String getType() {
        return type;
    }
}

class Banana extends Fruit {
    private String type = "banana";
    private String color = "yellow";
    private int count = 0;
    
    public Banana(int count) {
        this.count = count;
    }
    
    public Banana() {
    }
    
    public int getCount() {
        return count;
    }
    
    public void setCount(int count) {
        this.count = count;
    }
    
    public String getType() {
        return type;
    }
}

class Orange extends Fruit {
    private String type = "orange";
    private String color = "orange";
    private int count = 0;
    
    public Orange(int count) {
        this.count = count;
    }
    
    public Orange() {
    }
    
    public int getCount() {
        return count;
    }
    
    public void setCount(int count) {
        this.count = count;
    }
    
    public String getType() {
        return type;
    }
}