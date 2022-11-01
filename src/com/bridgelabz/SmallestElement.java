package com.bridgelabz;

import java.util.Scanner;

public class SmallestElement {

    public static void main(String[] args) {
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("how many elements you want to insert in array");
        int num = sc.nextInt();
        int[] mylist = new int[num];
        for (int m = 0; m < mylist.length; m++) {
            System.out.println("Enter elements of array");
            mylist[m] = sc.nextInt();
        }
        int min = mylist[0];
        for (int i = 0; i < mylist.length; i++) {
            if (mylist[i] < min) {
                min = mylist[i];
            }
        }

        System.out.println("Smallest element in array is : " + min);


    }
}
