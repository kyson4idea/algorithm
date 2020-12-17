package com.gao.exam;

/**
 * 将一个字符串进行反转。将字符串中指定部分进行 反转如 。比如“abcdefg”反 反
 * 为 转为”abfedcg”
 *
 * @author gaoqijian
 * @create 2020-12-16 16:54
 */
public class StringReverse {

    /**
     * 方式一 将其转换为数组
     *
     * @param str
     * @param start
     * @param end
     * @return
     */
    public String reverse(String str, int start, int end){

        if(str != null && str.length() > 0){

            char[] arr = str.toCharArray();

            for (int x =start,y = end; x < y; x++, y--){

                char temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
            }
            return new String(arr);
        }

        return null;
    }

    /**
     * 方式二 使用String 拼接
     *
     * @param str
     * @param start
     * @param end
     * @return
     */
    public String reverse2(String str, int start, int end){

        String reStr = str.substring(0, start);

        for (int i = end; end >= start; i--){
            reStr += str.charAt(i);
        }
        reStr += str.substring(end + 1);
        return reStr;
    }

    /**
     * 方式三 使用StringBuffer Builder 替换
     *
     * @param str
     * @param start
     * @param end
     * @return
     */
    public String reverse3(String str, int start, int end){
        StringBuffer sb = new StringBuffer(str.length());
        sb.append(str.substring(0, start));

        for (int i = end; end >= start; i--){
            sb.append(str.charAt(i));
        }
        sb.append(str.substring(end + 1));
        return sb.toString();
    }

}
