package edu.oit.lesson4;

public class Zoo {
    public String type = "Zoo";
    private String name;
    private int area;

    public Zoo(String name, int area) {
        this.name = name;
        this.area = area;
    }

    public Zoo() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getArea() {
        return area;
    }

    public static void main(String[] args) {
        Zoo centralParkZoo = new Zoo("Central Park Zoo", 300);
        System.out.println(centralParkZoo.getName() + " covers an area of " + centralParkZoo.getArea() + " square feet.");

        // monkey
        Monkey monkey1 = new Monkey();
        monkey1.setName("Steven");
        monkey1.setAge(13);
        monkey1.setGender("male");
        String pronoun = Animals.getPersonalPronoun(monkey1.getGender());

        System.out.println("\n" + monkey1.getName() + " is a " + monkey1.type + ". " + pronoun + " is "
                + monkey1.getAge() + " years old and living in a " + monkey1.getSpaceType() + ".");
        System.out.println(monkey1.getName() + " can " + monkey1.canDo1 + " and " + monkey1.canDo2 + ".");
        System.out.println(monkey1.getName() + " eats " + monkey1.food + ".");

        // new animal
        Animals newAnimal = new Animals();
        newAnimal.setType("Horse");
        newAnimal.setFood("grass");
        System.out.println("\n" + newAnimal.getType() + " eats " + newAnimal.getFood() + ".");
    }

}

class Animals extends Zoo {
    public String canDo1 = "eat";
    public String canDo2 = "run";
    private String type;
    private String food;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getSpaceType() {
        return super.type;
    }

    public void run() {
        System.out.println(this.type + " is running.");
    }

    public void eat() {
        System.out.println(this.type + " is eating.");
    }

    public static String getPersonalPronoun(String gender) {
        String personalPronoun = "He";

        if (gender == "female") {
            personalPronoun = "She";
        }

        return personalPronoun;
    }

}

class Monkey extends Animals {
    public String type = "Monkey";
    public String food = "Bananas";
    private String name;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sayName() {
        System.out.println(this.name);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
