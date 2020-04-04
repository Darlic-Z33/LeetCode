package com.simple;

public class numberOfSteps {
    public static void main(String[] args) {
        System.out.println(new numberOfSteps().numberOfSteps(123233444));

    }
    public int numberOfSteps (int num) {
        if(num == 0){
            return 0;
        }
        int count = 0;
        while(num != 0) {
            if (num % 2 == 0) {
                num = num >> 1;
                count++;
            } else {
                num -= 1;
                count++;
            }
        }
        return count;
    }
}
