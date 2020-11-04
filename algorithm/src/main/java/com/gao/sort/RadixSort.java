package com.gao.sort;

/**
 * 基数排序
 * @author gaoqijian
 * @create 2020-11-04 15:32
 */
public class RadixSort {

    public static int[] radixSort(int[] arr){


        return arr;
    }

    public static int[] stepOne(int[] arr){

        /**
         *第1轮 针对每个元素的个位进行排序
         *
         * 定义一个二维数组，表示10个桶，每个桶就是一个一维数组
         * 为了防止放入数的时候，数据溢出，大小定义为arr.length
         *
         * 基数排序是经典的空间换时间的算法
         */
        int[][] bucket = new int[10][arr.length];

        /**
         *
         * 为了记录每个桶中实际存放了多少个数据，我们定义一个一维数组来记录各个桶每次放入的数据个数
         *
         * bucketElementCounts[0] 记录的就是 第0个桶
         */
        int[] bucketElementCounts = new int[10];

        //第一轮针对每个元素的个位进行排序
        for(int j = 0; j < arr.length; j ++){

            //取出每个元素的个位的值
            int digitOfElement = arr[j] % 10;
            System.out.println(bucketElementCounts[digitOfElement]);
            //放入到对应的桶中
            bucket[digitOfElement][bucketElementCounts[digitOfElement]] = arr[j];
            bucketElementCounts[digitOfElement]++;
        }
        //按照这个桶顺序（一维数组的下标依次取出数据，放入原来数组）
        int index = 0;
        /**
         * 遍历每一个桶，并将桶中数据放入原数组
         */

        for(int k = 0; k < bucketElementCounts.length; k++){
            //如果桶中有数据，我们才放入原数组
            if(bucketElementCounts[k] != 0){

            }
        }

        return arr;
    }
}
