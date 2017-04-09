package com.epam.base;

/**
 * Created by lvvanahel on 04.04.17.
 */
public class BaseRectangle extends Base {

    private double baseWallSizeA;
    private double baseWallSizeB;
    private double rectangleSquare;

    public BaseRectangle (double baseWallSizeA, double baseWallSizeB){

        this.baseWallSizeA = baseWallSizeA;
        this.baseWallSizeB = baseWallSizeB;
    }

    public double calculateSquare (){

        return rectangleSquare = baseWallSizeA * baseWallSizeB;
    }


    public double getRectangleSquare() {
        return rectangleSquare;
    }

    public String toString() {
        return "Rectangle";
    }
}
