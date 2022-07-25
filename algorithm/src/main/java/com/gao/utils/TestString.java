package com.gao.utils;

import org.junit.jupiter.api.Test;

/**
 *
 * 测试 String StringBuffer and StringBuilder 时间差距
 *
 * @author gaoqijian
 * @create 2020-12-16 17:17
 */
public class TestString {

    public String str;
    @Test
    public void testString(){
        String str;
        long startTime = 0L;
        long endTime = 0L;
        String text = "";
        StringBuffer buffer = new StringBuffer("");
        StringBuilder builder = new StringBuilder("");
        //开始对比
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            buffer.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer的执行时间：" + (endTime - startTime));
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            builder.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder的执行时间：" + (endTime - startTime));
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            text = text + i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String的执行时间：" + (endTime - startTime));
    }

    @Test
    public  void aa() {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        operator(a, b);
        System.out.println(a + "," + b);
    }
    public  void operator(StringBuffer x, StringBuffer y) {
        x.append(y);
        y = x;
    }
}

class SwitchTest{//1
    public static void main(String[] args) {//2
        System.out.println("value="+switchit(4));//3
    }//4
    public static int switchit(int x) {
        int j=1;
        switch (x) {
            case 1:j++;
            case 2:j++;
            case 3:j++;
            case 4:j++;
            case 5:j++;
            default:j++;
        }
        return j+x;
    }
}
