package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddTwoTest {
     AddTwo addTwo = new AddTwo();

     @Test
    public void fivePlusThreeEqualsEight (){
         assertEquals(8, addTwo.addTwo(5, 3));
     }

     @Test
    public void sixPlusFourEqualsTen (){
        assertEquals(10, addTwo.addTwo(6, 4));
    }

    @Test
    public void sevenPlusFourEqualsEleven (){
        assertEquals(11, addTwo.addTwo(7, 4));
    }
}