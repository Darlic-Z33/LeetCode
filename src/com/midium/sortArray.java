package com.midium;

import java.util.Arrays;

public class sortArray {
    public static void main(String[] args) {
        int[] nums = {5, 3, 4, 1, 9, 0, 7};
        new sortArray().sortArray(nums);
    }

    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
        return nums;
    }

    private void quickSort(int[] nums, int i, int j) {
        if (i >= j) {
            return;
        }
        int left = i;
        int right = j;
        int baseVal = nums[i];
        while (left != right) {
            while (left < right && nums[right] > baseVal) {
                right--;
            }
            while (left < right && nums[left] <= baseVal) {
                left++;
            }
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
        nums[i] = nums[left];
        nums[left] = baseVal;

        quickSort(nums, i, left - 1);
        quickSort(nums, right+1,j);
    }
}
