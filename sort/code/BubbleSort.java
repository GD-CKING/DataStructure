package com.sort;

/**
 * 冒泡排序
 */
public class BubbleSort {

    public static void sort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            //提前退出冒泡循环的标志
            boolean flag = false;
            for(int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j +1]) {
                    int t = array[j];
                    array[j] = array[j +1];
                    array[j + 1] = t;
                    flag = true;
                }
            }
            if(!flag) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {9,4,12,5,4,6,8,4,64,35,25,69,2};
        BubbleSort.sort(array);
        for(int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
