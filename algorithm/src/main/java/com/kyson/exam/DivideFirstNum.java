package com.kyson.exam;

/**
 * 定义一个int 数组 int[] arr = int[]{21,54,1,48};
 * 让数组每个位置上的值除以首位置的元素，得到的结果作为该位置的新值
 * @author gaoqijian
 * @create 2020-11-19 16:39
 */
public class DivideFirstNum {

    public static void method(int[] args) {

        for (int i = args.length - 1; i >= 0; i--){
            args[i] = args [i]/ args[0];
        }

        // 或者
        int temp = args[0];
        for (int i = 0; i < args.length -1 ; i++){
            args[i] = args [i]/ temp;
        }
    }


}
