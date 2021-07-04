package by.epamtc.korshun.task2.service;


import by.epamtc.korshun.task2.entity.Ball;
import by.epamtc.korshun.task2.entity.Color;
import by.epamtc.korshun.task2.exception.InappropriateValException;
import by.epamtc.korshun.task2.exception.NullBallException;
import by.epamtc.korshun.task2.tool.ScanValue;

import java.util.ArrayList;
import java.util.List;

public class BasketService {
    public  static int countingBlue(List<Ball> balls){
        int count =0;
        for (int i = 0; i < balls.size(); i++) {
            balls.get(i).getColor();
            if(balls.get(i).getColor() == Color.BLUE){
                count++;
            }
        }
        return  count;
    }

    public  static double countingWeight(List<Ball> balls) //throws NullBallException {
    {
//        if(balls == null){
//            throw  new NullBallException("ball is null");}
        double weight  =  0;
        for (int i = 0; i < balls.size(); i++) {
            double weightOfBall = balls.get(i).getWeight();
            if(weightOfBall<0){
                weightOfBall=0;
            }
            weight += weightOfBall;
        }
        return  weight;
    }

    public static ArrayList<Ball> fillBasket(int quantityOfBalls)  {
        ArrayList<Ball> balls= new ArrayList<>();
        for (int i = 0; i < quantityOfBalls; i++) {
            balls.add(new Ball(ServiceOfBall.numberOfColor(), ScanValue.enterWeight()));

        }
        return balls;
    }

}

