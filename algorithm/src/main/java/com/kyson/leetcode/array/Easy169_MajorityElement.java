package com.kyson.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 LeetCode 169. 多数元素 - 详细讲解
 1. 题目分析
 题目原文：给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊n/2⌋ 的元素。
 简单理解：

 有一个数组，里面有很多数字
 要找出现次数超过一半的那个数字
 题目保证这样的数字一定存在

 举例说明：

 数组 [3,2,3]，数字3出现了2次，超过了数组长度3的一半，所以3就是多数元素
 数组 [2,2,1,1,1,2,2]，数字2出现了4次，超过了数组长度7的一半，所以2是多数元素

 2. 思路讲解
 方法一：暴力解法（新手首选）
 生活比喻：就像班级选班长，我们一个一个统计每个候选人的票数，谁的票数超过一半就当选。
 算法思路：

 遍历数组中的每个数字
 对于每个数字，统计它在整个数组中出现的次数
 如果某个数字出现次数超过 n/2，就返回它

 方法二：哈希表统计（推荐理解）
 生活比喻：像用计数器统计投票，每个候选人都有一个计数器，投一票就加1。
 算法思路：

 用HashMap记录每个数字出现的次数
 遍历一遍数组，更新每个数字的计数
 找出计数超过 n/2 的数字

 方法三：摩尔投票法（最优解）
 生活比喻：像一场"打擂台"的比赛

 当前擂主和挑战者一对一PK
 如果是同一个人，擂主力量+1
 如果是不同人，擂主力量-1
 擂主力量为0时，换新擂主
 最后站在台上的就是胜利者

 为什么这样可行？
 因为多数元素超过一半，即使所有其他元素联合起来"对抗"它，多数元素仍然会胜出
 */
public class Easy169_MajorityElement {

    /**
     * Hashmap 解法
     *
     * O(n) O(n)
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        // 统计每个数字的出现次数
        for (int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);

            if(map.get(num) > n / 2){
                return num;
            }
        }
        return 0;
    }

    /**
     * 摩尔投票法（最优解） 空间复杂度低
     *
     * O(n) O(1)
     * @param nums
     * @return
     */
    public int majorityElement2(int[] nums) {

        /*
            像一场"打擂台"的比赛

            当前擂主和挑战者一对一PK
            如果是同一个人，擂主力量+1
            如果是不同人，擂主力量-1
            擂主力量为0时，换新擂主
            最后站在台上的就是胜利者
        */
        int candidate = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++){
            if (nums[i] == candidate){
                count++;
            }else{
                count--;
                if(count == 0){
                    candidate = nums[i];
                    count = 1;
                }
            }
        }

        return candidate;
    }
}
