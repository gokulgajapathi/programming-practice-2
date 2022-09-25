package com.gokul;

// GeeksForGeeks Question Link: https://practice.geeksforgeeks.org/problems/find-transition-point-1587115620/0




class Transition_point {
    public static void main(String[] args) {
        //Test case-1
/*//Input:
        int N = 5;
        int[] arr = {0,0,0,1,1};
        //Output: 3*/


//Test case-2
//Input:
        int N = 4;
        int[] arr = {0,0,0,0};
        //Output: -1

     /*   Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements:");
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Enter " + i + "th position element:");
            arr[i] = sc.nextInt();

            }*/
        System.out.println(transitionPoint(arr,N));
    }

     public static int transitionPoint(int[] arr, int N) {
        if (arr[N - 1] == 0) {
            return  -1;
        }
        if(arr[0] == 1){
            return 0;
        }
        int start = 0;
        int end = N-1;


        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == 1 && arr[mid-1] == 0){
                return  mid;
            }
            else if(arr[mid] == 0){
                start = mid+1;
            }
            else if (arr[mid] == 1){
                start = mid-1;
            }
        }

        return 0;
    }


}
