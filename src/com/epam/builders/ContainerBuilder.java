package com.epam.builders;

import com.epam.container.Container;
import com.epam.container.InclinedWallsContainer;
import com.epam.container.StraightWallsContainer;
import com.epam.containers.bases.InclinedContainerBase;
import com.epam.containers.bases.StraightContainerBase;
import com.epam.liquid.Liquid;


/**
 * Created by lvvanahel on 05.04.17.
 */
public class ContainerBuilder {


    private StraightContainerBase base;
    public Container container;



    public Container build (StraightContainerBase base, Liquid liquid){
        this.base = base;
        return this.container = new StraightWallsContainer(base.getBase(), liquid);

    }

    public Container build (InclinedContainerBase baseTop, InclinedContainerBase baseBottom, Liquid liquid){
        return this.container = new InclinedWallsContainer(baseTop.getBase(), baseBottom.getBase(), liquid );
    }


    }


