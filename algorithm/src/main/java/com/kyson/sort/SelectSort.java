package com.kyson.sort;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

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

    @Test
    public void testSelectSort(){

        /**
         * 创建一个 80000 数据的随机数组 然后排序
         */
        int[] arr = new int[80000];
        for(int i=0; i<arr.length; i++){
            arr[i] = (int)(Math.random()*8000000); // 获得一个 [0, 80000] 的随机数组
        }

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1Str = sdf.format(date);
        System.out.println("排序前时间" + date1Str);

        selectSort(arr);

        Date date2 = new Date();
        String date2Str = sdf.format(date2);
        System.out.println("排序后时间" + date2Str);
    }

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



    public static int[] stepOne(int[] arr){

        int minIndex = 0;
        int min = arr[0];
        for(int j = 0 + 1; j < arr.length; j++){
            if(min>arr[j]){
                min = arr[j];
                minIndex = j;
            }
        }

        arr[minIndex] = arr[0];
        arr[0] = min;

        return null;
    }

}
