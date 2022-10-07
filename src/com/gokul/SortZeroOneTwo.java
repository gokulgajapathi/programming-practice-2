package com.gokul;
//GFG link: https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1

public class SortZeroOneTwo {


            // Sort the array(0's, 1's & 2's)
            static void sortArr(int[] arr, int n)
            {
                int i, Count0 = 0, Count1 = 0, Count2 = 0;

                // Count(0's, 1's & 2's) in the array
                for (i = 0; i < n; i++) {
                    switch (arr[i]) {
                        case 0 -> Count0++;
                        case 1 -> Count1++;
                        case 2 -> Count2++;
                    }
                }


                i = 0;//Re-assign i

                // Store 0's
                while (Count0 > 0) {
                    arr[i++] = 0;
                    Count0--;
                }

                // Then 1's
                while (Count1 > 0) {
                    arr[i++] = 1;
                    Count1--;
                }

                // Finally 2's
                while (Count2 > 0) {
                    arr[i++] = 2;
                    Count2--;
                }
            }


            public static void main(String[] args)
            {
                int[] arr = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
                int n = arr.length;
                sortArr(arr, n);
                for (int j : arr) System.out.print(j + " ");
            }
        }