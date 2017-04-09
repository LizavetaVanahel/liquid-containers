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

        List<Container> containersList = new ArrayList<Container>();


        containerBuilder = new ContainerBuilder();
        Container squareWithKeroseneCnt = containerBuilder.build(StraightContainerBase.SQUARE, kerosene);
        containersList.add(squareWithKeroseneCnt);

        containerManager = new ContainerManager();

        Container squareTrapOilCnt = containerBuilder.build(InclinedContainerBase.SQUARE, InclinedContainerBase.TRAPEZOID, oil);
        containersList.add(squareTrapOilCnt);

        Container circleMchnOilCnt = containerBuilder.build(StraightContainerBase.CIRCLE, machineOil);
        containersList.add(circleMchnOilCnt);

        Container trapSquareKeroseneCnt = containerBuilder.build(InclinedContainerBase.TRAPEZOID,InclinedContainerBase.SQUARE, kerosene);
        containersList.add(trapSquareKeroseneCnt);

        Container ellipseMchnOilCnt = containerBuilder.build(StraightContainerBase.ELLIPSE, machineOil);
        containersList.add(ellipseMchnOilCnt);

        Container circleHexagonOilCnt = containerBuilder.build(InclinedContainerBase.CIRCLE,InclinedContainerBase.HEXAGON, oil);
        containersList.add(circleHexagonOilCnt);

        Container hexagonKeroseneCnt = containerBuilder.build(StraightContainerBase.HEXAGON, kerosene);
        containersList.add(hexagonKeroseneCnt);

        Container hexagonSquareKeroseneCnt = containerBuilder.build(InclinedContainerBase.HEXAGON, InclinedContainerBase.SQUARE, kerosene);
        containersList.add(hexagonSquareKeroseneCnt);

        Container rectangleMchnOilCnt = containerBuilder.build(StraightContainerBase.RECTANGLE, machineOil);
        containersList.add(rectangleMchnOilCnt);

        Container trapHexagonKeroseneCnt = containerBuilder.build(InclinedContainerBase.TRAPEZOID, InclinedContainerBase.HEXAGON, kerosene);
        containersList.add(trapHexagonKeroseneCnt);

        containerManager.sortContainersByMass(containersList);
        containerManager.findMaxKeroseneMass(containersList);


    }

}
