package com.hard;

/**
 * @author Z33
 * @create 2020-04-04 21:13
 * @desc
 */
public class trap {
    public static void main(String[] args) {
        int[] a = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(new trap().trap(a));
    }
    /**
     * 思路：
     * 分别往左右找最大值，然后取相对小值和原始高度相减
     * 原理：如果能接到雨水，说明左右两边都有比自己高度大的柱子
     */
    public int trap(int[] height) {
        int count = 0;
        for (int i = 0; i < height.length; i++) {
            //往右找
            int right = 0;
            for (int j = i+1; j < height.length; j++) {
                if(right < height[j]){
                    right = height[j];
                }
            }
            //往左找
            int left = 0;
            for (int j = i-1; j >= 0; j--) {
                if(left < height[j]){
                    left = height[j];
                }
            }
            int min = Math.min(left,right);
            if(min-height[i] > 0){
                count += min-height[i];
            }
        }
        return count;
    }

}
