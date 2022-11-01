package com.bridgelabz;

import java.util.Scanner;

public class ReverseOrderArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length you want to take");
        byte num = sc.nextByte();

        int[] array = new int[num];

        for (int a = 0; a < num; a++) {
            System.out.println("Enter " + (a + 1) + " element of array");
            array[a] = sc.nextInt();
        }
        System.out.print("Array in reversing order is : ");
        for (int j = array.length - 1; j >= 0; j--) {
            System.out.print(array[j] + " ");

        }

    }
}
