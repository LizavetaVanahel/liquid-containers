package com.epam.container;

import com.epam.base.Base;
import com.epam.liquid.Liquid;

/**
 * Created by lvvanahel on 04.04.17.
 */
public class InclinedWallsContainer extends Container {


    public InclinedWallsContainer(Base baseTop, Base baseBottom, Liquid liquid){
        this.liquid = liquid;
        this.baseTop = baseTop;
        this.baseBottom = baseBottom;
        this.containerVolume = (baseTop.calculateSquare() + Math.sqrt(baseBottom.calculateSquare() * baseTop.calculateSquare()) + baseBottom.calculateSquare()) * this.HEIGHT /3;
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
        return "Container with inclined walls," + " base1: " + this.baseTop +"," + " base2: " + this.baseBottom + ","  + " container volume: " + this.containerVolume + ",";
    }


}
