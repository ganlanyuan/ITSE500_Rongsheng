package edu.oit.lesson1;

public class HelloWorld {

    public static void main(String[] args) {
        Person will = new Person();
        String firstName = "Rongsheng";
        String lastName = "Lin";
        int years = 20;

        System.out.println( "Hello, my name is " + Person.getName(firstName, lastName)  + ".");
        System.out.println( "I'm " + will.getYears(years) + " years old.");
    }

}