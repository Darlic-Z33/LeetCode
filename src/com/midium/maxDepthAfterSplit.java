package com.midium;

import java.util.*;

public class maxDepthAfterSplit {
    public static void main(String[] args) {
        String seq = "()(()())()()()()()(())";
        int[] a = new maxDepthAfterSplit().maxDepthAfterSplit(seq);
        System.out.println(Arrays.toString(a));
    }
    public int[] maxDepthAfterSplit(String seq) {
        if(seq.equals("")){
            return new int[0];
        }
        //括号匹配，算出seq中的深度
        Stack symbol = new Stack();
        int count =0 ;
        int[] flag = new int[seq.length()];
        char[] seqChar = seq.toCharArray();
        for(int i = 0;i<seqChar.length;i++){
            if(seqChar[i] == ')'){
                symbol.pop();
                int temp = (int)symbol.pop();
                int deep = count;
                flag[temp] = deep;
                flag[i] = deep;
                count--;

            }else {
                symbol.push(i);
                symbol.push(seqChar[i]);
                count++;
            }
        }
        System.out.println(Arrays.toString(flag));

        //去重
        HashSet deepSet = new HashSet();
        for (int item : flag) {
            deepSet.add(item);
        }

        //找到mid
        ArrayList a = new ArrayList(deepSet);
        Collections.sort(a);
        int mid = (int)a.get((a.size()-1)/2);


       //分组
        for (int i = 0; i < flag.length; i++) {
            if(flag[i] <= mid){
                flag[i] = 1;
            }else{
                flag[i] = 0;
            }
        }
        return flag;
    }
}
