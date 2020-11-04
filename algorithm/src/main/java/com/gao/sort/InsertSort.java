package com.gao.sort;

/**
 * @author gaoqijian
 * @title Insert Sort
 * @create 2019-12-25 21:56
 * @description 把几个待排序得元素看成一个有序列表和一个无序列表，开始时 有序列表只包含一个元素，无序列表含有 n-1个元素，
 * 排序时每次从无序表中抽出第一个元素，把他的排序码依次与有序元素排序码比较，将其插入有序列表
 */
public class InsertSort {

    public static void insertSort(int[] arr) {

        int insertVal = 0;
        int insertIndex = 0;

        //使用 for 循环来把代码简化
        for (int i = 1; i < arr.length; i++) {
            //定义待插入的数
            insertVal = arr[i];
            insertIndex = i - 1; // 即 arr[1]的前面这个数的下标
            /**
             * 给 insertVal 找到插入的位置
             * 说明
             *  1. insertIndex >= 0 保证在给 insertVal 找插入位置，不越界
             *  2. insertVal < arr[insertIndex] 待插入的数，还没有找到插入位置
             *  3. 就需要将 arr[insertIndex] 后移
             */
            while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
                arr[insertIndex + 1] = arr[insertIndex];// arr[insertIndex]
                insertIndex--;
            }
            // 当退出 while 循环时，说明插入的位置找到, insertIndex + 1
            //这里我们判断是否需要赋值
            if (insertIndex + 1 != i) {
                arr[insertIndex + 1] = insertVal;
            }
        }
    }

}
