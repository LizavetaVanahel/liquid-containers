package com.epam.container;

import com.epam.base.Base;
import com.epam.liquid.Liquid;

/**
 * Created by lvvanahel on 03.04.17.
 */
public abstract class Container implements Comparable<Container>{

    protected Base baseBottom;
    protected Base baseTop;
    protected static final double HEIGHT = 20;
    protected double liquidVolume;
    protected double containerVolume;
    protected Liquid liquid;

    abstract public double getContainerVolume();

    abstract  public double getLiquidVolume();

    public int compareTo(Container container){
        double firstLiquidMass = this.liquid.calculateLiquidMass(this.liquidVolume);
        double secondLiquidMass = container.liquid.calculateLiquidMass(container.getLiquidVolume());

        if (firstLiquidMass < secondLiquidMass) {
            return -1;
        } else if (firstLiquidMass == secondLiquidMass) {
            return 0;
        } else {
            return 1;
        }
    }

    public Liquid getLiquid() {
        return liquid;
    }


}
