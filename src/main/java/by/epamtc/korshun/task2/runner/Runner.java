package by.epamtc.korshun.task2.runner;



import by.epamtc.korshun.task2.entity.Ball;
import by.epamtc.korshun.task2.entity.Basket;
import by.epamtc.korshun.task2.exception.*;
import by.epamtc.korshun.task2.service.BasketService;
import by.epamtc.korshun.task2.service.LogicOfBasket;
import by.epamtc.korshun.task2.tool.ScanValue;
import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        try{
            Basket basket = new Basket();
            Ball ball = new Ball();
            ArrayList<Ball> balls = new ArrayList<>();
            System.out.println("the caliber of ball is "+ball.getCaliber());
            int value = basket.quantityOfBalls(basket.setSize(ScanValue.enterSizeOfBasket()),
                    ball.getCaliber());
            System.out.println("enter preferred value");
            int preferredValue = ScanValue.enterPositiveInt();
            System.out.println(" 1 - black\n 2 - white\n 3 - red\n 4 - orange" +
                    "\n 5 - yellow\n 6 - green\n 7 - blue\n 8 - purple" +
                    "\n\nUSE THIS NUMBERS");
            System.out.println("how much balls are you preferred to push?");
            balls.addAll(BasketService.fillBasket(LogicOfBasket.returnQuantityOfBalls(value, preferredValue)));

            basket.addBalls(balls);
            System.out.println(BasketService.countingBlue(balls)+"  blue balls\nweight is  "+BasketService.countingWeight(balls));
            System.out.println(basket);
        }
        catch (InappropriateValException | NullBasketException |NullBallException e ){
            System.err.println("not correct value");
        }
    }
}

