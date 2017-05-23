package edu.oit.lesson6;

import java.util.HashMap;

public class MapDemo {

    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap();
        hashMap.put(1, "春");
        hashMap.put(3, "夏");
        System.out.println("Value of 1 is: " + hashMap.get(1));
        
        hashMap.put(6, "春天");
        System.out.println("Value of 'spring' is: " + hashMap.get(1));
        System.out.println("hashMap is: " + hashMap);
        System.out.println("hashMap size is: " + hashMap.size());
        System.out.println("keySet is: " + hashMap.keySet());
        System.out.println("entrySet is: " + hashMap.entrySet());
        System.out.println("Contains 5? " + hashMap.containsKey(5));
        
        hashMap.clear();
        System.out.println("hashMap size is: " + hashMap.size());
        System.out.println("hashMap is empty? " + hashMap.isEmpty());
    }

}
