package com.gao.utils;

/**
 * @author gaoqijian
 * @create 2020-10-26 14:21
 */
public class Test {

    public static int[] getArr(){

        int[] arr = new int[80000];
        for(int i=0; i<arr.length; i++){
            arr[i] = (int)(Math.random()*8000000); // 获得一个 [0, 80000] 的随机数组
        }

        return arr;
    }
}
