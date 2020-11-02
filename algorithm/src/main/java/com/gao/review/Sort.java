package com.gao.review;

/**
 * @author gaoqijian
 * @create 2020-10-26 10:54
 */
public class Sort {

    public static int[] BubbleSort(int[] arr) {

        int tmp;
        boolean flag = false;

        for(int i = 0; i < arr.length-1; i++){

            for(int j = 0; j < arr.length - i - 1; j++){

                if(arr[j] > arr[j+1] ){
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    flag = true;
                }
            }

            if(!flag){
                break;
            }else {
                flag = false;
            }

        }

        return arr;
    }

    public static int[] SelectSort(int[] arr){

        for (int j = 0; j < arr.length - 1; j++){
            int min = arr[j];
            int minIndex = j;

            for (int i = 0 + j; i < arr.length; i++){

                if(min > arr[i]){

                    min = arr[i];
                    minIndex = i;
                }

                arr[minIndex] = arr[j];
                arr[j] = min;
            }
        }

        return arr;
    }

    public static int[] InsertSort(int[] arr){

        for(int i = 1; i < arr.length; i++){

            int insertVal = arr[i];
            int insertIndex = i-1;

            while (insertIndex >= 0 && insertVal < arr[insertIndex]){
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }

            if(insertIndex + 1 != 0){
                arr[insertIndex + 1] = insertVal;
            }
        }

        return arr;
    }
}
