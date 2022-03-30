package com.techreturners;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTests {
    @Test
    public void checkMaxNumber() {
        //Arrange
        int[] input = new int[]{1, 3, 9, 5};

        //Act
        Integer actual = Math.maxNumber(input);

        //Assert
        assertEquals(9, actual);
    }
}