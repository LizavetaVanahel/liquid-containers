package com.epam.builders;

import com.epam.container.Container;
import com.epam.liquid.Liquid;
import com.epam.liquid.LiquidKerosene;

import java.util.*;

/**
 * Created by dvkoleda on 06.04.17.
 */
public class ContainerManager {

    Double maxKeroseneMass;

    public void sortContainersByMass (List<Container> containerList){

        Collections.sort(containerList);

        for(Container cnt: containerList){
            Double liquidMass = cnt.getLiquid().calculateLiquidMass(cnt.getLiquidVolume());
            System.out.println(cnt + " liquid: " + cnt.getLiquid() + "," + " liquid mass: " + liquidMass );
        }
    }

    public void findMaxKeroseneMass(List<Container> containerList){

        List<Double> keroseneMassList = new ArrayList<Double>();

        for (Container container : containerList)
            if (container.getLiquid() instanceof LiquidKerosene) {
                Double liquidMass = container.getLiquid().calculateLiquidMass(container.getLiquidVolume());
                keroseneMassList.add(liquidMass);
                this.maxKeroseneMass = Collections.max(keroseneMassList);
            }
                System.out.println("max kerosene mass: " + this.maxKeroseneMass);
    }



}
