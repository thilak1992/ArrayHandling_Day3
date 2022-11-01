package com.bridgelabz;

public class DescendingOrder {
    public static void printarray(int array[]) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void rearrange(int array[]) {
        int temp;
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }
        }


    }


    public static void main(String[] args) {
        int[] array = new int[]{20, 30, 40, 45, 345, 234, 12, 23, 34, 43};
        System.out.print("Elements of array before sorting is : ");
        printarray(array);

        rearrange(array);
        System.out.print("Elements of array after sorting is : ");
        printarray(array);

    }
}
