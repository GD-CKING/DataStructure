package com.sort;

/**
 * 选择排序
 * 原理：将数组中的数据分为“已排序区间”和“未排序区间”，每次从未排序区间中
 * 找到最小的元素，将其放到以排序区间中的末尾
 */
public class SelectionSort {

    public static void sort(int array[]) {

        for(int i = 0; i < array.length - 1; i++) {
            int min = array[i];
            int count = i;
            for(int j = i + 1; j < array.length; j++) {
                if(array[j] < min) {
                    count = j;
                    min = array[j];
                }
            }
            if(i != count) {
                int t = array[count];
                array[count] = array[i];
                array[i] = t;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {9,4,12,5,4,6,8,4,64,35,25,69,2};
        SelectionSort.sort(array);
        for(int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
