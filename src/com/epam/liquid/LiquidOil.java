package com.epam.liquid;

import com.epam.container.Container;

/**
 * Created by lvvanahel on 04.04.17.
 */
public class LiquidOil extends Liquid {

    public static final double OIL_DENSITY = 740;
    private double liquidMass;
    private String liquidName = "Machine Oil";


    public double calculateLiquidMass(double Liquidvolume){

        return this.liquidMass = Liquidvolume * LiquidOil.OIL_DENSITY;

    }

    public String toString() {
        return liquidName;
    }


}
