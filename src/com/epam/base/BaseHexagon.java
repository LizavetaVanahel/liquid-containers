package com.epam.base;

/**
 * Created by lvvanahel on 04.04.17.
 */
public class BaseHexagon extends Base {

    private double baseWallSize;
    private double hexagonSquare;

    public BaseHexagon (double baseWallSize) {

        this.baseWallSize = baseWallSize;
    }

    public double calculateSquare (){

        return hexagonSquare =  baseWallSize * baseWallSize * Math.sqrt(27)/ 2;
    }

    public double getHexagonSquare() {
        return hexagonSquare;
    }

    public String toString() {
        return "Hexagon";
    }
}
