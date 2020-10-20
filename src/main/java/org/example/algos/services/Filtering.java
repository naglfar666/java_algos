package org.example.algos.services;

import org.springframework.stereotype.Service;

@Service
public class Filtering {
    public int[] removeIntegerFromArray(int[] ints, int i) {
        int[] result = new int[0];
        for (int x = 0; x < ints.length; x++) {
            if (ints[x] != i) {
                if (result.length > 0) {
                    int[] tempArr = new int[result.length + 1];
                    System.arraycopy(result, 0, tempArr, 0, result.length);
                    tempArr[result.length] = ints[x];
                    result = tempArr;
                } else {
                    result = new int[1];
                    result[0] = ints[x];
                }
            }
        }
        return result;
    }
}
