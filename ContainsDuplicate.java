package org.example;

public class ContainsDuplicate {

    public static void main(String[] args){
        int[] nums = {3, 2, 6, 5, 0, 9};
        int k = 1;
        System.out.println(containsNearbyDuplicate(nums, k));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        // ToDo: Write Your Code Here.
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }
}
