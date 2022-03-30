package com.techreturners;

import java.util.Arrays;

public class Math {
    static Integer maxNumber(int[] array) {
        return Arrays.stream(array).max().getAsInt();
    }
}
