package com.midium;

import java.util.Arrays;

/**
 * @author Z33
 * @create 2020-04-07 20:26
 * @desc
 */
public class rotate {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(a);
        System.out.println(Arrays.toString(a));
    }
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        //左右翻转
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix [i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
        //对角线翻转，左上和右下
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-1-j][n-1-i];
                matrix[n-1-j][n-1-i] = temp;
            }
        }
    }
}
