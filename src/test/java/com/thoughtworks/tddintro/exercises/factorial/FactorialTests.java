package com.thoughtworks.tddintro.exercises.factorial;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/*

    * Change Factorial.compute() so that the first test passes and the remaining tests fail.
    * Change Factorial.compute() so that the first two tests pass and the remaining tests fail.
    ...
    * Change Factorial.compute() so that all of the tests pass.

 */

public class FactorialTests {


    private final Factorial factorial = new Factorial();

    @Test
    public void shouldReturnOneWhenNumberIsOne() throws NonPositiveNumberException{
        int number = 1;
        Factorial factorial = new Factorial();

        int factorialResult = factorial.compute(number);

        assertThat(factorialResult,is(1));
    }

    @Test
    public void shouldReturnTwoWhenNumberIsTwo() throws NonPositiveNumberException{
        int number = 2;
        Factorial factorial = new Factorial();

        int factorialResult = factorial.compute(number);

        assertThat(factorialResult,is(2));
    }

    @Test
    public void shouldReturnOneWhenNumberIsZero() throws  NonPositiveNumberException {
        int number = 0;
        Factorial factorial = new Factorial();

        int factorialResult = factorial.compute(number);

        assertThat(factorialResult,is(1));

    }

    @Test
    public void shouldReturnSixWhenNumberIsThree() throws NonPositiveNumberException {
        int number = 3;
        Factorial factorial = new Factorial();

        int factorialResult = factorial.compute(number);

        assertThat(factorialResult,is(6));

    }

    @Test(expected = NonPositiveNumberException.class)
    public void shouldThrowIllegalArgumentExceptionWhenNumberIsNegative()  throws NonPositiveNumberException {
       int number = -1;
        Factorial factorial = new Factorial();

       factorial.compute(number);

    }
}