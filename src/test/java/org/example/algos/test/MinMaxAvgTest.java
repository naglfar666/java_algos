package org.example.algos.test;

import org.example.algos.dtos.MinMaxAvgDto;
import org.example.algos.services.MinMaxAvg;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MinMaxAvgTest {

    @Autowired
    private MinMaxAvg minMaxAvg;

    @Test
    public void testMinMaxAvg() {

        double[] array = { 2.5, 1.5, 2.0 };

        MinMaxAvgDto minMaxAvgDto = minMaxAvg.count(array);

        assertEquals(2.0, minMaxAvgDto.getAvg());
        assertEquals(1.5, minMaxAvgDto.getMin());
        assertEquals(2.5, minMaxAvgDto.getMax());
    }
}
