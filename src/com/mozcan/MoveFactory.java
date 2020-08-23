package com.mozcan;

import com.mozcan.model.EnumPosition;
import com.mozcan.service.*;

public class MoveFactory {

    public Move getMoveObject(String position) {

        if(EnumPosition.NORTH.getPosition().equalsIgnoreCase(position))
            return new NorthMove();
        else if(EnumPosition.SOUTH.getPosition().equalsIgnoreCase(position))
            return new SouthMove();
        else if(EnumPosition.WEST.getPosition().equalsIgnoreCase(position))
            return new WestMove();
        else if(EnumPosition.EAST.getPosition().equalsIgnoreCase(position))
            return new EastMove();
        else
            return null;
    }
}
