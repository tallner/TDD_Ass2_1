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
        //coordinateArrayList.add(new CoordinateModel(0,0,0));
        
        shapeShifter = new ShapeShifter();

    }

    @Test
    public void checkIfListIsEmpty(){
        String expected = "None";
        String actual = shapeShifter.getShape();
        assertEquals(expected,actual);

    }
}