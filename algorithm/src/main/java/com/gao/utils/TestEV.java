package com.gao.utils;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gaoqijian
 * @create 2020-10-26 14:21
 */
public class TestEV {

    public static int[] getArr(){

        int[] arr = new int[80000];
        for(int i=0; i<arr.length; i++){
            arr[i] = (int)(Math.random()*8000000); // 获得一个 [0, 80000] 的随机数组
        }

        return arr;
    }

    @Test
    public void test(){

        int a = 2;
        int b = 3;
        System.out.println( (a + b) / 2);

        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);
        System.out.println(i1 == i2);

        Integer m1 = 1;
        Integer m2 = 1;
        System.out.println(m1 == m2);

        Integer m11 = 1281;
        Integer m22 = 1281;
        System.out.println(m11 == m22);
    }

    @Test
    public void testS(){
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);

        System.out.println(sb.length());

        System.out.println(sb);

        StringBuffer sb1 = new StringBuffer(str);
        System.out.println(sb1);
    }

    @Test
    public void test1(){
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);

        list.remove(1);

        System.out.println(list);

        String str = "hello";
        String str1 = "hello";
        System.out.println(str == str1);
    }

    @Test
    public void test2(){
        for (int i = 0, y= 2; i<10; i++, y++){
            System.out.println(i+"====="+y);
        }
    }

    @Test
    public void getMaxSameString(){
        String str1 = "abcwerthelloyuiodef" ;
        String str2 = "cvhellobnm";
        String maxStr = "abcwerthelloyuiodef"; //(str1.length() >= str2.length())? str1 : str2;
        String minStr = "cvhellobnm"; //(str1.length() <  str2.length())? str1 : str2;
        int length = minStr.length();

        for (int i = 0; i < length; i++){
            for (int x = 0, y = length - i; y <= length; x++, y++){
                String subStr = minStr.substring(x, y);
                System.out.println(subStr);
                if (maxStr.contains(subStr)){
                    System.out.println("result:              "+subStr);
                    return;
                }
            }
        }

    }

}

class StringTest {
    String str = new String("good");
    char[] ch = { 't', 'e', 's', 't' };
    public void change(String str, char ch[]) {
        str = "test ok";
        ch[0] = 'b';
    }

    public static void main(String[] args) {
        StringTest ex = new StringTest();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str + " and ");//
        System.out.println(ex.ch);
    }
}
