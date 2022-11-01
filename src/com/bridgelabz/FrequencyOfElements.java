package com.bridgelabz;

public class FrequencyOfElements {
    static void countFrequency(int[] array, int size) {

        for (int i = 0; i < size; i++) {
            int flag = 0;
            int count = 0;

            for (int j = i + 1; j < size; j++) {
                if (array[i] == array[j]) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 1) {
                continue;
            }
            for (int j = 0; j <= i; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            System.out.println(array[i] + ": " + count);
        }
    }


    public static void main(String[] args) {

        int[] arr = {10, 80, 2, 10, 8, 10, 20, 50, 2, 2, 10, 8};
        int size = arr.length;
        countFrequency(arr, size);
    }
}

