package com.cte;

import java.util.ArrayList;

public class ShapeShifter {

    private ArrayList<CoordinateModel> coordinates;

    public ShapeShifter(ArrayList<CoordinateModel> _coordinates){
        coordinates = _coordinates;
    }


    public String getShape() {

        if (coordinates.size()==0) return "None";

        return null;
    }
}
