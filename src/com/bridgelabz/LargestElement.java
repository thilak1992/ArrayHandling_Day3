package com.bridgelabz;

import java.util.Scanner;

public class LargestElement {

    public static void main(String[] args) {

        int[] array = {20,50,76,64,56,45,89,25,47};
        int max = array[0];
        for (int i=1;i< array.length;i++){

            if (array[i]>max){
                max=array[i];
            }
        }
        System.out.println("Largest element of array is " + max);

    }
}
