package org.example;

public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {2, 4, 6};
        int x = 2;
        System.out.println(linearSearch(arr, x));
    }
    public static int linearSearch(int[] arr, int x){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x)
                return i;
        }
        return -1;
    }
}
