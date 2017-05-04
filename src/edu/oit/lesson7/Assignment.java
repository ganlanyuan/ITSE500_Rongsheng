package edu.oit.lesson7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Assignment {

    public static Set<Integer> removeRange (Set<Integer> set, int min, int max) {
        Iterator<Integer> num = set.iterator();
        while (num.hasNext()) {
            Integer numCurrent = num.next();
            if (numCurrent >= min && numCurrent <= max) {
                num.remove();
            }
        }
        return set;
    }
    
    public static Map<String, String> teacher(Map<String, Integer> roster, Map<Integer, String> gradeMap) {
        Map<String, String> studentGrades = new HashMap<>();
        
        for (String name : roster.keySet()) {
            // default grade if student's percentage less than the minimal percentage
            String gradeEarned = "F";
            
            // max: maximum percentage student earned
            int max = 0;
            for (Integer grade : gradeMap.keySet()) {
                if (roster.get(name) >= grade && grade > max) {
                    max = grade;
                }
            }
            if (max > 0) {
                gradeEarned = gradeMap.get(max);
            }
            
            studentGrades.put(name, gradeEarned);
        }
        
        return studentGrades;
    }

}
