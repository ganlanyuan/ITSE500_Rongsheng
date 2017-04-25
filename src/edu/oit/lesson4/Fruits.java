package edu.oit.lesson4;

public class Fruits {
    public boolean isEatable = true;
    private int count = 100;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.setCount(300);
        
        Banana banana = new Banana();
        
        Orange orange = new Orange();
        orange.setCount(300);
        
        int[] countList = { apple.getCount(), banana.getCount(), orange.getCount()};
        System.out.println("There are " + Fruits.add(countList) + " fruits in this garden.");
    }

    public static int add(int[] args) {
        int count = 0;
        int len = args.length;

        for (int i = 0; i < len; i++) {
            count += args[i];
        }
        return count;
    }

}

class Apple extends Fruits {
    public String type = "Apple";
    public String color = "red";
}

class Banana extends Fruits {
    public String type = "banana";
    public String color = "yellow";
}

class Orange extends Fruits {
    public String type = "orange";
    public String color = "orange";
}