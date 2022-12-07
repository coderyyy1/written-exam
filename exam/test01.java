package com.exam;

/**
 * 编写一个递归版本的 reverse(s) 函数(或方法),以将字符串s倒置。
 */
public class test01 {
    public static void main(String[] args) {
        String s = "asdojqweojq";
        String reverse = reverse(s);
        System.out.println(reverse);
    }

    public static String reverse(String s){
        if (s.length() <= 1){
            return s;
        }else {
            String substring = s.substring(1);
            char c = s.charAt(0);
            return reverse(substring) + c;
        }
    }
}
