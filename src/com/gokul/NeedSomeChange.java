package com.gokul;
//GFG link: https://practice.geeksforgeeks.org/problems/need-some-change/1

/*//Test case
Input:
        n = 5
        arr[] = 1 2 3 4 5
        Output:
        3 4 5 2 1*/

import java.util.Scanner;

public class NeedSomeChange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements:");
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Enter " + i + "th position element:");
            arr[i] = sc.nextInt();
        }

        int temp;
            for (int j = 0; j < N-2; j++) {
                temp = arr[j+2];
                arr[j+2] = arr[j];
                arr[j] = temp;
            }

        System.out.println("Output:");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i]);
        }
    }
}
