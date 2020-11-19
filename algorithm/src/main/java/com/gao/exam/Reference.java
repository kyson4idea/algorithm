package com.gao.exam;

/**
 *
 * 通过method 让两个数字分别输出为 100 200
 * @author gaoqijian
 * @create 2020-11-19 16:32
 */
public class Reference {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        method(a, b);

        System.out.println(a + ".." + b);

    }

    public static void method(int a, int b){
         a = a * 10;
         b = b * 10;
        System.out.println(a + ".." + b);
        System.exit(0);
    }

}
