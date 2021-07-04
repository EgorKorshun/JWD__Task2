package by.epamtc.korshun.task2.tool;


import by.epamtc.korshun.task2.entity.Ball;
import by.epamtc.korshun.task2.exception.NullBasketException;

import java.util.Scanner;

public class ScanValue {
    static Scanner scanner = new Scanner(System.in);

    public  static  int enterPositiveInt(){
        int number;
        while (!scanner.hasNextInt()){
            scanner.next();
        }
        number = scanner.nextInt();
        if(number<=0){

            number = enterPositiveInt();
        }
        return number;
    }

    public  static  double enterWeight(){
        return  enterPositiveDouble();
    }
    public  static  int enterNumOfColors(){
        int number = enterPositiveInt();
        if(number>8||number<0){
            System.out.println(" 1  -  8");
            number = scanner.nextInt();
        }
        return  number;
    }
    public  static  double enterPositiveDouble(){
        double value;
        while (!scanner.hasNextDouble()){
            scanner.next();
        }
        value=scanner.nextDouble();

        if(value<0){
            value = enterPositiveDouble();
        }
        return  value;

    }

    public  static  double enterSizeOfBasket() throws NullBasketException {
        double sizeOfBasket = enterPositiveDouble();
        if(sizeOfBasket==0)
            throw new NullBasketException("size of basket is null ");
        if(sizeOfBasket< Ball.caliber){
            sizeOfBasket = enterSizeOfBasket();}
        return sizeOfBasket;
    }
}

