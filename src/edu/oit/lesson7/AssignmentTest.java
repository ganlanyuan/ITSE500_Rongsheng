package edu.oit.lesson7;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class AssignmentTest {

    @Test
    public void removeRangeTest() {
        Integer[] nums = { 3, 17, -1, 4, 9, 2, 14 };
        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(nums));
        
        Set<Integer> setReturn = Assignment.removeRange(set, 1, 10);
        
        assertEquals(setReturn.size(), 3);
        assertEquals(setReturn.contains(17), true);
        assertEquals(setReturn.contains(-1), true);
        assertEquals(setReturn.contains(14), true);
    }
    
    @Test
    public void teacherTest() {
        Map<String, Integer> roster = new HashMap<>();
        roster.put("Mort", 77);
        roster.put("Dan", 81);
        roster.put("Alyssa", 98);
        roster.put("Kim", 52);
        roster.put("Lisa", 87);
        roster.put("Bob", 43);
        roster.put("Jeff", 70);
        roster.put("Sylvia", 92);
        roster.put("Vikram", 90);
        
        Map<Integer, String> gradeMap = new HashMap<>();
        gradeMap.put(52, "D");
        gradeMap.put(70, "C-");
        gradeMap.put(73, "C");
        gradeMap.put(76, "C+");
        gradeMap.put(80, "B-");
        gradeMap.put(84, "B");
        gradeMap.put(87, "B+");
        gradeMap.put(89, "A-");
        gradeMap.put(91, "A");
        gradeMap.put(98, "A+");
        
        Map<String, String> map = Assignment.teacher(roster, gradeMap);
        
        assertEquals(roster.size(), map.size());
        assertEquals(map.get("Mort"), "C+");
        assertEquals(map.get("Dan"), "B-");
        assertEquals(map.get("Alyssa"), "A+");
        assertEquals(map.get("Kim"), "D");
        assertEquals(map.get("Lisa"), "B+");
        assertEquals(map.get("Bob"), "F");
        assertEquals(map.get("Jeff"), "C-");
        assertEquals(map.get("Sylvia"), "A");
        assertEquals(map.get("Vikram"), "A-");
    }

}
