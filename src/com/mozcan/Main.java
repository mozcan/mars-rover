package com.mozcan;

import com.mozcan.model.EnumStep;
import com.mozcan.service.Move;
import com.mozcan.utils.MoveUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Mars Robot User Screen!");

        System.out.println("Determine the Plateau Boundaries");
        String boundaries =  sc.nextLine();

        System.out.println("Please Enter Robot's Starting Coordinates - Ex: 1 1 N");
        String coordinates = sc.nextLine();

        System.out.println("Please Enter The Directions That The Robot Must Go - Ex:LMRRRMMMMR");
        String steps = sc.nextLine();

        System.out.println("The Last Robot Coordinates...");
        //System.out.println(move(coordinates,steps));
        move(coordinates,steps,boundaries);
    }

    public static String move(String coordinates,String steps,String boundaries) throws Exception {
        String coordinateList[] = coordinates.split(" ");

        String stepList[] = steps.split("");

        String lastPosition = coordinateList[2];
        String lastCoordinate = coordinateList[0] + " " + coordinateList[1];

        for(String step : stepList) {
            if(EnumStep.LEFT.getStep().equalsIgnoreCase(step) || EnumStep.RIGHT.getStep().equalsIgnoreCase(step)) {
                lastPosition = MoveUtils.getLastPosition(lastPosition,step);
            } else {

                Move move = MoveUtils.getMoveObject(lastPosition);
                MoveStrategy moveStrategy = new MoveStrategy(move);

                String lastCoordinatList[] = lastCoordinate.split(" ");

                if(EnumStep.FORWARD.getStep().equalsIgnoreCase(step)) {
                    lastCoordinate = moveStrategy.moveForwward(Integer.parseInt(lastCoordinatList[0]),Integer.parseInt(lastCoordinatList[1]));
                } else {
                    lastCoordinate = moveStrategy.moveBack(Integer.parseInt(lastCoordinatList[0]),Integer.parseInt(lastCoordinatList[1]));
                }

                if(Boolean.TRUE.equals(MoveUtils.checkBoundaryViolation(boundaries,lastCoordinate)))
                    throw new Exception("Border Violation!!!");
            }

            String lastCoordinatList2[] = lastCoordinate.split(" ");
            System.out.println(lastCoordinatList2[0] + " " + lastCoordinatList2[1] + " " + lastPosition);
        }

        return lastCoordinate + " " + lastPosition;
    }


}
