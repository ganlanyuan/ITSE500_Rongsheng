package edu.oit.lesson7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapIterationDemo {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 88);
        map.put("Lily", 90);
        map.put("Lucy", 92);
        
        // for
        for (Entry<String, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " got " + entry.getValue());
        }
        
        // for values
        for (Integer value : map.values()) {
            System.out.println(value);
        }
        
        // for keys
        for (String name: map.keySet()) {
            System.out.println(name);
        }
        
        // Iterator
        Iterator<Entry<String, Integer>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) entries.next();
            String key = (String) entry.getKey();
            Integer value = (Integer) entry.getValue();
            System.out.println(key + ": " + value);
        }
        
        // Iterator values
        Iterator<Integer> value = map.values().iterator();
        while (value.hasNext()) {
            System.out.println(value.next());
        }
        
        // Iterator keys
        Iterator<String> key = map.keySet().iterator();
        while (key.hasNext()) {
            System.out.println(key.next());
        }
        
        
    }

}
