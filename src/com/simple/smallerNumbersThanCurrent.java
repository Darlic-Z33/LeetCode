package com.simple;

import java.util.Arrays;

public class smallerNumbersThanCurrent {
    public static void main(String[] args) {
        int[] a = {8,1,2,2,3};
        int[] b = new smallerNumbersThanCurrent().smallerNumbersThanCurrent(a);
        System.out.println(Arrays.toString(b));
    }
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            for(int j = 0;j<nums.length;j++){
                if(nums[i] > nums[j]){
                    ans[i]++;
                }
            }
        }
        return ans;
    }
}
