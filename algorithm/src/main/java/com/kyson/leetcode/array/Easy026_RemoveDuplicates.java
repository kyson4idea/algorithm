package com.kyson.leetcode.array;

/**
    LeetCode 26题：删除有序数组中的重复项
    1. 题目分析
    题目描述
    给你一个有序数组 nums，需要原地删除重复的元素，使得出现过的每个元素只出现一次，返回删除后数组的新长度。
    关键信息：

    数组是有序的（非常重要！）
    要求原地修改（不能创建新数组）
    返回新数组的长度
    不需要考虑数组中超出新长度后面的元素

    输入输出示例
    输入：nums = [1,1,2]
    输出：2, nums = [1,2,_]
    解释：函数应该返回新的长度 2，原数组 nums 的前两个元素被修改为 1, 2

    输入：nums = [0,0,1,1,1,2,2,3,3,4]
    输出：5, nums = [0,1,2,3,4,_,_,_,_,_]
    2. 思路讲解
    生活化理解
    想象你在整理书架上的书，书已经按照编号排好序了。现在你要把重复的书拿掉，只保留每种书的一本。
    你会怎么做？

    从左到右看每本书
    如果这本书和前一本书是同一种，就把它拿掉
    如果不同，就保留它

    算法思想：双指针法
    由于数组是有序的，重复的元素一定是连续的！这是解题的关键。
    我们用两个指针：

    慢指针（left）：指向当前不重复序列的末尾
    快指针（right）：用来遍历数组，寻找下一个不重复的元素
 */
public class Easy026_RemoveDuplicates {

    /**
     * 输入：nums = [1,1,2]
     * 输出：2, nums = [1,2,_]
     * 解释：函数应该返回新的长度 2，原数组 nums 的前两个元素被修改为 1, 2
     *
     * 输入：nums = [0,0,1,1,1,2,2,3,3,4]
     * 输出：5, nums = [0,1,2,3,4,_,_,_,_,_]
     * @param nums
     * @return
     */

    public int removeDuplicates(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        int slow = 0;

        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow]) {
                nums[++slow] = nums[fast];
            }
        }

        return slow + 1;
    }
}
