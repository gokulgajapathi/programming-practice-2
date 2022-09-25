package com.gokul;

//Find an extra element present in arr1[]
//GFG Link:https://practice.geeksforgeeks.org/problems/index-of-an-extra-element/1find%20an%20extra

public class IndexOfExtraElement {
    public static void main(String[] args) {
    	/*//Test case-1
		Input:
		N = 7
		A[] = {2,4,6,8,9,10,12}
		B[] = {2,4,6,8,10,12}
		Output: 4*/

/*		//Test case-2
		Input:
		N = 6
		A[] = {3,5,7,9,11,13}
		B[] = {3,5,7,11,13}*/

        int[] arr1 = {2, 3, 4, 6, 8,  12, 13};
        int[] arr2 = {2, 4, 6, 8, 10, 12};
        int n = arr2.length;


        System.out.println(findExtra(arr1, arr2, n));
    }


	static int findExtra(int[] arr1, int[] arr2, int n)
	{

		int index = n;


		int left = 0, right = n - 1;
		while (left <= right)
		{
			int mid = (left+right) / 2;


			if (arr2[mid] == arr1[mid])
				left = mid + 1;


			else
			{
				index = mid;
				right = mid - 1;
			}
		}


		return index;
	}



}
