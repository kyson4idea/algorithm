package com.gao.search;

import java.util.ArrayList;
import java.util.List;

/**
 * @title 二分法查找
 * @author gaoqijian
 * @create 2020-05-12 10:26
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {-1,0,11,89,48,123,222};
        binarySearchDemo(arr, 0, arr.length-1, 0);
        System.out.println(binarySearchDemo(arr, 0, arr.length-1, 0));
    }

    /**
     * 1、找到 mid 不要马上返回
     * 2、向mid左边扫描，讲所有满足查找值 所有下标 加入list
     * 3、右边相同
     * @param arr
     * @param left
     * @param right
     * @param findVal
     * @description {1,8, 10, 89, 1000, 1000，1234} 当一个有序数组中，有多个相同的数值时，如何将所有的数值都查找到，比如这里的 1000.
     */

    public static List binarySearch(int[] arr, int left, int right, int findVal){

        if(left > right){
            return new ArrayList();
        }

        int mid = (left + right) / 2;
        int midVal = arr[mid];

        if(findVal > midVal){ //向右递归
            return binarySearch(arr, mid + 1, right, findVal);
        }else if(findVal < midVal){
            return binarySearch(arr, left, mid - 1, findVal);
        }else {

            List result = new ArrayList();
            int temp = mid - 1;

            while (true){
                //向左扫描
                if(temp < 0 || arr[temp] != findVal){
                    break;
                }

                result.add(temp);
                temp -= 1;  //temp 左移
            }
            result.add(mid);

            temp = mid + 1;
            while (true){
                //向左扫描
                if(temp > arr.length - 1 || arr[temp] != findVal){
                    break;
                }

                result.add(temp);
                temp += 1;  //temp 左移
            }

            return result;
        }

    }

    /**
     *
     * @param arr
     * @param left 左边索引
     * @param right 右边索引
     * @param findVal 要查找的值
     * @return 如果找到就返回下标，没找到 返回 -1
     */
    public static int binarySearchDemo(int[] arr, int left, int right, int findVal){

        if(left > right){
            return -1;
        }

        int mid = (left + right) / 2;
        int midVal = arr[mid];

        if(findVal > midVal){ //向右递归
            return binarySearchDemo(arr, mid + 1, right, findVal);
        }else if(findVal < midVal){
            return binarySearchDemo(arr, left, mid - 1, findVal);
        }else {
            return mid;
        }

    }

    //


}
