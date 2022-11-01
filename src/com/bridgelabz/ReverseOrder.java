package com.bridgelabz;

import java.util.Scanner;

public class ReverseOrder {
    public static int[] reverse(int[] array) {
        int[] reverse = new int[array.length];
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            reverse[j] = array[i];

        }
        return reverse;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length you want to take");
        byte num = sc.nextByte();

        int[] array = new int[num];


        for (int a = 0; a < num; a++) {
            System.out.println("Enter " + (a + 1) + " element of array");
            array[a] = sc.nextInt();

        }

        int[] array1 = reverse(array);

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);

        }

    }

}
