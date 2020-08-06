package me.jonmcewen.ithc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddition(){
        assertEquals(7, Calculator.add(3,4));
    }

    @Test
    public void testAdditionOverflow(){
        // everyone knows that 2147483647 + 1 = -2147483648, surely?
        assertEquals(-2147483648, Calculator.add(2147483647,1));
    }

    @Test(expected = ArithmeticException.class)
    public void testAdditionOverflowException(){
        Calculator.add(Integer.MAX_VALUE,1);
    }

}
