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
        else if (coordinates.size()==2) returnMessage = checkLine(coordinates) ? "Line" : "Two dots on top of eachoter";
        else if (coordinates.size()==3) returnMessage = checkTriangle(coordinates) ? "Triangle" : "Thats no triangle";
        else if (coordinates.size()==4) returnMessage = checkSquareFormat(coordinates);


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

    private boolean checkTriangle(ArrayList<CoordinateModel> coordinates){
        return coordinates.size() == 3;
    }

    private String checkSquareFormat(ArrayList<CoordinateModel> coordinates){
        String returnMessage = new String();
        if (coordinates.size() != 4) return "Not 4 coordinates";

        //Lika långt mellan punkterna på axlarna returnerar ”Square”
        //Antar att min square ligger i ett plan, dvs korsar inga plan
        //utgår från att koordinaterna kommer i tur och ordning, dvs punkt 0, punkt 1 osv
        coordinates.get(0).getX();
        coordinates.get(1).getX();
        coordinates.get(2).getX();
        coordinates.get(3).getX();
        returnMessage = "Square";

        //Lika långt mellan parallella axlar returnerar ”Rectangle”
        returnMessage = "Rectangle";

        //En offset mellan parallella axlars koordinater returnerar ”Parallelogram”
        returnMessage = "Parallelogram";

        return returnMessage;
    }
}
