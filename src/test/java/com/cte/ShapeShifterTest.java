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
}