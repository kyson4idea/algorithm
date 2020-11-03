package com.gao.review;

/**
 * @author gaoqijian
 * @create 2020-10-26 10:54
 */
public class Sort {

    public static int[] bubbleSort(int[] arr) {

        int tmp;
        boolean flag = false;

        for (int i = 0; i < arr.length - 1; i ++){

            for (int j = 0; j < arr.length - i - 1; j ++){

                if(arr[j] > arr[j+1]){
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    flag = true;
                }
            }

            if(!flag){
                break;
            }
        }

        return arr;
    }

    public static int[] selectSort(int[] arr){

        int min;
        int minIndex;

        for (int i = 0; i < arr.length - 1; i++){
            min = arr[i];
            minIndex = i;

            for (int j = 0 + i; j < arr.length; j++){ // here bug

                if(arr[minIndex] > arr[j]){
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

    public static int[] insertSort(int[] arr){

        int inVal;
        int inIndex;

        for (int i = 1; i < arr.length; i++){
            inIndex = i-1;
            inVal = arr[i];

            while (inIndex >= 0 && inVal < arr[inIndex]){
                arr[inIndex + 1] = arr[inIndex];
                inIndex --;
            }

            if(inIndex + 1 != i){
                arr[inIndex + 1] = inVal;
            }
        }

        return arr;
    }

    public static int[] shellSort(int[] arr){

        int tmp;
        int j;

        for (int gap = arr.length / 2; gap > 0; gap /= 2){

            for (int i = gap; i < arr.length; i++){

                j = i;
                tmp = arr[j];

                if(arr[j] < arr[j - gap]){

                    while (j - gap >= 0 && tmp < arr[j - gap]){
                        arr[j] = arr[j - gap];
                        j -= gap;
                    }
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }
}
