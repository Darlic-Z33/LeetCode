package com.simple;

public class myAtoi {
    public static void main(String[] args) {
        System.out.println(new myAtoi().myAtoi("0-1"));
    }

    public int myAtoi(String str) {
        String str1 = str.trim();
        if(str1.length() == 0){
            return 0;
        }
        char first = str1.charAt(0);
        if (!(first == '+' || first == '-' || Character.isDigit(first))) {
            return 0;
        }
        if (str1.contains(" ")) {
            str1 = str1.substring(0, str1.indexOf(' '));
        }
        char[] chars = str1.toCharArray();
        int ans = 0;
        boolean negFlag = false;
        boolean symbol = false;
        for (char c : chars) {
            if (c == '+') {
                if(symbol){
                    break;
                }
                symbol = true;
                continue;
            } else if (c == '-') {
                if(symbol){
                    break;
                }
                negFlag = true;
                symbol = true;
                continue;
            } else if (!Character.isDigit(c)) {
                break;
            } else if (ans > (Integer.MAX_VALUE - (c - '0')) / 10) {

                return negFlag ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            symbol = true;
            ans = ans * 10 + (c - '0');

        }
        return negFlag ? -ans : ans;
    }
}
