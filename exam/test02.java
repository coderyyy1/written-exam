package com.exam;

import java.util.Stack;

/**
 * 编写程序 expr，以计算从命令行输入的逆波兰表达式的值，其中每个运算符或操作数用一个单独的参数表示。例如，命令
 * expr 2 3 4 + *
 */
public class test02 {
    public static void main(String[] args) {
        String[] s = {"2","3","4","+","*"};
        int expr = expr(s);
        System.out.println(expr);
    }

    public static int expr(String[] s) {
        Stack<Integer> stack1 = new Stack<>();
        for (int i = 0; i < s.length; i++) {
            String str = s[i];
            if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
                int val1 = stack1.pop();
                int val2 = stack1.pop();
                if (str.equals("+")) {
                    stack1.push((val2 + val1));
                }
                if (str.equals("-")) {
                    stack1.push((val2 - val1));
                }
                if (str.equals("*")) {
                    stack1.push((val2 * val1));
                }
                if (str.equals("/")) {
                    stack1.push((val2 / val1));
                }
            } else {
                stack1.push(Integer.parseInt(str));
            }
        }
        return stack1.peek();
    }
}