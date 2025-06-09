package com.kyson.review;

/**
 * @author gaoqijian
 * @create 2020-10-26 10:54
 */
public class Sort {

    public static void bubbleSort(int[] arr) {
        int tmp;
        boolean flag = false;

        for(int i = 0; i < arr.length - 1; i++){

            for (int j = 0; j < arr.length - i - 1; j++){

                if(arr[j] > arr[j - 1]){
                    flag = true;

                    tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;

                }else {
                    flag = false;
                }

            }

            if(!flag){
                break;
            }
        }
    }

    public static void selectSort(int[] arr){

        int min;
        int minIndex;

        for (int i = 0; i < arr.length - 1; i ++){
            min = arr[i];
            minIndex = i;

            for(int j = i; j < arr.length; j ++){

                if(min < arr[j]){
                    min = arr[j];
                    minIndex = j;
                }
            }

            arr[minIndex] = arr[i];
            arr[i] = min;
        }
    }

    public static int[] insertSort(int[] arr){

        int val;
        int valIndex;

        for(int i = 1; i < arr.length; i++){

            val = arr[i];
            valIndex = i - 1;

            while (valIndex > 0 && val < arr[valIndex]){
                arr[valIndex + 1] = arr[valIndex];
                valIndex -- ;
            }

            arr[valIndex + 1] = val;

        }


        return arr;
    }

    public static void shellSort(int[] arr){

        int temp;

        int j; //

        for (int gap = arr.length / 2; gap > 0; gap /= 2){

            for (int i = gap; i < arr.length; i++){

                j = i;
                temp = arr[j];

                while (j - gap >= 0 && temp < arr[j - gap]){

                    arr[j] = arr[j - gap];
                    j-=gap;
                }

                arr[j] = temp;
            }
        }

    }

    public static void quickSort(int[] arr, int left, int right){

    }
}
