package com.techreturners;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTests {
    @ParameterizedTest(name = "{index}) For the input {0}, the highest number is {1}")
    @MethodSource
    public void checkMaxNumber(int[] input, Integer expectedValue) {
        assertEquals(expectedValue, Math.maxNumber(input));
    }

    public static Stream<Arguments> checkMaxNumber() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 9, 5}, 9),
                Arguments.of(null, 0),
                Arguments.of(new int[]{}, 0),
                Arguments.of(new int[]{6, 6, 6, 6}, 6),
                Arguments.of(new int[]{1, -1, 8, -5, 3}, 8)
        );
    }
}