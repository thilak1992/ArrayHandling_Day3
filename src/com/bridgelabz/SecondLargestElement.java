package com.bridgelabz;

public class SecondLargestElement {

    public static void main(String[] args) {
        int[] array = {2, 45, 32, 43, 12, 33, 55, 21, 45, 6, 67, 99, 50};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {

                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Array after sorting is ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Second largest element of array is " + (array[array.length - 2]));
    }
}
