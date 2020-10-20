package org.example.algos.services;

import org.example.algos.dtos.MinMaxAvgDto;
import org.springframework.stereotype.Service;

@Service
public class MinMaxAvg {

    public MinMaxAvgDto count(double[] array) {
        double max = array[0];
        double min = array[0];
        double avg = 0;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
            avg += array[i]/array.length;
        }

        return new MinMaxAvgDto(min, max, avg);
    }

    public void countRand() {
        int length = 100;

        double[] array = new double[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }

        count(array);
    }

}
