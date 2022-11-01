package com.bridgelabz;

import java.util.Scanner;

public class EvenPosition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements you want to take in array");
        int num = sc.nextInt();
        int[] array = new int[num];
        for (int i=0 ; i< array.length;i++) {
            System.out.println("Enter "+ (i+1) + " element of array");
            array[i]=sc.nextInt();

        }
        System.out.print("Elements in even position are : ");
        for (int j=0 ; j< array.length;j=j+2){
            System.out.print( array[j] + " , ");
        }
    }
}
