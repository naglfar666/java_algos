package org.example.algos.services;

import org.springframework.stereotype.Service;

@Service
public class PrimeNumbers {

    public int[] getFromArray(int[] array) {
        int length = 0;
        int[] newArray = new int[0];
        for (int i = 0; i < array.length; i++) {
            boolean isPrime = true;

            for (int j = 0; j < array.length; j++) {
                if (array[i] % array[j] == 0 && array[i] != array[j]) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                length++;

                if (newArray.length > 0) {
                    int[] tempArray = new int[length];
                    System.arraycopy(newArray, 0, tempArray, 0, newArray.length);
                    tempArray[length - 1] = array[i];
                    newArray = tempArray;
                } else {
                    int[] tempArray = new int[length];
                    tempArray[0] = array[i];
                    newArray = tempArray;
                }

            }
        }

        return newArray;
    }
}
