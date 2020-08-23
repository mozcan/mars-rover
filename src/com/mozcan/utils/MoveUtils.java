package com.mozcan.utils;

import com.mozcan.model.EnumPosition;
import com.mozcan.model.EnumStep;

public class MoveUtils {

    public static String getLastPosition(String position,String step) {

        if(EnumPosition.NORTH.getPosition().equalsIgnoreCase(position) && EnumStep.LEFT.getStep().equalsIgnoreCase(step)) {
            return EnumPosition.WEST.getPosition();
        } else if(EnumPosition.NORTH.getPosition().equalsIgnoreCase(position) && EnumStep.RIGHT.getStep().equalsIgnoreCase(step)) {
            return EnumPosition.EAST.getPosition();
        } else if(EnumPosition.SOUTH.getPosition().equalsIgnoreCase(position) && EnumStep.LEFT.getStep().equalsIgnoreCase(step)) {
            return EnumPosition.EAST.getPosition();
        } else if(EnumPosition.SOUTH.getPosition().equalsIgnoreCase(position) && EnumStep.RIGHT.getStep().equalsIgnoreCase(step)) {
            return EnumPosition.WEST.getPosition();
        } else if(EnumPosition.EAST.getPosition().equalsIgnoreCase(position) && EnumStep.LEFT.getStep().equalsIgnoreCase(step)) {
            return EnumPosition.NORTH.getPosition();
        } else if(EnumPosition.EAST.getPosition().equalsIgnoreCase(position) && EnumStep.RIGHT.getStep().equalsIgnoreCase(step)) {
            return EnumPosition.SOUTH.getPosition();
        } else if(EnumPosition.WEST.getPosition().equalsIgnoreCase(position) && EnumStep.LEFT.getStep().equalsIgnoreCase(step)) {
            return EnumPosition.SOUTH.getPosition();
        } else if(EnumPosition.WEST.getPosition().equalsIgnoreCase(position) && EnumStep.RIGHT.getStep().equalsIgnoreCase(step)) {
            return EnumPosition.NORTH.getPosition();
        }

        return position;
    }

    public static boolean checkBoundaryViolation(String boundaries,String lastCoordinate) {
        String lastCoordinatList[] = lastCoordinate.split(" ");

        String boundaryList[] = boundaries.split(" ");

        if(Integer.parseInt(lastCoordinatList[0]) > Integer.parseInt(boundaryList[0]) || Integer.parseInt(lastCoordinatList[1]) > Integer.parseInt(boundaryList[1]))
            return true;
        return false;
    }
}
