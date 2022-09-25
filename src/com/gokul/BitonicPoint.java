package com.gokul;

public class BitonicPoint {
    public static void main(String[] args) {

        /*//input for array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store:");
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {

            System.out.print("Enter the elements:");
            arr[i] = sc.nextInt();
            }*/

         //Test case-1
        int N = 5;
        int[] arr = {1, 45, 47, 50, 5};

        /* //Test case-2
        int N = 9;
        int[] arr = {1, 15, 25, 45, 42, 21, 17, 12, 11};*/

            int start = 0;
            int end = arr.length;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                //return bitonic point
                if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
                    System.out.println("Bitonic point is " + arr[mid]);
                    break;
                }

                //right element of mid is greater than mid
                if (arr[mid] < arr[mid + 1])
                    end = end + 1;


                    //left element of mid is greater than mid
                else
                    end = end - 1;


            }


        }
    }

