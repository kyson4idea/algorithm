package com.gao.sort;

/**
 * Bubble sort and related optimizations
 * @author gaoqijian
 * @create 2019-12-25 18:48
 *
 * @description 基本思路：通过比较排序序列前后，依次比较相邻元素的值，若发现`逆序`则交换
 * 规则：
 *  1、一共进行 length-1 次大循环
 *  2、每一趟排序的次数逐渐减少
 *  3、若某一趟无交换，可提前结束
 */
public class BubbleSort {

    public int[] bubbleSort(int[] arr){

        boolean flag = false;
        int tmp;

        for(int i=0; i<arr.length-1; i++){

            for(int j=0; j<arr.length-1-i; j++){

                //发现 逆序 交换
                if(arr[j] > arr[j+1]){
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    flag = true;
                }
            }
            //若无交换 则跳出循环
            if(!flag){
                break;
            }else {
                flag = false;
            }

        }

        return arr;
    }

}
