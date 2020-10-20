package org.example.algos.test;

import org.example.algos.services.PrimeNumbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PrimeNumbersTest {

    @Autowired
    private PrimeNumbers primeNumbers;

    @Test
    @DisplayName("Получение списка простых чисел из массива")
    public void getPrimeNumbersFromArrayTest() {
        int length = 100;
        int[] array = new int[length - 1];
        for (int i = 0; i < length - 1; i++) {
            array[i] = i + 2;
        }
        int[] sortedArray = primeNumbers.getFromArray(array);
        Assertions.assertEquals(
                Arrays.toString(new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97}),
                Arrays.toString(sortedArray)
        );
    }

}
