package com.mozcan;

import com.mozcan.service.*;

public class MoveStrategy {

    private Move move;

    public MoveStrategy(Move move) {
        this.move = move;
    }

    public String moveBack(int x,int y) {
        return move.moveBack(x,y);
    }

    public String moveForwward(int x,int y) {
        return move.moveForward(x,y);
    }
}
