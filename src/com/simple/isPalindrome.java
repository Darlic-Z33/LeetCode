package com.simple;

/**
 * 回文数
 * <p>
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */
public class isPalindrome {
    public static void main(String[] args) {
        System.out.println(new isPalindrome().isPalindrome(10));
    }

    public boolean isPalindrome(int x) {
        if(x == 0){
            return true;
        }
        if (x < 0 || x % 10 == 0) {
            return false;
        }
        int temp = 0;
        int x2 = x;
        while (x != 0) {
            temp = temp * 10 + x % 10;
            x = x / 10;
        }
        return (x2 == temp);
    }
}
