package com.midium;

import java.util.Arrays;

public class gameOfLife {
    public static void main(String[] args) {
        int[][] a = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        new gameOfLife().gameOfLife(a);

    }
    public void gameOfLife(int[][] board) {
        //八个位置，定义坐标
        int[][] pos = {{-1,1},{0,1},{1,1},{-1,0},{1,0},{-1,-1},{0,-1},{1,-1}};
        int[][] after = new int[board.length][board[0].length];
        for(int i = 0;i < board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                int count = 0;
                for (int[] p : pos) {
                    int x = j + p[0];
                    int y = i + p[1];
                    if(x < 0 || x>board[0].length-1 || y < 0 || y > board.length-1){
                        continue;
                    }
                    count += board[y][x];
                }
                //只有状态需要改变时，才在after中记录
                if(board[i][j] == 1) {
                    if(count < 2 || count >3){
                    after[i][j] = 2;
                    }
                }else{
                    if(count == 3){
                        after[i][j] =2;
                    }
                }
            }
        }
        //找到需要变换状态的位置
        for (int i = 0; i < after.length; i++) {
            for (int j = 0; j < after[0].length; j++) {
                if(after[i][j] == 2){
                    board[i][j] = board[i][j] == 0 ? 1:0;
                }
            }
            System.out.println(Arrays.toString(after[i]));
            System.out.println(Arrays.toString(board[i]));
        }

    }
}
