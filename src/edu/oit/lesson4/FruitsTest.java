package edu.oit.lesson4;

import static org.junit.Assert.*;

import org.junit.Test;

public class FruitsTest {

    @Test
    public void testAdd() {
        assertEquals(Fruits.add(new int[]{1, 2, 3}), 6);
    }

    @Test
    public void testFruitsSetGetCount() {
        Fruits fruits = new Fruits();
        Apple apple = new Apple(200);
        Banana banana = new Banana(100);
        Orange orange = new Orange(150);
        
        assertEquals(fruits.getCount(), 0);
        
        fruits.setCount(apple, banana, orange);
        assertEquals(fruits.getCount(), 450);
    }
    
    @Test
    public void testApple() {
        Apple apple = new Apple(100);
        assertEquals(apple.getCount(), 100);
        
        apple.setCount(300);
        assertEquals(apple.getCount(), 300);
    } 

    @Test
    public void testBanana() {
        Banana banana = new Banana(100);
        assertEquals(banana.getCount(), 100);
        
        banana.setCount(300);
        assertEquals(banana.getCount(), 300);
    } 

    @Test
    public void testOrange() {
        Orange orange = new Orange(100);
        assertEquals(orange.getCount(), 100);
        
        orange.setCount(300);
        assertEquals(orange.getCount(), 300);
    } 
    
    @Test
    public void testFruitsInheritance() {
        Apple apple = new Apple();
        assertEquals(apple.isEatable, true);
    }    
}
