package com.epam.containers.bases;

import com.epam.base.*;

/**
 * Created by lvvanahel on 05.04.17.
 */
public enum InclinedContainerBase {

    SQUARE (new BaseFoursquare(10)),

    TRAPEZOID (new BaseTrapezoid(20, 15, 15)),

    HEXAGON (new BaseHexagon(20)),

    CIRCLE (new BaseCircle(10));


    private Base base;

    InclinedContainerBase(Base base) {
        this.base = base;
    }

    public Base getBase (){
        return base;
    }
}

