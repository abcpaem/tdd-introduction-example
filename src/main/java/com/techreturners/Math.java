package com.techreturners;

import java.util.Arrays;

public class Math {
    static Integer maxNumber(int[] array) {
        if (array == null || array.length == 0) return 0;
        return Arrays.stream(array).max().getAsInt();
    }
}
