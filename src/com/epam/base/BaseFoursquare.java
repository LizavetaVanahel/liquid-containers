package com.epam.base;

/**
 * Created by lvvanahel on 04.04.17.
 */
public class BaseFoursquare extends Base {

    private double baseWallSize;
    private double foursquareSquare;

    public BaseFoursquare (double baseWallSize){

        this.baseWallSize = baseWallSize;
    }

    public double calculateSquare (){

        return foursquareSquare = baseWallSize * baseWallSize;
   }

    public double getFoursuqareSquare() {
        return foursquareSquare;
    }

    public String toString() {
        return "Foursquare";
    }
}

