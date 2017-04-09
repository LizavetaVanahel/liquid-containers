package com.epam.containers.bases;

import com.epam.base.*;

/**
 * Created by lvvanahel on 05.04.17.
 */
public enum StraightContainerBase {

    SQUARE (new BaseFoursquare(10)),

    RECTANGLE (new BaseRectangle(10, 15)),

    TRAPEZOID (new BaseTrapezoid(20, 15, 15)),

    HEXAGON (new BaseHexagon (20)),

    CIRCLE (new BaseCircle (10)),

    ELLIPSE (new BaseEllipse (10, 15));

    private Base base;

    StraightContainerBase(Base base) {
        this.base = base;
    }

    public Base getBase (){
        return base;
    }




}
