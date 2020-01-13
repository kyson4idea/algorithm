package com.gao.sort;

/**
 * @author gaoqijian
 * @title
 * @create 2019-12-26 21:25
 * @description 快速排序（Quicksort）是对 冒泡排序的一种改进。基本思想是：通过一趟排序将要排序的数据分割成独立的两
 *              部分，其中一部分的所有数据都比另外一部分的所有数据都要小，然后再按此方法对这两部分数据分别进行快速排
 *              序， 整个排序过程可以递归进行，以此达到整个数据变成有序序列
 *
 *              选取基准（pivot）：三数取中的方法，选最左最右和最中间三个数，选其中的中值
 *
 *              快速排序优化：当 N <= 20 时，快速不如插入排序效果好，小数组使用插入排序
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {0, -11, 1, 0, 23, -567, 789,1};
        quickSort(arr, 0 , arr.length-1);
    }

    public static void quickSort(int[] arr, int left, int right){

        int temp = 0;
        int l = left;
        int r = right;
        int pivot = arr[(l + r) / 2];  //中轴值

        /**
         * 目的是让比pivot小的 放到左边 大的放到右边
         */
        while (l < r){

            //在pivot的左边一直找 找到大于等于pivot的值，才退出
            while (arr[l] < pivot){
                l +=1;
            }

            //找到小于等于pivot的值
            while (arr[r] > pivot){
                r -= 1;
            }

            /**
             * 如果 l >= r 说明pivot的左右两的值，已经全部按照，左边全部小于等于pivot，右边全部大于pivot排序
             */
            if(l >= r){
                break;
            }

            //交换
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            //这里是排除三个连续数字 如 ： 0 0 0
            if(arr[l] == pivot){
                r--;
            }

            if(arr[r] == pivot){
                l++;
            }

        }

        //如果 l == r, 必须l++, r--, 否则为出现栈溢出
        if (l == r) {
            l += 1;
            r -= 1;
        }

        //向左递归
        if(left < r) {
            quickSort(arr, left, r);
        }

        //向右递归
        if(right > l) {
            quickSort(arr, l, right);
        }

    }
}
