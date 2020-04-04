package com.simple;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 *
 * 执行用时 :
 * 2 ms
 * , 在所有 Java 提交中击败了
 * 99.57%
 * 的用户
 * 内存消耗 :
 * 41.2 MB
 * , 在所有 Java 提交中击败了
 * 5.05%
 * 的用户
 */
public class twoSum {
    public static void main(String[] args) {
        int[] nums ={2, 7, 11, 15};
        int target = 22;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }

    /**
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap numMap = new HashMap();
        for(int i = 0;i<nums.length;i++){
            if(numMap.containsKey(nums[i])){
                res[0]=(int)numMap.get(nums[i]);
                res[1]=i;
                break;
            }
            numMap.put(target-nums[i],i);
        }
        return res;
    }
}
