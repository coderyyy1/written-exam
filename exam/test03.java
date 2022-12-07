package com.exam;

import java.util.Arrays;

/**
 * 用归并排序将3，1，4，1，5，9，2，6 排序。
 */
public class test03 {
    public static void main(String[] args) {
        // 没学过，用冒泡。。
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6};
        int num = arr.length - 1;
        while (true) {
            int lastChange = 0;
            for (int i = 0; i < num; i++) {
                if (arr[i] > arr[i + 1]) {
                    change(arr, i, i + 1);
                    lastChange = i;
                }
            }
            num = lastChange;
            if (num == 0) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    // 交换位置
    public static void change(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
