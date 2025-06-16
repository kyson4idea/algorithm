package com.kyson.leetcode.array;

/**
 LeetCode 80题：删除有序数组中的重复项 II
 1. 题目分析
 题目描述：给你一个有序数组 nums，请你原地删除重复出现的元素，使得出现次数超过两次的元素只出现两次，返回删除后数组的新长度。
 输入输出关系：

 输入：有序整数数组 nums
 输出：处理后的数组长度
 要求：原地修改，不使用额外空间

 题目类型：双指针 + 数组原地修改
 考查点：

 双指针技巧
 数组的原地操作
 边界条件处理

 2. 思路讲解
 暴力解法思路
 最直观的想法是遍历数组，用一个计数器记录每个元素出现的次数，超过2次就删除。但这样需要频繁移动数组元素，效率很低。
 优化解法：双指针法
 让我用一个生活化的例子来解释：
 比喻：想象你是一个图书管理员，要整理一排书。规则是：相同的书最多只能放2本，多余的要拿走。你有两只手：

 左手（slow指针）：指向"整理好的书架"的下一个空位置
 右手（fast指针）：遍历所有书籍，检查每本书

 核心思想：

 如果当前书可以放入书架（不超过2本限制），就放到左手指向的位置
 左手向右移动一位
 右手继续检查下一本书

 判断标准：什么时候可以放入书架？

 书架还没有2本书时，任何书都可以放
 当书架已有书时，如果当前书与书架倒数第2本不同，就可以放入
 */
public class Medium080_RemoveDuplicatesII {

    public int removeDuplicates(int[] nums) {
        // 边界情况：数组长度小于等于2，无需处理
        if (nums == null || nums.length <= 2) {
            return nums == null ? 0 : nums.length;
        }

        int left = 2;

        for (int right = 2; right < nums.length; right++) {
            if(nums[right] != nums[left-2]) {
                nums[left++] = nums[right];
                left++;
            }
        }

        return left;
    }
}
