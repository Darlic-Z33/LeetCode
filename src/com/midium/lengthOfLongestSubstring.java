package com.midium;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author Z33
 * @create 2020-04-07 20:53
 * @desc
 */
public class lengthOfLongestSubstring {
    public static void main(String[] args) {
        String a = "akjhgahabb";
        System.out.println(lengthOfLongestSubstring(a));

    }
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> charMap = new HashMap();
        int max = 0;
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            //如果出现过某字符，则左窗口移动到上一次出现位置的后一个位置
            if(charMap.containsKey(s.charAt(i))){
               index = Math.max(charMap.get(s.charAt(i))+1,index);
            }
            //如果没有移动，那么左窗口是不变的，在上一个位置已经记录了max
            max = Math.max(max,i-index+1);
            //移动后把当前重复字符的位置信息更新
            charMap.put(s.charAt(i), i);

        }
        return max;
    }
}
