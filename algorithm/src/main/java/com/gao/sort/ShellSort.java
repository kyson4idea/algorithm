package com.gao.sort;

import java.util.Arrays;

/**
 * @author gaoqijian
 * @title 希尓排序
 * @create 2019-12-25 22:46
 * @description 把记录按下标的一定增量分组，对每组用直接插入排序法排序，随着增量减少，每组包含的关键词越来越多，当增量减少至 1 便结束
 * <p>
 * eg: 8 9 1 7 2 3 5 4 6 0
 * step one 初始增量 gap = length/2 = 5, 意味着整个组被分为 5 组 [8, 3][9, 5][1, 4][7, 6][2, 0]
 * <p>
 * 3 5 1 6 0 8 9 4 7 2
 * <p>
 * 对五组分别进行插入排序 gap = 5/2 = 2, 数组被分为两组 [3, 1, 0, 9, 7] [5, 6, 8, 4, 2]
 * <p>
 * 最后gap = 2/2 = 1 , 此时整个数组为 1 组 [0, 2, 1, 4, 3, 5, 7, 6, 9, 8]
 * <p>
 * 最后微调就好
 */
public class ShellSort {

    /**
     * 希尔算法优化，移位法
     * @param arr
     * @return
     */
    public static int[] shellSortFinal(int[] arr) {

        for (int gap = arr.length / 2; gap > 0; gap /= 2) {

            // 从第 gap 个元素，逐个对其所在的组进行直接插入排序
            for (int i = gap; i < arr.length; i++) {

                int j = i;
                int temp = arr[j];

                if (arr[j] < arr[j - gap]) {

                    while (j - gap >= 0 && temp < arr[j - gap]) {
                        //移动
                        arr[j] = arr[j - gap];
                        j -= gap;
                    }

                    //当退出 while 后，就给 temp 找到插入的位置
                    arr[j] = temp;
                }
            }

        }
        return arr;
    }

    /**
     * 交换法
     *
     * @param arr
     * @return
     */
    public static int[] shellSort(int[] arr) {

        int tmp = 0;

        for (int gap = arr.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < arr.length; i++) {

                //遍历各组中所有的元素 （共5组，每组两个元素），步长 5
                for (int j = i - gap; j >= 0; j -= gap) {

                    if (arr[j] > arr[j + gap]) {
                        tmp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = tmp;
                    }
                }
            }
        }

        return arr;
    }


    public static void stepOne(int[] arr) {

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

        System.out.println("shell第一轮后" + Arrays.toString(arr));

        //第二轮排序，将十个数分成五组  5/2=2 两组
        for (int i = 2; i < arr.length; i++) {

            //遍历各组中所有的元素 （共5组，每组两个元素），步长 5
            for (int j = i - 2; j >= 0; j -= 2) {

                if (arr[j] > arr[j + 2]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 2];
                    arr[j + 2] = tmp;
                }
            }
        }

        System.out.println("shell第二轮后" + Arrays.toString(arr));

    }

}
