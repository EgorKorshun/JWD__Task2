package by.epamtc.korshun.task2.service;

import by.epamtc.korshun.task2.exception.InappropriateValException;
import by.epamtc.korshun.task2.tool.ScanValue;

public class LogicOfBasket {
    public  static  int returnQuantityOfBalls(int maxValue, int preferredValue) throws InappropriateValException {
        if(preferredValue>maxValue)
            throw new InappropriateValException("inappropriate value");
        else {
            return  preferredValue;
        }
    }
}
