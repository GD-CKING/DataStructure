package com.sort;

/**
 * 归并排序
 * 原理：先把数组从中间分成前后两部分，然后对前后两部分分别排序，
 * 在将排序好的两部分合并在一起，这样整个数组就有序了
 */
public class MergeSort {

    public void sort(int[] array, int len) {
        mergeSort(array, 0, len - 1);
    }

    public void mergeSort(int[] array, int p, int r) {
        if(p >= r) {
            return;
        }

        int q = (p + r) / 2;
        mergeSort(array, p, q);
        mergeSort(array, q + 1, r);
        merge(array, p, q, r);
    }

    public void merge(int[] a, int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int[] t = new int[r - p + 1];
        int count = 0;
        while (i <= q && j <= r) {
            if(a[i] <= a[j]) {
                t[count++] = a[i++];
            }else{
                t[count++] = a[j++];
            }
        }
        int start = i;
        int end = q;
        if(j <= r) {
            start = j;
            end = r;
        }

        //将剩余的数据拷贝到数组t中
        while(start <= end) {
            t[count++] = a[start++];
        }

        for(i = 0; i < t.length; i++) {
            a[p + i] = t[i];
        }
    }

    public static void main(String[] args) {
        int[] array = {9,4,12,5,4,6,8,4,64,35,25,69,2};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(array, array.length);
        for(int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
