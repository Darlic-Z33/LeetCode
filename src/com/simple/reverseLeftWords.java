package com.simple;

public class reverseLeftWords {
    public static void main(String[] args) {
        String res = new reverseLeftWords().reverseLeftWords("lrloseumgh",6);
        System.out.println(res);
    }
    public String reverseLeftWords(String s, int n) {
        String s2 = s + s;
        return s2.substring(n,s.length()+n);
    }
}
