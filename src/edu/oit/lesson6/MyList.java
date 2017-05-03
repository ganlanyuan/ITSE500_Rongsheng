package edu.oit.lesson6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

public class MyList {
    
    public static int numUniqueValues(LinkedList<Integer> list) {
        LinkedList<Integer> newList = new LinkedList<Integer>();

        for (Integer item : list) {
            if (!newList.contains(item)) {
                newList.add(item);
            }
        }

        return newList.size();
    }

    public static ArrayList<Integer> alternate(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> newList = new ArrayList<Integer>();
        ArrayList<Integer> longerList = new ArrayList<Integer>();
        int len1 = list1.size();
        int len2 = list2.size();
        int lenMin = Math.min(len1, len2);
        int lenMax = Math.max(len1, len2);

        // add the items alternately within the common length
        for (int i = 0; i < lenMin; i++) {
            newList.add(list1.get(i));
            newList.add(list2.get(i));
        }

        // add the rest of items to the new list if the 2 list have different
        // lengths
        if (len1 != len2) {
            if (len1 > len2) {
                longerList = list1;
            } else {
                longerList = list2;
            }

            for (int i = lenMin; i < lenMax; i++) {
                newList.add(longerList.get(i));
            }
        }

        return newList;
    }

    public static int leastCommon(HashMap<String, Integer> args) {
        int a = 10;
        HashMap<Integer, Integer> newMap = new HashMap<Integer, Integer>();

        // create a new map with the values of the given map as keys, their
        // counts as values
        ArrayList<Integer> mapValue = new ArrayList<Integer>(args.values());
        int mapValueSize = mapValue.size();
        for (int i = 0; i < mapValueSize; i++) {
            int key = mapValue.get(i);
            int count = 1;
            if (newMap.containsKey(key)) {
                count = newMap.get(key) + 1;
            }
            newMap.put(key, count);
        }

        // get the minimal number of the counts and return the key (the value in
        // the given map)
        // whose value is equal to this number
        int countMin = Collections.min(newMap.values());
        for (Integer key : newMap.keySet()) {
            if (newMap.get(key) == countMin) {
                a = key;
            }
        }

        return a;
    }

    public static ArrayList<Integer> twoSum(ArrayList<Integer> nums, int target) {
        int len = nums.size();
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        ArrayList<Integer> newList = new ArrayList<Integer>();

        for (int i = 0; i < len; i++) {
            int a = nums.get(i);
            int b = target - a;

            // put the matched values into a temporary list
            if (nums.contains(b)) {
                tempList.add(a);
                tempList.add(b);
            }

            // put the index into final list if the value is inside the temporary list
            if (tempList.contains(a)) {
                newList.add(i);
            }
        }

        return newList;
    }
    
    public static int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int sum = 0;
        int times = (int) Math.floor(minutesToTest / minutesToDie);
        
        int i = 1;
        do {
            sum = (int) Math.pow(i, times);
            i++;
        } while(i <= buckets && sum < buckets);
        
        return i + (times - 1) - 1;
    }
}
