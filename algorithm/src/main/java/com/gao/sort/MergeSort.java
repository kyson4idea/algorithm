package com.gao.sort;

/**
 * 归并排序
 */
public class MergeSort {

    public static void main(String[] args) {
        int arr[] = { 8, 4, 5, 7, 1, 3, 6, 2 }; //
        int temp[] = new int[arr.length]; //归并排序需要一个额外空间
        mergeSort(arr, 0, arr.length - 1, temp);
    }

    public static void mergeSort(int[] arr, int left, int right, int[] temp) {
        if(left < right) {
            int mid = (left + right) / 2; //中间索引
            //向左递归进行分解
            mergeSort(arr, left, mid, temp);
            //向右递归进行分解
            mergeSort(arr, mid + 1, right, temp);
            //合并
            merge(arr, left, mid, right, temp);
        }
    }

    /**
     *  合并的过程
     * @param arr 要排序的数组
     * @param left  左边有序序列的初始索引
     * @param mid   中间索引
     * @param right 右边索引
     * @param temp  中转数组
     * @return
     */
    public static int[] merge(int[] arr, int left, int mid, int right, int[] temp){

        int i = left;   //初始化i 左边有序序列的初始索引
        int j = mid + 1;    //右边有序序列的初始化索引
        int t = 0; // 指向temp数组的当前索引

        /**
         * 先把左右两边的数据 按照规则 填充到temp数组
         * 直到左右两边有序序列，有一边处理完毕
         *
         * 如果一边有剩余，将剩下的填充过去
         */
        while (i <= mid && j <= right){

            /**
             * 如果左边的有序序列当前元素，小于等于右边，将左边填入
             */
            if(arr[i] < arr[j]){
                temp[t] = arr[i];
                t += 1;
                i += 1;
            }else { // 反之 将右边的有序序列当前元素，填充到 temp数组
                temp[t] = arr[j];
                t += 1;
                j += 1;
            }
        }

        while (i <= mid){
            temp[t] = arr[i];
            t += 1;
            i += 1;
        }

        while (j <= right) {
            temp[t] = arr[j];
            t += 1;
            j += 1;
        }
        /**
         * 将数据拷贝回去
         */

        t = 0;
        int tempLeft = left;
        while(tempLeft <= right){
            arr[tempLeft] = temp[t];
            t += 1;
            tempLeft += 1;
        }

        return arr;
    }
}
