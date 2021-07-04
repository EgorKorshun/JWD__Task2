package by.epamtc.korshun.task2.service;

import by.epamtc.korshun.task2.exception.InappropriateValException;
import org.junit.Assert;
import org.junit.Test;

import static by.epamtc.korshun.task2.service.LogicOfBasket.returnQuantityOfBalls;
import static org.junit.Assert.*;

public class LogicOfBasketTest {

    @Test
    public void returnQuantityOfBallsTestOfEqualsValues() throws InappropriateValException {
        int maxValue = 2;
        int preferredValue = 2;
        int expected = 2;
        int actual = returnQuantityOfBalls(maxValue, preferredValue);
        Assert.assertEquals(actual, expected);
    }

    @Test(expected = InappropriateValException.class)
    public void returnQuantityOfBallsTestOfPreferredBiggerThanMax() throws InappropriateValException {
        int maxValue = 2;
        int preferredValue = 10;
        int expected = 2;
        int actual = returnQuantityOfBalls(maxValue, preferredValue);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void returnQuantityOfBallsTestMaxBiggerPreferred() throws InappropriateValException {
        int maxValue = 10;
        int preferredValue = 2;
        int expected = 2;
        int actual = returnQuantityOfBalls(maxValue, preferredValue);
        Assert.assertEquals(actual, expected);
    }
}