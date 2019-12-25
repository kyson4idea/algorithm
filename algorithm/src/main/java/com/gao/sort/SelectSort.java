package com.gao.sort;

/**
 * @title Select Sort
 *
 * @author gaoqijian
 * @create 2019-12-25 18:48
 *
 * @description 基本思路：第一次从arr[0]~arr[n-1]中选取最小值，与arr[0]交换，第二次同理从arr[1]~arr[n-1]中选最小，
 * 通过n-1次交换，完成排序
 */
public class SelectSort {

    public int[] selectSort(int[] arr){

        for (int i=0; i<arr.length-1; i++){

            int minIndex = i;
            int min = arr[i];

            for(int j=0+i; j<arr.length; j++){

                //找出 最小值与他的下标
                if(min > arr[j]){
                    min = arr[j];
                    minIndex = j;
                }
            }

            if(minIndex != i){
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }
        return arr;
    }

}
