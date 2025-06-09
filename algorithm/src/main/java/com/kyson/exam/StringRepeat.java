package com.kyson.exam;

/**
 * 获取一个字符串在另一个字符串中出现的次数。
 * 取 比如：获取“ ab”在 在 “abkkcadkabkebfkabkskab” 中 中 出现的次数
 *
 * @author gaoqijian
 * @create 2020-12-17 9:29
 */
public class StringRepeat {

    public int getCount(String mainStr, String subStr){
        int mainl = mainStr.length();
        int subl = subStr.length();

        int count = 0;
        int index = 0;
        if(mainl > subl){

            /**
             * 方式一
             */
            while ((index = mainStr.indexOf(subStr)) != -1){
                count++;
                mainStr = mainStr.substring(index + subStr.length());
            }

            /**
             * 方式二
             */
            while ((index = mainStr.indexOf(subStr,index)) != -1){
                count++;
                index += subl;
            }


            return count;
        }else {
            return 0;
        }
    }
}
