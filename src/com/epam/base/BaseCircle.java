package com.epam.base;

/**
 * Created by lvvanahel on 04.04.17.
 */
public class BaseCircle extends Base {

    private double circleRadius;
    private double circleSquare;

    public BaseCircle(double circleRadius){

        this.circleRadius = circleRadius;
    }

    public double calculateSquare() {

        return circleSquare = Math.PI * circleRadius * circleRadius;
    }

    public double getCircleSquare() {
        return circleSquare;
    }

    public String toString() {
        return "Circle";
    }

}
