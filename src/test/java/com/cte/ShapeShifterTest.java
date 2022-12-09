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
    public void checkIfFourCoordinatesFormsASquare(){
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
    public void checkIfFourCoordinatesFormsARectangle(){
        coordinateArrayList.add(new CoordinateModel(0,0,0));
        coordinateArrayList.add(new CoordinateModel(3,0,0));
        coordinateArrayList.add(new CoordinateModel(3,2,0));
        coordinateArrayList.add(new CoordinateModel(0,2,0));
        String expected = "Rectangle";
        String actual = shapeShifter.getShape();
        assertEquals(expected,actual);
    }

    @Test
    public void checkIfFourCoordinatesFormsAParallelogram(){
        coordinateArrayList.add(new CoordinateModel(0,0,0));
        coordinateArrayList.add(new CoordinateModel(10,0,0));
        coordinateArrayList.add(new CoordinateModel(15,3,0));
        coordinateArrayList.add(new CoordinateModel(5,3,0));
        String expected = "Parallelogram";
        String actual = shapeShifter.getShape();
        assertEquals(expected,actual);
    }

    @Test
    public void checkIfFourCoordinatesFormsA2DShape(){
        coordinateArrayList.add(new CoordinateModel(0,0,0));
        coordinateArrayList.add(new CoordinateModel(10,0,0));
        coordinateArrayList.add(new CoordinateModel(1,3,0));
        coordinateArrayList.add(new CoordinateModel(5,3,0));
        String expected = "2D Shape";
        String actual = shapeShifter.getShape();
        assertEquals(expected,actual);
    }
}