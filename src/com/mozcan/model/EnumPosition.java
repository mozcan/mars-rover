package com.mozcan.model;

public enum EnumPosition {

    NORTH("N"),
    SOUTH("S"),
    EAST("E"),
    WEST("W");

    EnumPosition() {
    }

    private String position;

    private EnumPosition(String position){
        this.position=position;
    }

    public String getPosition() {
        return position;
    }
}
