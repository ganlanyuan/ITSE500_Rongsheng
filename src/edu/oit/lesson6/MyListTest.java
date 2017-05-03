package edu.oit.lesson6;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

import org.junit.Test;

public class MyListTest {

    @Test
    public void numUniqueValuesTest() {
        LinkedList<Integer> list1 = new LinkedList<Integer>(Arrays.asList(3, 7, 3, -1, 2, 3, 7, 2, 15, 15));
        assertEquals(MyList.numUniqueValues(list1), 5);
    }
    
    @Test
    public void alternateTest() {
        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(3, 7, 3));
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(-1, 2, 7, 2, 15));
        ArrayList<Integer> list3 = new ArrayList<Integer>(Arrays.asList(3, -1, 7, 2, 3, 7, 2, 15));
        assertEquals(MyList.alternate(list1, list2), list3);
        
        ArrayList<Integer> list4 = new ArrayList<Integer>(Arrays.asList(1, 8, 0));
        ArrayList<Integer> list5 = new ArrayList<Integer>(Arrays.asList(2, 9, 7));
        ArrayList<Integer> list6 = new ArrayList<Integer>(Arrays.asList(1, 2, 8, 9, 0, 7));
        assertEquals(MyList.alternate(list4, list5), list6);
    }
    
    @Test
    public void leastCommonTest() {
        HashMap<String, Integer> map1 = new HashMap<String, Integer>();
        map1.put("Alyssa", 22);
        map1.put("Char", 25);
        map1.put("Dan", 25);
        map1.put("Jeff", 20);
        map1.put("Kasey", 20);
        map1.put("Kim", 20);
        map1.put("Mogran", 25);
        map1.put("Ryan", 25);
        map1.put("Stef", 22);
        assertEquals(MyList.leastCommon(map1), 22);
    }
    
    @Test
    public void twoSumTest() {
        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(2, 7, 11, 15));
        ArrayList<Integer> newNums = new ArrayList<Integer>(Arrays.asList(0, 1));
        assertEquals(MyList.twoSum(nums, 9), newNums);
    }
    
    @Test
    public void poorPigsTest() {
        assertEquals(MyList.poorPigs(1000, 15, 60), 6);
    }
}
