package edu.oit.lesson4;

import static org.junit.Assert.*;

import org.junit.Test;

public class FruitsTest {

    @Test
    public void testAdd() {
        assertEquals(Fruits.add(new int[]{1, 2, 3}), 6);
    }

    @Test
    public void testFruitsGetCount() {
        Fruits fruits = new Fruits();
        
        assertEquals(fruits.getCount(), 100);
    }

    @Test
    public void testFruitsSetCount() {
        Fruits fruits = new Fruits();
        fruits.setCount(300);
        assertEquals(fruits.getCount(), 300);
    }

    @Test
    public void testFruitsInheritance() {
        Apple apple = new Apple();
        assertEquals(apple.isEatable, true);
    }    
}
