package com.mozcan.service;

public class SouthMove implements Move {

    @Override
    public String moveForward(int x, int y) {
        y-=1;
        return x + " " + y;
    }

    @Override
    public String moveBack(int x, int y) {
        y+=1;
        return x + " " + y;
    }
}
