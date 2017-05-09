package edu.oit.lesson8;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("how", "are", "you?"));
        System.out.println("twice: " + twice(list1));
        
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("a", "bb", "c", "ddd", "ee", "f", "g"));
        System.out.println("switchPairs: " + switchPairs(list2));
    }

    public static ArrayList<String> twice(ArrayList<String> list) {
        ArrayList<String> newlist = new ArrayList<>();
        newlist.addAll(list);
        newlist.addAll(list);
        
        return newlist;
    }
    
    public static ArrayList<String> switchPairs(ArrayList<String> list) {
        ArrayList<String> newlist = new ArrayList<>();
        int size = list.size();
        boolean isEven = size % 2 == 0;
        
        for (int i = 0; i < size; i++) {
            // is even or is odd and not the last item
            if (isEven || !isEven && i != size -1) {
                // i start from 0
                if (i % 2 == 0) {
                    newlist.add(list.get(i + 1));
                } else {
                    newlist.add(list.get(i - 1));
                }
            } else {
                newlist.add(list.get(i));
            }
        }
        
        return newlist;
    }
}
