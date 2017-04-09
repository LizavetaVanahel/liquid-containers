package com.epam.base;

/**
 * Created by lvvanahel on 04.04.17.
 */
public class BaseTrapezoid extends Base {

    private double baseWallSizeA;
    private double baseWallSizeB;
    private double trapezoidHeight;
    private double trapezoidSquare;

    public BaseTrapezoid (double baseWallSizeA, double baseWallSizeB, double trapezoidHeight){

        this.baseWallSizeA = baseWallSizeA;
        this.baseWallSizeB = baseWallSizeB;
        this.trapezoidHeight = trapezoidHeight;
    }

    public double calculateSquare (){

        return trapezoidSquare = (baseWallSizeA + baseWallSizeB) * trapezoidHeight / 2;
    }

    public double getTrapezoidSquare() {
        return trapezoidSquare;
    }

    public String toString() {
        return "Trapezoid";
    }
}
