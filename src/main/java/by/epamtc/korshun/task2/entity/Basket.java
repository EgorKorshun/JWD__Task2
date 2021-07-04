package by.epamtc.korshun.task2.entity;


import by.epamtc.korshun.task2.exception.NullBallException;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static by.epamtc.korshun.task2.entity.Ball.caliber;


public class Basket implements Serializable {
    private double size;
    private List<Ball> balls;

    public Basket(){
        this.balls =new ArrayList<>(quantityOfBalls(size,caliber));
    }

    public  Basket(double size,List<Ball> balls){
        this.balls = new ArrayList<>(quantityOfBalls(size, caliber));
        this.size = size;
        setBalls(balls);
    }

    public final int quantityOfBalls(double size, double caliber){
        return (int) (size/caliber);
    }

    public boolean addBalls(ArrayList<Ball> balls) {
        boolean flag = true;
        if(balls == null)
            flag = false;
        for(Ball ball : balls)
            if(ball == null)
                flag = false;

        if( balls.size() + this.balls.size() > quantityOfBalls(size,caliber))
            flag = false;

        this.balls.addAll(balls);
        return  flag;
    }

    public boolean deleteBall(int numberOfBall) {
        boolean flag = true;
        if(numberOfBall < 0 || numberOfBall >= balls.size())
            flag = false;
        balls.remove(numberOfBall);
        return flag;
    }

    public boolean getBall(int numberOfBall) {
        boolean flag = true;
        if(numberOfBall < 0 || numberOfBall >= balls.size())
            flag = false;
        Ball result = balls.get(numberOfBall);
        return  flag;
    }

    public double getSize() {
        return size;
    }

    public double setSize(double size) {
        this.size = size;
        return size;
    }

    public  List<Ball> getBalls() {
//        if(balls!=null)
        Ball [] arrayOfBalls = {};
        return  List.of(balls.toArray(arrayOfBalls));
    }

    public void setBalls(List<Ball> balls) {
        this.balls = new ArrayList<>(quantityOfBalls(size, caliber));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o==null) return  false;
        if(getClass()!=o.getClass()) return  false;
        Basket basket = (Basket) o;
        return Objects.equals(getBalls(), basket.getBalls());
    }

    @Override
    public int hashCode() {
        return (int) (29*size*Objects.hashCode(balls));
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+
                " {balls=" + getBalls() +
                '}';
    }
}

