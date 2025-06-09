package com.kyson.exam;

import org.junit.jupiter.api.Test;

/**
 * 获取两个字符串中最大相同子串。比如：
 * str1 = "abcwerthelloyuiodef“;str2 = "cvhellobnm"
 * 提示：将短的那个串进行长度依次递减的子串与较长的串比较
 *
 * @author gaoqijian
 * @create 2020-12-17 14:11
 */
public class StringSame {

    @Test
    public String getMaxSameString(String str1, String str2){
        String max = (str1.length() >= str2.length())? str1:str2;
        String min = (str1.length() < str2.length())? str1:str2;
        int length = min.length();
        for (int i = 0; i < length; i++) {

            for (int x = 0, y = length ; y <= length; x++, y++){
                String sub = min.substring(x, y);
                if(max.contains(sub)){
                    return sub;
                }
            }
        }

        return null;
    }
}
