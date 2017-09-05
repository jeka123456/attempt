package by.poc.unittest;

import org.junit.Test;

import static org.junit.Assert.*;

public class MathematicsTest{
    private Mathematics mathematics = new Mathematics();

    @Test
    public void testAdd() {
        //given
        int a = 1;
        int b = 10;

        //when
        final int result = mathematics.add(a, b);

        //then
        assertEquals(10, result);
    }
    @Test
    public void testRemove() {
        //given
        int a=20;
        int b=10;

        //when
        final int result=mathematics.remove(a, b);

        //then
        assertEquals(2, result);
    }}