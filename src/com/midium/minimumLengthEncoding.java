package com.midium;

import java.util.Arrays;
import java.util.HashSet;

public class minimumLengthEncoding {
    public static void main(String[] args) {
        String[] words = {"time", "me", "bell"};
        minimumLengthEncoding(words);
    }
/**
 * 给定一个单词列表，我们将这个列表编码成一个索引字符串 S 与一个索引列表 A。
 *
 * 例如，如果这个列表是 ["time", "me", "bell"]，我们就可以将其表示为 S = "time#bell#" 和 indexes = [0, 2, 5]。
 *
 * 对于每一个索引，我们可以通过从字符串 S 中索引的位置开始读取字符串，直到 "#" 结束，来恢复我们之前的单词列表。
 *
 * 那么成功对给定单词列表进行编码的最小字符串长度是多少呢？
 *
 *
 */
    /**
     * 思路：把这些字符串放进set，先去除相同的串
     * 然后依次remove 子串
     * @param words
     * @return
     */
    public static int minimumLengthEncoding(String[] words) {
        HashSet<String> encodingSet = new HashSet<>(Arrays.asList(words));
        for(String word : words){
            for(int i = 1; i<word.length();i++){
                encodingSet.remove(word.substring(i));
            }
        }
        int res = 0;
        for(String word : encodingSet){
            res += word.length() + 1;
        }
        return res;

        //思考，indexes怎么获得？特别是被removed的串
//        String ans = "";
//        int[] indexes = new int[20];
//        for(int i = 0; i < words.length; i++){
//            if(encodingSet.contains(words[i])){
//                indexes[i] = ans.length();
//                ans += words[i]+"#";
//            }
//        }
//        System.out.println(ans);
//        System.out.println(Arrays.toString(indexes));

    }
}
