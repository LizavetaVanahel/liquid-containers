package com.epam.container;

import com.epam.base.Base;
import com.epam.liquid.Liquid;

/**
 * Created by lvvanahel on 04.04.17.
 */
public class StraightWallsContainer extends Container{


    public StraightWallsContainer(Base base, Liquid liquid) {
        this.liquid = liquid;
        this.baseBottom = base;
        this.baseTop = base;
        this.containerVolume = base.calculateSquare() * this.HEIGHT;
        this.liquidVolume = this.containerVolume * 0.95;
    }

    public double getLiquidVolume (){
        return this.liquidVolume;
    }


    @Override
    public double getContainerVolume() {
        return this.containerVolume;
    }

    public String toString() {
        return "Container with straight walls" +  "," + " base1: " + baseTop + "," + " container volume: " + this.containerVolume + ",";
    }
}
