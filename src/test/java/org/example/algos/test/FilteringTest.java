package org.example.algos.test;

import org.example.algos.services.Filtering;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class FilteringTest {

    @Autowired
    private Filtering filtering;

    @Test
    @DisplayName("Удаление вхождений числа из массива целых чисел")
    void removeIntegersFromArrayTest() {
        int[] filterResult = filtering.removeIntegerFromArray(new int[]{1,2,1,3,1,4}, 1);
        Assertions.assertEquals(Arrays.toString(new int[]{2,3,4}), Arrays.toString(filterResult));
    }
}
