import java.util.Scanner;
class Transition_point{
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {0,0,0,1,1};

        Transition_point obj = new Transition_point();
        obj.transitionPoint();
    }
    int transitionPoint(int arr[], int n){
        arr[]= Transition_point.main(arr[]);
        n= Transition_point.main(n);
        int start = 0;
        int end = n-1;

            //if only 1 element and it is equal to 0
            if(n==1 && arr[0]==0)
                return -1;

        int transitionFinder = 0;
        //this loop helps to find transition point, which having more than 1 element
        while (start <= end){
            int mid = start + end /2;

            //return mid as a transition point
            if(arr[mid]==1 && arr[mid-1]==0){
                return mid;
            }
            //search left elements
            else if (arr[mid]==1){
                transitionFinder=1;
                end = mid-1;
            }
            //search right elements
            else{
                start = mid+1;
            }

        }

        //if there is no element which value is 1
        if(transitionFinder==0)
            return -1;

    }
}