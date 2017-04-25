package edu.oit.lesson4;

public class Zoo {
    public String type = "Zoo";
    private String name;
    private int area;
    
    public Zoo(String name, int area) {
        this.name = name;
        this.area = area;
    }
    
    public Zoo() {}
    
    public static void main(String[] args) {
        Zoo centralParkZoo = new Zoo("Central Park Zoo", 300);
        System.out.println(centralParkZoo.name + " covers an area of " + centralParkZoo.area + " square feet.");
        
        Monkey monkey1 = new Monkey();
        System.out.println("The monkey is lived in a " + monkey1.getSpaceType() + ".");
    }

}


class Animals extends Zoo {
    private String type;
    private int age;
    private String food;
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getSpaceType (){
        return super.type;
    }
}

class Monkey extends Animals {
    
}
