package com.gao.sort;

/**
 * @author gaoqijian
 * @title
 * @create 2019-12-26 21:25
 * @description
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {0, -11, 0, 23, -567, 789};
        quickSort(arr, 0 , arr.length-1);
    }

    public static void quickSort(int[] arr, int left, int right){

        int temp = 0;
        int l = left;
        int r = right;
        int pivot = arr[(l + r) / 2];  //中轴值

        /**
         * 目的是让比pivot小的 放到坐边 大的放到右边
         */
        while (l < r){

            //在pivot的坐边一直找 找到打鱼等于pivot的值，才退出
            while (arr[l] < pivot){
                l +=1;
            }

            //找到小于等于pivot的值
            while (arr[r] > pivot){
                r -= 1;
            }

            if(l >= r){
                break;
            }

            //交换
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

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
