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

    @Test
    public void checkMaxNumberWhenArrayIsNull() {
        //Arrange
        int[] input = null;

        //Act
        Integer actual = Math.maxNumber(input);

        //Assert
        assertEquals(0, actual);
    }

    @Test
    public void checkMaxNumberWhenArrayIsEmpty() {
        //Arrange
        int[] input = new int[]{};

        //Act
        Integer actual = Math.maxNumber(input);

        //Assert
        assertEquals(0, actual);
    }

    @Test
    public void checkMaxNumberWhenAllNumbersAreTheSame() {
        //Arrange
        int[] input = new int[]{6, 6, 6, 6};

        //Act
        Integer actual = Math.maxNumber(input);

        //Assert
        assertEquals(6, actual);
    }

    @Test
    public void checkMaxNumberWhenThereAreNegativeNumbers() {
        //Arrange
        int[] input = new int[]{1, -1, 8, -5, 3};

        //Act
        Integer actual = Math.maxNumber(input);

        //Assert
        assertEquals(8, actual);
    }
}