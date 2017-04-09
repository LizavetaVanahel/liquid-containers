package com.epam.liquid;

import com.epam.container.Container;

/**
 * Created by lvvanahel on 03.04.17.
 */
public abstract class Liquid {
    public static final double DENSITY = 0;
    public abstract double calculateLiquidMass(double volume);

    protected String liquidName;

    public String toString() {
        return liquidName;
    }



}
