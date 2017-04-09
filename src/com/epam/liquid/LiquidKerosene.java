package com.epam.liquid;

import com.epam.container.Container;

/**
 * Created by lvvanahel on 04.04.17.
 */
public class LiquidKerosene extends Liquid {


    public static final double KEROSENE_DENSITY = 840;
    private double liquidMass;
    private String liquidName = "Kerosene";

    public double calculateLiquidMass(double liquidVolume){

        return this.liquidMass = liquidVolume * LiquidKerosene.KEROSENE_DENSITY;

    }

    public String toString() {
        return liquidName;
    }

}
