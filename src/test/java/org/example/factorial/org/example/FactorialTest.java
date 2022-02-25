package org.example.factorial.org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
* Test cases:
* factorial 0 -> 1 *
* factorial 1 -> 1
* factorial 2 -> 2
* factorial 3 -> 6
* factorial 4 -> 24
* negative number -> null
*/

class FactorialTest {
    @Test
    public void shouldComputeReturnOneIfTheNumberIsZero(){
    Factorial factorial = new Factorial();
    int expectedValue = 1;
    int obtainedValue = factorial.compute(0);
    assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldComputeReturnOneIfTheNumberIsOne(){
        Factorial factorial = new Factorial();
        int expectedValue = 1;
        int obtainedValue = factorial.compute(1);
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldComputeReturnTwoIfTheNumberIsTwo(){
        Factorial factorial = new Factorial();
        int expectedValue = 2;
        int obtainedValue = factorial.compute(2);
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldComputeReturnSixIfTheNumberIsThree(){
        Factorial factorial = new Factorial();
        int expectedValue = 6;
        int obtainedValue = factorial.compute(3);
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldComputeReturnTwentyFourIfTheNumberFour(){
        Factorial factorial = new Factorial();
        int expectedValue = 24;
        int obtainedValue = factorial.compute(4);
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldComputeOfNegativeNumberRaiseAnException(){
        var factorial = new Factorial();
        assertThrows(RuntimeException.class, () -> Factorial.compute(-1));
    }
}