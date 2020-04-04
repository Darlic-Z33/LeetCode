package com.simple;
/**
 * 约瑟夫问题
 */
public class lastRemaining {
    public static void main(String[] args) {
        System.out.println(new lastRemaining().lastRemaining(10 ,17));
    }

    /**
     * 0个人时游戏不存在，1个人时直接获胜，f为0
     * 所以从两个人开始 （n=0或1时不进循环）
     * 递推公式为 f(N,M)=(f(N−1,M)+M)%N
     * 即 f(2,m) = (f(1,m) + m) % 2
     * f(1,m)对应p
     * i为人数，从2开始，一直到给定的人数
     * @param n
     * @param m
     * @return
     */
    public int lastRemaining(int n, int m) {
        int f = 0;
        for(int i = 2;i<=n;i++){
            f=(f+m)%i;
        }
        return f;
    }

}
