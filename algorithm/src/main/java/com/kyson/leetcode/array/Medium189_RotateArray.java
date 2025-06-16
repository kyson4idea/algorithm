package com.kyson.leetcode.array;

/**
 * LeetCode 189 - 旋转数组
 * 1. 题目分析
 * 题目要求：给定一个数组和一个数字k，把数组向右旋转k个位置。
 * 举个生活例子：想象你在排队，队伍中有7个人，现在要求后面3个人移到前面去，但是要保持他们之间的相对位置不变。
 * 原数组: [1,2,3,4,5,6,7]  k=3
 * 结果:   [5,6,7,1,2,3,4]
 * 输入输出关系：
 * <p>
 * 输入：整数数组 + 旋转步数k
 * 输出：旋转后的数组（要求原地修改）
 * 考查点：数组操作、空间优化
 * <p>
 * 2. 思路讲解
 * 暴力解法（新手容易理解）
 * 最直观的想法：每次只旋转一步，重复k次。
 * 就像排队时，每次只让最后一个人走到最前面，重复k次。
 * 优化解法1：使用额外数组
 * 创建一个新数组，直接把每个元素放到它应该在的位置。
 * 优化解法2：三次反转（最优解法）
 * 这是最巧妙的方法！用生活例子理解：
 * 假设你有一句话 "I love coding"，想要变成 "coding I love"：
 * <p>
 * 先把整句话倒过来："gnidoc evol I"
 * 再把前面的单词正过来："coding evol I"
 * 最后把后面的单词正过来："coding I love"
 * <p>
 * 对于数组也是一样的道理：
 * 原数组: [1,2,3,4,5,6,7]  k=3
 * <p>
 * 第1步：整个数组反转
 * [7,6,5,4,3,2,1]
 * <p>
 * 第2步：前k个元素反转
 * [5,6,7,4,3,2,1]
 * <p>
 * 第3步：后面n-k个元素反转
 * [5,6,7,1,2,3,4]
 */
public class Medium189_RotateArray {

    /**
     * 旋转数组 - 三次反转法
     * 思路：
     * 1. 反转整个数组
     * 2. 反转前k个元素
     * 3. 反转后n-k个元素
     */
    public void rotate(int[] nums, int k){

        // 向右走10步：相当于先绕一圈（7步），然后再走3步，最终到位置3
        // 走10步的效果 = 走3步的效果  相当于绕了个圈
        k = k % nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end){

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

}
