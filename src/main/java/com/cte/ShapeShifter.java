package com.cte;

import java.util.ArrayList;

public class ShapeShifter {

    private ArrayList<CoordinateModel> coordinates;

    public ShapeShifter(ArrayList<CoordinateModel> _coordinates){
        coordinates = _coordinates;
    }


    public String getShape() {

        String returnMessage = new String();

        if (coordinates.size()==0) returnMessage = "None";
        else if (coordinates.size()==1) returnMessage = "Dot";
        else if (coordinates.size()==2){
            returnMessage = checkLine(coordinates) ? "Line" : "Two dots on top of eachoter";
        }

        return returnMessage;

    }

    private boolean checkLine(ArrayList<CoordinateModel> coordinates){

        if (coordinates.size() != 2){
            return false;
        }
        else{
            //if the sum of the coordinates is equal to eachother it is not a line, it is two dots on top of eachother
            return
                    (coordinates.get(0).getX() + coordinates.get(0).getY() + coordinates.get(0).getZ()) !=
                    (coordinates.get(1).getX() + coordinates.get(1).getY() + coordinates.get(1).getZ());

        }

    }
}
