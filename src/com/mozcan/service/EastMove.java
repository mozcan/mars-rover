package com.mozcan.service;

public class EastMove implements Move {

    @Override
    public String moveForward(int x, int y) {
        x+=1;
        return x + " " + y;
    }

    @Override
    public String moveBack(int x, int y) {
        x-=1;
        return x + " " + y;
    }
}
