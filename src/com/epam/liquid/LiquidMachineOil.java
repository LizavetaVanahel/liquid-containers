package com.epam.liquid;

import com.epam.container.Container;

/**
 * Created by lvvanahel on 04.04.17.
 */
public class LiquidMachineOil extends Liquid {

    public static final double OIL_DENSITY = 910;
    private double liquidMass;
    private String liquidName = "Machine Oil";



    public double calculateLiquidMass(double liquidVolume){

        return this.liquidMass = liquidVolume * LiquidMachineOil.OIL_DENSITY;

    }

    public String toString() {
        return liquidName;
    }
}
