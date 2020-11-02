package com.gao.search;

import java.util.ArrayList;
import java.util.List;

/**
 * @title 线性查找
 * @author gaoqijian
 * @create 2020-05-12 9:28
 * @description 线性查找是逐一比对发现有祥同值时，就返回下标
 */
public class SeqSearch {

    public static void main(String[] args) {

        int arr[] = {1, 8, 11, -1, 34, 89};

    }

    /**
     * 这里是找到全部满足条件的
     * @param arr
     * @param value
     * @return
     */
    public static List seqSearch(int arr[], int value){

        List list = new ArrayList();
        //线性查找是逐一比对发现有祥同值时，就返回下标
        for (int i = 0; i < arr.length; i++){

            if(arr[i] == value){
                list.add(i);
            }
        }

        return list;
    }
}
