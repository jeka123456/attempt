package by.poc.unittest;

import org.junit.Test;

import static org.junit.Assert.*;

public class MathematicTest2{
    private Mathematic mathematics =new Mathematic();
    @Test
    public void testAdd() {
        //given
        int a = 8;
        int b = 2;

        //when
        final int result = mathematics.add(a, b);

        //then
        assertEquals(64, result);
    }
    @Test
    public void testRemove() {
        //given
        int a=27;
        int b=10;

        //when
        final int result=mathematics.remove(a, b);

        //then
        assertEquals(7, result);

}}