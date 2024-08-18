package org.example;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {2, 4, 6};
        int x = 6;
        System.out.println(binarySearch(arr, x));
    }
    public static int binarySearch(int[] arr, int x){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] < x)
                low = mid+1;
            else if(arr[mid] > x)
                high = mid-1;
            else
                return mid;
        }
        return -1;
    }
}
