package com.bridgelabz;

import java.util.Scanner;

public class AscendingOrder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int num = sc.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter " + (i + 1) + " element of array");
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array.length; i++) {


            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Array in ascending order ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
