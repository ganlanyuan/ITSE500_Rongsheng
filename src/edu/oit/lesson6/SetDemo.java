package edu.oit.lesson6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class SetDemo {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Animal2> animals = new HashSet<>();

        Animal2 panda = new Animal2();
        Animal2 monkey = new Animal2();
        animals.add(panda);
        animals.add(monkey);
        System.out.println("animals is: " + animals);
        System.out.println("animals is empty? " + animals.isEmpty());
        System.out.println("Size of animals is: " + animals.size());
        System.out.println("animals contains monkey? " + animals.contains(monkey));
        animals.clear();
        System.out.println("animals is empty? " + animals.isEmpty());

        set.add(5);
        set.add(1);
        // set.addAll(animals);
        System.out.println("set is: " + set);
        System.out.println("set contains 1? " + set.contains(1));

    }

}

class Animal2 {
}
