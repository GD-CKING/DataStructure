package com.search;

public class BinarySearch {

    public static boolean search(int[] array, int target) {

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (right + left) / 2;
            if(array[mid] > target) {
                right = mid - 1;
            }else if(array[mid] < target) {
                left = mid + 1;
            }else{
                return true;
            }
        }

        return false;
    }

    public static boolean searchR(int[] array, int target) {
       if(target == searchRec(array, 0, array.length - 1, target)){
            return true;
       }
       return false;
    }

    /**
     * 递归的方式实现二分查找
     * @param array
     * @param left
     * @param right
     * @param target
     * @return
     */
    public static int searchRec(int[] array, int left, int right, int target) {
        if(left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if(array[mid] > target) {
            return searchRec(array, left, mid - 1, target);
        }else if(array[mid] < target) {
            return searchRec(array, mid + 1, right, target);
        }else{
            return array[mid];
        }
    }

    /**
     * 查找第一个值等于给定值的元素
     * @param array
     * @param target
     * @return
     */
    public static int searchFirst(int[] array, int target) {
        int low = 0;
        int height = array.length - 1;

        while (low <= height) {
            int mid = (low + height) >> 1;
            if(array[mid] > target) {
                height = mid - 1;
            }else if(array[mid] < target) {
                low = mid + 1;
            }else{
                if(mid == 0 || (array[mid - 1] != target)) {
                    return mid;
                }else {
                    height = mid - 1;
                }
            }

        }
        return -1;
    }

    /**
     * 查找最后一个值等于给定值的元素
     * @param array
     * @param target
     * @return
     */
    public static int searchLast(int[] array, int target) {
        int low = 0;
        int height = array.length - 1;

        while(low <= height) {
            int mid = (low + height) >> 1;
            if(array[mid] > target) {
                height = mid - 1;
            }else if(array[mid] < target) {
                low = mid + 1;
            }else{
                if ((mid == array.length - 1) || (array[mid + 1] != target)) {
                    return mid;
                }else{
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1,1,2,2,5,6,9,10,12,10};
        System.out.println(BinarySearch.searchLast(array, 2));
    }
}
