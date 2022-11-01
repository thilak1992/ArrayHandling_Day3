package com.bridgelabz;

import java.util.Scanner;

public class OddPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Define size of array you want to take");
        byte num = sc.nextByte();
        int array[] = new int[num];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter " + i + " element of array");
            array[i] = sc.nextInt();


        }
        System.out.print("Elements in odd position are : ");
        for (int j = 1; j < array.length; j = j + 2) {
            System.out.print(array[j] + " ");
        }
    }
}
