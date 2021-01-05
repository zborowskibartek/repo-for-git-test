package yt;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void should_add_two_numbers() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.add(10, 15);

        //then
        Assert.assertEquals(25, result);
    }

    @Test
    public void should_add_two_numbers2() {
        //given
        Calculator calculator = new Calculator();
        //when
        //then
        Assert.assertEquals(25, calculator.add(10, 15));
        Assert.assertEquals(-2, calculator.add(-2, 0));
    }

    @Test
    public void should_not_add_two_numbers2() {
        //given
        Calculator calculator = new Calculator();
        //when
        //then
        Assert.assertNotEquals(25, calculator.add(10, 5));
        Assert.assertNotEquals(-2, calculator.add(1, 0));
    }


    @Test
    public void should_divide_two_numbers() {
        //given
        Calculator calculator = new Calculator();
        //when
        //then
        Assert.assertEquals(10.0, calculator.divide(100, 10), 0.01);
    }

    @Test(expected = ArithmeticException.class)
    public void should_not_divide_by_zero() {
        //given
        Calculator calculator = new Calculator();
        //when
        //then
        Assert.assertEquals(10.0, calculator.divide(100, 10), 0.01);
    }
}
