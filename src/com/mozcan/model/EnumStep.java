package com.mozcan.model;

public enum EnumStep {

    LEFT("L"),
    RIGHT("R"),
    FORWARD("M"),
    BACK("B");

    EnumStep() {
    }

    private String step;

    private EnumStep(String step){
        this.step=step;
    }

    public String getStep() {
        return step;
    }

}
