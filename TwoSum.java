package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args){

        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 0, 1};
        int target = 9;
        System.out.println(Arrays.toString(twoSum.solution(nums, target)));
    }

    public int[] solution(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int comp = target - nums[i];
            if(map.containsKey(comp))
                return new int[]{comp, i};
            else
                map.put(nums[i], i);
        }
        return new int[]{};
    }
}
