package com.gokul;

//GFG Link: https://practice.geeksforgeeks.org/problems/equilibrium-point-1587115620/1

public class EquilibriumPoint {



        int equilibrium(int[] arr, int n)
        {
            int sum = 0;
            int lsum = 0; // left sum

            /* Sum of array */
            for (int i = 0; i < n; i++)
                sum += arr[i];

            for (int i = 0; i < n; i++) {
                sum -= arr[i]; // right sum by removing left elements


                if (lsum == sum) // return equilibrium point index
                    return i;

                lsum += arr[i];
            }

            /* If no equilibrium index found, then return -1 */
            return -1;
        }


        public static void main(String[] args)
        {
            EquilibriumPoint equi = new EquilibriumPoint();
            int[] arr = { -7, 1, 5, 2, -4, 3, 0 };
            int arr_size = arr.length;

            System.out.println("First equilibrium index is " + equi.equilibrium(arr, arr_size));
        }
}
