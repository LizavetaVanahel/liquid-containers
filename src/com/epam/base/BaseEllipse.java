package com.epam.base;

/**
 * Created by lvvanahel on 04.04.17.
 */
public class BaseEllipse extends Base{

    private double baseWallSizeA;
    private double BaseWallSizeB;
    private double ellipseSquare;

    public BaseEllipse(double baseWallSizeA, double baseWallSizeB){

        this.baseWallSizeA = baseWallSizeA;
        this.BaseWallSizeB = baseWallSizeB;
    }

    public double calculateSquare() {

        return ellipseSquare = Math.PI * baseWallSizeA * BaseWallSizeB;
    }

    public double getEllipseSquare() {
        return ellipseSquare;
    }

    public String toString() {
        return "Ellipse";
    }
}
