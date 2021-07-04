package by.epamtc.korshun.task2.tool;

import by.epamtc.korshun.task2.entity.Ball;
import by.epamtc.korshun.task2.service.ServiceOfBall;

public class Creator {

    public  static void quantityOfBalls(){
        int quantity = ScanValue.enterPositiveInt();
        int[] arrayOfBalls = new int[quantity];
        for (int i = 0; i < arrayOfBalls.length; i++) {
            new Ball(ServiceOfBall.numberOfColor(),ScanValue.enterWeight());
        }
    }
}
