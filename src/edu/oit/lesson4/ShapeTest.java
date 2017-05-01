package edu.oit.lesson4;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShapeTest {

    @Test
    public void testSquareGetArea() {
        Square square = new Square(3);
        assertEquals(square.getArea(), 9);
    }
    
    @Test
    public void testRectangleGetArea() {
        Rectangle rectangle = new Rectangle(3, 2);
        assertEquals(rectangle.getArea(), 6);
    }
}
