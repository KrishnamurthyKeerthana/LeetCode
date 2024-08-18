package org.example;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
        public static void main(String[] args) {
            int[] array1 = {1, 2, 3};
            int[] array2 = {9, 7, 6, 8};

            MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
            System.out.println((medianOfTwoSortedArrays.newFunction(array1, array2)));
        }

        public double newFunction(int[] array1, int[] array2){
            int[] merged = new int[array1.length + array2.length];
//            int k=0;
//            for (int j : array1) {
//                merged[k++] = j;
//            }
//            for (int j : array2) {
//                merged[k++] = j;
//            }

            System.arraycopy(array1, 0, merged, 0, array1.length);
            System.arraycopy(array2, 0, merged, array1.length, array2.length);

            Arrays.sort(merged);
            int n = merged.length;
            if(n % 2 == 1)
                return (double) merged[n/2];
            else{
                int middle1 = merged[n/2 - 1];
                int middle2 = merged[n/2];
                return ((double) middle1 + (double) middle2)/2;
            }
        }
}


