package com.sort;

/**
 * 插入排序
 * 原理：将数组中的数据分为“已排序区间”和“未排序区间”，初始已排序区间只有
 * 一个元素，即数组中的第一个元素。改算法的核心思想就是取未排序区间中的元素，
 * 在已排序区间中找到合适的位置并插入，保证已排序区间一直有序
 */
public class InsertionSort {

    public static void sort(int[] array) {
        for(int i = 1; i < array.length; i++) {
            int t = array[i];
            int count = i;
            for(int j = i - 1; j >= 0; j--) {
                if(t < array[j]) {
                    array[j + 1] = array[j];
                    count--;
                }else {
                    break;
                }
            }
            array[count] = t;
        }

    }

    public static void main(String[] args) {
        int[] array = {9,4,12,5,4,6,8,4,64};
        InsertionSort.sort(array);
        for(int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
