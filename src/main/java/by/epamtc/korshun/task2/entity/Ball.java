package by.epamtc.korshun.task2.entity;

import java.io.Serializable;

public class Ball  implements Serializable {
    private double weight;
    public static final double caliber = 10;
    private Color color;

    public Ball(){
    }

    public Ball(Color color,double weight){
        this.color=color;
        if(weight>0){
            this.weight = weight;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getCaliber() {
        return caliber;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+
                ":  weight = " + getWeight() +
                ", color = " +getColor();
    }

    @Override
    public int hashCode() {
        return (int) (31*weight*color.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj ==null) return  false;
        if(getClass()!=obj.getClass()) return  false;
        Ball ball = (Ball) obj;
        return Double.compare(ball.getWeight(), getWeight()) == 0 && getColor() == ball.getColor();
    }
}


