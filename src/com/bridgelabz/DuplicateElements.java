package com.bridgelabz;

import java.util.Scanner;

public class DuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int num = sc.nextByte();
        int[] list = new int[num];
        for (int a=0;a<list.length;a++){
            System.out.println("Enter " + (a+1) +" element of array" );
            list[a]= sc.nextInt();

        }
        for (int i=0;i< list.length;i++){
            for(int j=i+1;j< list.length;j++){
                if (list[i]==list[j]){
                    System.out.println("Duplicate elements of array are : " + list[j]);
                }
            }
        }
    }
}
