package com.cte;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ShapeShifterTest{
    private ShapeShifter shapeShifter;
    private ArrayList<CoordinateModel> coordinateArrayList;

    @BeforeEach
    public void setUp(){
        coordinateArrayList = new ArrayList<>();
        shapeShifter = new ShapeShifter(coordinateArrayList);
    }

    @Test
    public void checkIfListIsEmpty(){
        String expected = "None";
        String actual = shapeShifter.getShape();
        assertEquals(expected,actual);
    }

    @Test
    public void checkIfOnlyOneCoordinate(){
        coordinateArrayList.add(new CoordinateModel(0,0,0));
        String expected = "Dot";
        String actual = shapeShifter.getShape();
        assertEquals(expected,actual);
    }

    @Test
    public void checkIfTwoCoordinatesFormsALine(){
        coordinateArrayList.add(new CoordinateModel(0,0,0));
        coordinateArrayList.add(new CoordinateModel(1,0,0));
        String expected = "Line";
        String actual = shapeShifter.getShape();
        assertEquals(expected,actual);
    }

    @Test
    public void checkIfThreeCoordinatesFormsATriangle(){
        coordinateArrayList.add(new CoordinateModel(0,0,0));
        coordinateArrayList.add(new CoordinateModel(1,0,0));
        coordinateArrayList.add(new CoordinateModel(2,0,0));
        String expected = "Triangle";
        String actual = shapeShifter.getShape();
        assertEquals(expected,actual);
    }

    @Test
    public void checkIfFourCoordinatesFormsASquareInXYPlane(){
        //we only test in one plane, so set 0 in z in order to test in the xy-plane
        coordinateArrayList.add(new CoordinateModel(0,0,0));
        coordinateArrayList.add(new CoordinateModel(0,5,0));
        coordinateArrayList.add(new CoordinateModel(5,5,0));
        coordinateArrayList.add(new CoordinateModel(5,0,0));
        String expected = "Square";
        String actual = shapeShifter.getShape();
        assertEquals(expected,actual);
    }

    @Test
    public void checkIfFourCoordinatesFormsASquareInXZPlane(){
        //we only test in one plane, so set 0 in y in order to test in the xz-plane
        coordinateArrayList.add(new CoordinateModel(0,0,0));
        coordinateArrayList.add(new CoordinateModel(0,0,5));
        coordinateArrayList.add(new CoordinateModel(5,0,5));
        coordinateArrayList.add(new CoordinateModel(5,0,0));
        String expected = "Square";
        String actual = shapeShifter.getShape();
        assertEquals(expected,actual);
    }

    @Test
    public void checkIfFourCoordinatesFormsASquareInYZPlane(){
        //we only test in one plane, so set 0 in x in order to test in the yz-plane
        coordinateArrayList.add(new CoordinateModel(0,0,0));
        coordinateArrayList.add(new CoordinateModel(0,5,0));
        coordinateArrayList.add(new CoordinateModel(0,5,5));
        coordinateArrayList.add(new CoordinateModel(0,0,5));
        String expected = "Square";
        String actual = shapeShifter.getShape();
        assertEquals(expected,actual);
    }

    @Test
    public void checkIfFourCoordinatesFormsARectangleInXYPlane(){
        coordinateArrayList.add(new CoordinateModel(0,0,0));
        coordinateArrayList.add(new CoordinateModel(3,0,0));
        coordinateArrayList.add(new CoordinateModel(3,2,0));
        coordinateArrayList.add(new CoordinateModel(0,2,0));
        String expected = "Rectangle";
        String actual = shapeShifter.getShape();
        assertEquals(expected,actual);
    }

    @Test
    public void checkIfFourCoordinatesFormsARectangleInXZPlane(){
        coordinateArrayList.add(new CoordinateModel(0,0,0));
        coordinateArrayList.add(new CoordinateModel(3,0,0));
        coordinateArrayList.add(new CoordinateModel(3,0,2));
        coordinateArrayList.add(new CoordinateModel(0,0,2));
        String expected = "Rectangle";
        String actual = shapeShifter.getShape();
        assertEquals(expected,actual);
    }

    @Test
    public void checkIfFourCoordinatesFormsARectangleYZPlane(){
        coordinateArrayList.add(new CoordinateModel(0,0,0));
        coordinateArrayList.add(new CoordinateModel(3,0,0));
        coordinateArrayList.add(new CoordinateModel(3,0,2));
        coordinateArrayList.add(new CoordinateModel(0,0,2));
        String expected = "Rectangle";
        String actual = shapeShifter.getShape();
        assertEquals(expected,actual);
    }

    @Test
    public void checkIfFourCoordinatesFormsAParallelogramInXYPlane(){
        coordinateArrayList.add(new CoordinateModel(0,0,0));
        coordinateArrayList.add(new CoordinateModel(10,0,0));
        coordinateArrayList.add(new CoordinateModel(15,3,0));
        coordinateArrayList.add(new CoordinateModel(5,3,0));
        String expected = "Parallelogram";
        String actual = shapeShifter.getShape();
        assertEquals(expected,actual);
    }

    @Test
    public void checkIfFourCoordinatesFormsAParallelogramInXZPlane(){
        coordinateArrayList.add(new CoordinateModel(0,0,0));
        coordinateArrayList.add(new CoordinateModel(10,0,0));
        coordinateArrayList.add(new CoordinateModel(15,0,3));
        coordinateArrayList.add(new CoordinateModel(5,0,3));
        String expected = "Parallelogram";
        String actual = shapeShifter.getShape();
        assertEquals(expected,actual);
    }

    @Test
    public void checkIfFourCoordinatesFormsAParallelogramInYZ(){
        coordinateArrayList.add(new CoordinateModel(0,0,0));
        coordinateArrayList.add(new CoordinateModel(0,0,10));
        coordinateArrayList.add(new CoordinateModel(0,3,15));
        coordinateArrayList.add(new CoordinateModel(0,3,5));
        String expected = "Parallelogram";
        String actual = shapeShifter.getShape();
        assertEquals(expected,actual);
    }

    @Test
    public void checkIfFourCoordinatesFormsA2DShapeInXYPlane(){
        coordinateArrayList.add(new CoordinateModel(0,0,0));
        coordinateArrayList.add(new CoordinateModel(10,0,0));
        coordinateArrayList.add(new CoordinateModel(1,3,0));
        coordinateArrayList.add(new CoordinateModel(5,3,0));
        String expected = "2D Shape";
        String actual = shapeShifter.getShape();
        assertEquals(expected,actual);
    }

    @Test
    public void checkIfFourCoordinatesFormsA2DShapeInXZPlane(){
        coordinateArrayList.add(new CoordinateModel(0,0,0));
        coordinateArrayList.add(new CoordinateModel(10,0,0));
        coordinateArrayList.add(new CoordinateModel(1,0,3));
        coordinateArrayList.add(new CoordinateModel(5,0,3));
        String expected = "2D Shape";
        String actual = shapeShifter.getShape();
        assertEquals(expected,actual);
    }

    @Test
    public void checkIfFourCoordinatesFormsA2DShapeInYZPlane(){
        coordinateArrayList.add(new CoordinateModel(0,0,0));
        coordinateArrayList.add(new CoordinateModel(0,0,10));
        coordinateArrayList.add(new CoordinateModel(0,3,1));
        coordinateArrayList.add(new CoordinateModel(0,3,5));
        String expected = "2D Shape";
        String actual = shapeShifter.getShape();
        assertEquals(expected,actual);
    }

    @Test
    public void checkIfFiveCoordinatesFormsAPyramid(){
        coordinateArrayList.add(new CoordinateModel(0,0,0));
        coordinateArrayList.add(new CoordinateModel(0,5,0));
        coordinateArrayList.add(new CoordinateModel(5,5,0));
        coordinateArrayList.add(new CoordinateModel(5,0,0));
        coordinateArrayList.add(new CoordinateModel(2,2,5));
        String expected = "Pyramid";
        String actual = shapeShifter.getShape();
        assertEquals(expected,actual);
    }

    @Test
    public void checkIfEightCoordinatesFormsACube(){
        coordinateArrayList.add(new CoordinateModel(0,0,0));
        coordinateArrayList.add(new CoordinateModel(5,0,0));
        coordinateArrayList.add(new CoordinateModel(5,5,0));
        coordinateArrayList.add(new CoordinateModel(0,5,0));

        coordinateArrayList.add(new CoordinateModel(10,0,0));
        coordinateArrayList.add(new CoordinateModel(15,0,0));
        coordinateArrayList.add(new CoordinateModel(15,5,0));
        coordinateArrayList.add(new CoordinateModel(10,5,0));

        String expected = "Cube";
        String actual = shapeShifter.getShape();
        assertEquals(expected,actual);
    }

    @Test
    public void checkIfEightCoordinatesFormsARectangularPrism(){
        coordinateArrayList.add(new CoordinateModel(0,0,0));
        coordinateArrayList.add(new CoordinateModel(10,0,0));
        coordinateArrayList.add(new CoordinateModel(10,5,0));
        coordinateArrayList.add(new CoordinateModel(0,5,0));

        coordinateArrayList.add(new CoordinateModel(20,0,0));
        coordinateArrayList.add(new CoordinateModel(30,0,0));
        coordinateArrayList.add(new CoordinateModel(30,5,0));
        coordinateArrayList.add(new CoordinateModel(20,5,0));

        String expected = "Rectangular Prism";
        String actual = shapeShifter.getShape();
        assertEquals(expected,actual);
    }

    @Test
    public void checkIfEightCoordinatesFormsAnother3DShape(){
        coordinateArrayList.add(new CoordinateModel(0,0,0));
        coordinateArrayList.add(new CoordinateModel(10,0,0));
        coordinateArrayList.add(new CoordinateModel(10,5,0));
        coordinateArrayList.add(new CoordinateModel(0,5,0));

        coordinateArrayList.add(new CoordinateModel(20,0,0));
        coordinateArrayList.add(new CoordinateModel(31,0,0));
        coordinateArrayList.add(new CoordinateModel(30,5,0));
        coordinateArrayList.add(new CoordinateModel(20,5,0));

        String expected = "3D Shape";
        String actual = shapeShifter.getShape();
        assertEquals(expected,actual);
    }
}