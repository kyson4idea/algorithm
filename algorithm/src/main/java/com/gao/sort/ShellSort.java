package com.gao.sort;

import java.util.Arrays;

/**
 * @title 希尓排序
 *
 * @author gaoqijian
 * @create 2019-12-25 22:46
 *
 * @description 把记录按下标的一定增量分组，对每组用直接插入排序法排序，随着增量减少，每组包含的关键词越来越多，当增量减少至 1 便结束
 *
 * eg: 8 9 1 7 2 3 5 4 6 0
 * step one 初始增量 gap = length/2 = 5, 意味着整个组被分为 5 组 [8, 3][9, 5][1, 4][7, 6][2, 0]
 *
 *        3 5 1 6 0 8 9 4 7 2
 *
 *        对五组分别进行插入排序 gap = 5/2 = 2, 数组被分为两组 [3, 1, 0, 9, 7] [5, 6, 8, 4, 2]
 *
 *        最后gap = 2/2 = 1 , 此时整个数组为 1 组 [0, 2, 1, 4, 3, 5, 7, 6, 9, 8]
 *
 *        最后微调就好
 */
public class ShellSort {

    public static void stepOne(int[] arr){
        arr = new int[]{8, 9, 1, 7, 2, 3, 5, 4, 6, 0};
        int tmp = 0;


        for (int i = 5; i < arr.length; i++) {

            //遍历各组中所有的元素 （共5组，每组两个元素），步长 5
            for (int j = i - 5; j >= 0; j -= 5) {

                if (arr[j] > arr[j + 5]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 5];
                    arr[j + 5] = tmp;
                }
            }
        }

        System.out.println("shell第一轮后"+ Arrays.toString(arr));
    }

}
