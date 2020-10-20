package org.example.algos.test;

import org.example.algos.services.Sorting;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SortingTest {

    @Autowired
    private Sorting sorting;

    @Test
    @DisplayName("Сортировка массива дробных чисел пузырьком")
    public void doubleArrayBubbleSortTest() {
        double[] array = {1.0, 0.5, 3.2, 1.7};

        double[] sortedArray = sorting.arrayBubbleSort(array);
        Assertions.assertEquals(Arrays.toString(new double[]{0.5, 1.0, 1.7, 3.2}), Arrays.toString(sortedArray));
    }

}
