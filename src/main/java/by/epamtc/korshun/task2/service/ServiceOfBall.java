package by.epamtc.korshun.task2.service;

import  by.epamtc.korshun.task2.entity.Color;
import by.epamtc.korshun.task2.tool.ScanValue;

public class ServiceOfBall {
    public  static Color numberOfColor(){
        int number = ScanValue.enterNumOfColors();
        Color color;
        switch (number){
            case 1:   color = Color.BLACK;
                break;
            case 2: color =  Color.WHITE;
                break;
            case 3: color =  Color.RED;
                break;
            case 4: color =  Color.ORANGE;
                break;
            case 5: color =  Color.YELLOW;
                break;
            case  6: color = Color.GREEN;
                break;
            case  7:color = Color.BLUE;
                break;
            case 8:color =  Color.PURPLE;
                break;
            default:
                color = numberOfColor();
        }
        return  color;
    }
}
