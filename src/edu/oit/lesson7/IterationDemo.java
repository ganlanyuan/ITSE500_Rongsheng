package edu.oit.lesson7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IterationDemo {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(3);
        set.add(5);
        set.add(8);
        set.add(10);

        // method 1
        System.out.println("Method 1: for loop");
        for (Integer num : set) {
            System.out.println(num);
        }

        // method 2
        System.out.println("\nMethod 2: Iterator");
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }
        System.out.println("set size is now " + set.size());

        // for
        Integer[] nums = { 2, 3, 4, 7, 9, 10 };
        List<Integer> list = Arrays.asList(nums);
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        Integer[] nums2 = { 5, 10, 20, 13, -4 };
        List<Integer> list2 = Arrays.asList(nums2);
        int maxValue = 0;

        // for 2
        for (Integer num : list2) {
            if (num > maxValue) {
                maxValue = num;
            }
        }
        System.out.println("For loop get max: " + maxValue);

        // Iterator
        Iterator<Integer> numIterator = list2.iterator();
        while (numIterator.hasNext()) {
            Integer num = numIterator.next();
            if (num > maxValue) {
                maxValue = num;
            }
        }
        System.out.println("Iterator get max: " + maxValue);
    }

}
