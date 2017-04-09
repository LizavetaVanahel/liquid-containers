package com.epam.main;

import com.epam.builders.ContainerBuilder;
import com.epam.builders.ContainerManager;
import com.epam.container.Container;
import com.epam.containers.bases.InclinedContainerBase;
import com.epam.containers.bases.StraightContainerBase;
import com.epam.liquid.LiquidKerosene;
import com.epam.liquid.LiquidMachineOil;
import com.epam.liquid.LiquidOil;
import com.epam.liquid.Liquid;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dvkoleda on 06.04.17.
 */
public class Main {


    public static void main(String[] args) {

        ContainerBuilder containerBuilder;


        Liquid kerosene = new LiquidKerosene();
        Liquid oil = new LiquidOil();
        Liquid machineOil = new LiquidMachineOil();

        ContainerManager containerManager;

        Container container1;
        Container container2;
        Container container3;
        Container container4;
        Container container5;
        Container container6;
        Container container7;
        Container container8;
        Container container9;
        Container container10;


        List<Container> containersList = new ArrayList<Container>();


        containerBuilder = new ContainerBuilder();
        container1 = containerBuilder.build(StraightContainerBase.SQUARE, kerosene);
        containersList.add(container1);

        containerManager = new ContainerManager();

        container2 = containerBuilder.build(InclinedContainerBase.SQUARE, InclinedContainerBase.TRAPEZOID, oil);
        containersList.add(container2);

        container3 = containerBuilder.build(StraightContainerBase.CIRCLE, machineOil);
        containersList.add(container3);

        container4 = containerBuilder.build(InclinedContainerBase.TRAPEZOID,InclinedContainerBase.SQUARE, kerosene);
        containersList.add(container4);

        container5 = containerBuilder.build(StraightContainerBase.CIRCLE, machineOil);
        containersList.add(container5);

        container6 = containerBuilder.build(InclinedContainerBase.CIRCLE,InclinedContainerBase.HEXAGON, oil);
        containersList.add(container6);

        container7 = containerBuilder.build(StraightContainerBase.HEXAGON, kerosene);
        containersList.add(container7);

        container8 = containerBuilder.build(InclinedContainerBase.HEXAGON, InclinedContainerBase.SQUARE, kerosene);
        containersList.add(container8);

        container9 = containerBuilder.build(StraightContainerBase.ELLIPSE, machineOil);
        containersList.add(container9);

        container10 = containerBuilder.build(InclinedContainerBase.TRAPEZOID, InclinedContainerBase.HEXAGON, kerosene);
        containersList.add(container10);

        containerManager.sortContainersByMass(containersList);
        containerManager.findMaxKeroseneMass(containersList);


    }

}
