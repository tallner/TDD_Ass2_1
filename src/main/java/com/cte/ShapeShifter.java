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
        else if (coordinates.size()==5) returnMessage = checkPyramidFormat(coordinates) ? "Pyramid" : "Thats no pyramid";


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

    private LengthModel coordinatesDistance(ArrayList<CoordinateModel> _coordinates){
        ArrayList<CoordinateModel> coordinates = new ArrayList<>();
        for (CoordinateModel item: _coordinates) {
            coordinates.add(item);
        }
        if (coordinates.size() == 5 )
            coordinates.remove(4);
        else if (coordinates.size() != 4)
            return null;

        int x_sum = coordinates.get(0).getX() + coordinates.get(1).getX() + coordinates.get(2).getX() + coordinates.get(3).getX();
        int y_sum = coordinates.get(0).getY() + coordinates.get(1).getY() + coordinates.get(2).getY() + coordinates.get(3).getY();
        int z_sum = coordinates.get(0).getZ() + coordinates.get(1).getZ() + coordinates.get(2).getZ() + coordinates.get(3).getZ();

        boolean xy_shape = x_sum != 0 && y_sum!=0 && z_sum==0;
        boolean xz_shape = x_sum != 0 && y_sum==0 && z_sum!=0;
        boolean yz_shape = x_sum == 0 && y_sum!=0 && z_sum!=0;

        //only check one plane, either XY, YZ or XZ
        if (!xy_shape && !xz_shape && !yz_shape)
            return null;

        LengthModel lenghts = new LengthModel();


        int x1 = coordinates.get(0).getX();
        int x2 = coordinates.get(1).getX();
        int x3 = coordinates.get(2).getX();
        int x4 = coordinates.get(3).getX();
        int y1 = coordinates.get(0).getY();
        int y2 = coordinates.get(1).getY();
        int y3 = coordinates.get(2).getY();
        int y4 = coordinates.get(3).getY();
        int z1 = coordinates.get(0).getZ();
        int z2 = coordinates.get(1).getZ();
        int z3 = coordinates.get(2).getZ();
        int z4 = coordinates.get(3).getZ();


        double px1 = Math.pow(x1,2);
        double px2 = Math.pow(x2,2);
        double px3 = Math.pow(x3,2);
        double px4 = Math.pow(x4,2);
        double py1 = Math.pow(y1,2);
        double py2 = Math.pow(y2,2);
        double py3 = Math.pow(y3,2);
        double py4 = Math.pow(y4,2);
        double pz1 = Math.pow(z1,2);
        double pz2 = Math.pow(z2,2);
        double pz3 = Math.pow(z3,2);
        double pz4 = Math.pow(z4,2);

        //calculate length between coordinates
        if (xy_shape){
            lenghts.d12 = Math.sqrt(px1+px2+py1+py2-2*((x1*x2)+(y1*y2)));
            lenghts.d13 = Math.sqrt(px1+px3+py1+py3-2*((x1*x3)+(y1*y3)));
            lenghts.d14 = Math.sqrt(px1+px4+py1+py4-2*((x1*x4)+(y1*y4)));
            lenghts.d23 = Math.sqrt(px2+px3+py2+py3-2*((x2*x3)+(y2*y3)));
            lenghts.d24 = Math.sqrt(px2+px4+py2+py4-2*((x2*x4)+(y2*y4)));
            lenghts.d34 = Math.sqrt(px3+px4+py3+py4-2*((x3*x4)+(y3*y4)));
            lenghts.xy_shape = true;

        }else if (xz_shape){
            lenghts.d12 = Math.sqrt(px1+px2+pz1+pz2-2*((x1*x2)+(z1*z2)));
            lenghts.d13 = Math.sqrt(px1+px3+pz1+pz3-2*((x1*x3)+(z1*z3)));
            lenghts.d14 = Math.sqrt(px1+px4+pz1+pz4-2*((x1*x4)+(z1*z4)));
            lenghts.d23 = Math.sqrt(px2+px3+pz2+pz3-2*((x2*x3)+(z2*z3)));
            lenghts.d24 = Math.sqrt(px2+px4+pz2+pz4-2*((x2*x4)+(z2*z4)));
            lenghts.d34 = Math.sqrt(px3+px4+pz3+pz4-2*((x3*x4)+(z3*z4)));
            lenghts.xz_shape = true;

        }else if (yz_shape){
            lenghts.d12 = Math.sqrt(py1+py2+pz1+pz2-2*((y1*y2)+(z1*z2)));
            lenghts.d13 = Math.sqrt(py1+py3+pz1+pz3-2*((y1*y3)+(z1*z3)));
            lenghts.d14 = Math.sqrt(py1+py4+pz1+pz4-2*((y1*y4)+(z1*z4)));
            lenghts.d23 = Math.sqrt(py2+py3+pz2+pz3-2*((y2*y3)+(z2*z3)));
            lenghts.d24 = Math.sqrt(py2+py4+pz2+pz4-2*((y2*y4)+(z2*z4)));
            lenghts.d34 = Math.sqrt(py3+py4+pz3+pz4-2*((y3*y4)+(z3*z4)));
            lenghts.yz_shape = true;

        }else return null;


        return lenghts;
    }

    private String checkSquareFormat(ArrayList<CoordinateModel> coordinates){
        String returnMessage;

        LengthModel lengths = coordinatesDistance(coordinates);


        if (coordinates.size() != 4)
            return "Not 4 coordinates";

        //check if length calculator generates null
        if (lengths == null)
            return "Bad coordinates";

        //Antar att min square ligger i ett plan, dvs korsar inga plan
        //Lika långt mellan punkterna på axlarna returnerar ”Square” och diagonalen är samma
        if (lengths.d12==lengths.d14 && lengths.d12==lengths.d23 && lengths.d12==lengths.d34 && lengths.d13==lengths.d24)
            returnMessage = "Square";

        //Lika långt mellan parallella axlar returnerar ”Rectangle” och diagonalen är samma
        else if (lengths.d12==lengths.d34 && lengths.d23==lengths.d14 && lengths.d13==lengths.d24)
            returnMessage = "Rectangle";

        //Lika långt mellan parallella axlar returnerar ”Parallelogram” och diagonalen inte är samma
        else if (lengths.d12==lengths.d34 && lengths.d23==lengths.d14 && lengths.d13!=lengths.d24)
            returnMessage = "Parallelogram";

        else returnMessage = "2D Shape";

        return returnMessage;
    }

    private boolean checkPyramidFormat(ArrayList<CoordinateModel> coordinates) {
        LengthModel lengths = coordinatesDistance(coordinates);
        ArrayList<CoordinateModel> fourCoordinates = new ArrayList<>();
        fourCoordinates.add(coordinates.get(0));
        fourCoordinates.add(coordinates.get(1));
        fourCoordinates.add(coordinates.get(2));
        fourCoordinates.add(coordinates.get(3));

        boolean squareOrRectangle = checkSquareFormat(fourCoordinates).equals("Square") || checkSquareFormat(fourCoordinates).equals("Rectangle");

        System.out.println(squareOrRectangle);
        System.out.println(lengths);
        System.out.println(coordinates.get(4).getZ());

        if (squareOrRectangle){
            if (lengths.xy_shape && coordinates.get(4).getZ()!=0){
                return true;
            }else if (lengths.xz_shape && coordinates.get(4).getY()!=0){
                return true;
            }else if (lengths.yz_shape && coordinates.get(4).getX()!=0){
                return true;
            }
        }

        return false;

    }

}
