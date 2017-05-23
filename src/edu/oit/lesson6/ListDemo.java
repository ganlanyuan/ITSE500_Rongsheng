package edu.oit.lesson6;

import java.util.ArrayList;
import java.util.Collection;

public class ListDemo {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        System.out.println("Initial size of list: " + list.size());
        
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add(2, "Book");
        System.out.println("Initial size of list: " + list.size());
        
        list.set(4, "My");
        System.out.println("Content of list: " + list);
        System.out.println("Index of 'A': " + list.indexOf("C"));
        System.out.println("Get index of 5: " + list.get(5));
        
        Integer number = new Integer(5);
        int added = number.intValue() + 5;
        boolean status = true;
        Boolean status2 = new Boolean(status);
        System.out.println("added is " + added);
        System.out.println("status2 is " + status2);
    }

}
