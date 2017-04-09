package com.epam.base;

/**
 * Created by lvvanahel on 03.04.17.
 */
public abstract class Base {


     protected double baseSquare;

     public abstract double calculateSquare ();

     public double getBaseSquare() {
          return baseSquare;
     }

     public String toString() {
          return "base";
     }
}
