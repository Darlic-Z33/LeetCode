package com.simple;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 */
public class reverse {
    public static void main(String[] args) {
        System.out.println(reverse(23450));
    }
    public static int reverse(int x) {
//        String temp = "";
//        int ans = 0 ;
//        temp = x + "";
//        String temp2 = "";
//        for(int i = 0;i<temp.length();i++){
//            temp2 = temp.substring(i,i+1) + temp2;
//        }
//        try {
//            if(x < 0){
//                ans = 0 - Integer.parseInt(temp2.substring(0,temp2.length()-1));
//            }else if(x > 0){
//                ans = Integer.parseInt(temp2);
//            }
//        }catch (Exception e){
//        }
//
//        return ans;
        int ans = 0;
        while(x != 0){
            //此处判断是否溢出
            if(ans * 10 / 10 != ans){
                ans = 0;
                break;
            }
            ans = ans * 10 + x % 10;
            x = x / 10;
        }
        return ans;
    }
}
