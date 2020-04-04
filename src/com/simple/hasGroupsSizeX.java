package com.simple;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class hasGroupsSizeX {
    public static void main(String[] args) {
        int[] deck = {1,2,3,4,4,3,2,1};
        System.out.println(hasGroupsSizeX(deck));
    }
    public static boolean hasGroupsSizeX(int[] deck) {
        int[] nums = new int [10000];
        for(int item : deck){
            nums[item]++;
        }
        int temp = 0;
        for(int i = 0; i<10000;i++){
            if(nums[i] == 1){
                return false;
            }
            if(nums[i] > 1){
                temp = gcd(temp,nums[i]);
            }
        }
        if (temp >= 2){
            return true;
        }else{
            return false;
        }


    }
    /**
     * 求最大公约数 如果大于1，满足要求
     * 辗转相除法(欧几里德算法) 例如，求（319，377）： ∵ 319÷377=0（余319）
     *      * ∴（319，377）=（377，319）； ∵ 377÷319=1（余58） ∴（377，319）=（319，58）； ∵
     *      * 319÷58=5（余29） ∴ （319，58）=（58，29）； ∵ 58÷29=2（余0） ∴ （58，29）= 29； ∴
     *      * （319，377）=29。 可以写成右边的格式。
     *      * 用辗转相除法求几个数的最大公约数，可以先求出其中任意两个数的最大公约数，
     *          再求这个最大公约数与第三个数的最大公约数，依次求下去，直到最后一个数为止。
     *      * 最后所得的那个最大公约数，就是所有这些数的最大公约数。
     *
     */
    private static int gcd(int a,int b){
        return b == 0 ? a : gcd(b,a % b);
//        if(a == 0){
//            return b;
//        }
//        int res = 0;
//        while(b != 0){
//            res = a % b;
//            a = b;
//            b = res;
//
//        }
//        return a;

        //return b == 0 ? a: gcd(b, a % b);
    }

}
