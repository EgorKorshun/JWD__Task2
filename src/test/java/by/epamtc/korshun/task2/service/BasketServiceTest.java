package by.epamtc.korshun.task2.service;

import by.epamtc.korshun.task2.entity.Ball;
import by.epamtc.korshun.task2.entity.Color;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static by.epamtc.korshun.task2.service.BasketService.countingBlue;
import static by.epamtc.korshun.task2.service.BasketService.countingWeight;
import static org.junit.Assert.*;

public class BasketServiceTest {

    @Test
    public void countingBlueTestWithoutArg() {
        List<Ball>  balls = new ArrayList<>();
        int expected = 0;
        int actual = countingBlue(balls);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void countingBlueTestAddOneBlue() {
        List<Ball>  balls = new ArrayList<>();
        Ball ball = new Ball();
        ball.setColor(Color.BLUE);
        balls.add(ball);
        int expected = 1;
        int actual = countingBlue(balls);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void countingBlueTestAddAndRemoveOneBlue() {
        List<Ball>  balls = new ArrayList<>();
        Ball ball = new Ball();
        ball.setColor(Color.BLUE);
        balls.add(ball);
        balls.remove(ball);
        int expected = 0;
        int actual = countingBlue(balls);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void countingBlueTestAddAndRemoveAndAddOneBlue() {
        List<Ball>  balls = new ArrayList<>();
        Ball ball = new Ball();
        ball.setColor(Color.BLUE);
        balls.add(ball);
        balls.remove(ball);
        balls.add(ball);
        int expected = 1;
        int actual = countingBlue(balls);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void countingBlueTestAddTwoBlue() {
        List<Ball>  balls = new ArrayList<>();
        Ball ball1 = new Ball();
        Ball ball2 = new Ball();
        ball2.setColor(Color.BLUE);
        ball1.setColor(Color.BLUE);
        ball1.setWeight(12);
        balls.add(ball1);
        balls.add(ball2);
        int expected = 2;
        int actual = countingBlue(balls);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void countingBlueTestAddOneBlueTwice() {
        List<Ball>  balls = new ArrayList<>();
        Ball ball = new Ball();
        ball.setColor(Color.BLUE);
        balls.add(ball);
        balls.add(ball);
        int expected = 2;
        int actual = countingBlue(balls);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void countingWeightTestWithoutSetWeight() {
        List<Ball>  balls = new ArrayList<>();
        Ball ball = new Ball();
        balls.add(ball);
        double expected = 0;
        double actual = countingWeight(balls);
        Assert.assertEquals(actual, expected,0.0);
    }
    @Test
    public void countingWeightTestWithSetWeight() {
        List<Ball>  balls = new ArrayList<>();
        Ball ball = new Ball();
        ball.setWeight(100);
        balls.add(ball);
        double expected = 100;
        double actual = countingWeight(balls);
        Assert.assertEquals(actual, expected,0.0);
    }
    @Test
    public void countingWeightTestWithSetWeight5Times() {
        List<Ball>  balls = new ArrayList<>();
        Ball ball = new Ball();
        ball.setWeight(100);
        balls.add(ball);
        balls.add(ball);
        balls.add(ball);
        balls.add(ball);
        balls.add(ball);
        double expected = 500;
        double actual = countingWeight(balls);
        Assert.assertEquals(actual, expected,0.0);
    }
    @Test
    public void countingWeightTestWithSetNegativeWeight() {
        List<Ball>  balls = new ArrayList<>();
        Ball ball = new Ball();
        ball.setWeight(-100);
        balls.add(ball);
        double expected =0;
        double actual = countingWeight(balls);
        Assert.assertEquals(actual, expected,0.0);
    }

    @Test
    public void fillBasket() {
    }
}