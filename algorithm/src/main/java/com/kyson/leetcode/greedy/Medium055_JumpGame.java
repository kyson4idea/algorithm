package com.kyson.leetcode.greedy;

/**
 * LeetCode 55. 跳跃游戏
 * 📋 题目分析
 * 题目描述：给定一个非负整数数组 nums，你最初位于数组的第一个下标。数组中的每个元素代表你在该位置可以跳跃的最大长度。判断你是否能够到达最后一个下标。
 * 简单理解：想象你在玩跳格子游戏，每个格子上写着一个数字，表示你最多能向前跳几步。问题是：你能从第一个格子跳到最后一个格子吗？
 * 输入输出关系：
 *
 * 输入：[2,3,1,1,4] → 输出：true（能到达）
 * 输入：[3,2,1,0,4] → 输出：false（不能到达）
 *
 * 题目类型：贪心算法 / 动态规划
 * 💡 思路讲解
 * 暴力解法思路（容易理解）
 * 就像走迷宫一样，我们可以尝试所有可能的跳跃路径，看是否有一条路能到达终点。但这样效率很低。
 * 优化思路：贪心算法
 * 核心思想：我们不需要关心具体怎么跳，只需要知道"能跳到的最远距离"。
 * 生活例子：比如你要过河，有很多块石头。你不需要计划每一步怎么跳，只需要确保每次都能跳到"能到达的最远的石头"，最终看能不能到对岸。
 * 算法思想：
 *
 * 维护一个变量 maxReach，表示当前能到达的最远位置
 * 遍历数组，不断更新最远可达位置
 * 如果当前位置超过了最远可达位置，说明无法到达
 * 如果最远可达位置≥数组长度-1，说明能到达终点
 */
public class Medium055_JumpGame {

    // 贪心算法模板（适用于跳跃类问题）
    public boolean canReach(int[] nums){

        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) return false;
            maxReach = Math.max(maxReach, i + nums[i]);
        }
        return maxReach >= nums.length;   // maxReach >= target
    }

    public boolean canJump(int[] nums){
        // 边界情况：数组为空或只有一个元素
        if (nums == null || nums.length <= 1) {
            return true;
        }

        // maxReach 表示当前能到达的最远位置
        int maxReach = 0;

        // 遍历数组中的每个位置
        for (int i = 0; i < nums.length; i++) {
            // 如果当前位置超过了能到达的最远位置，说明无法到达当前位置
            if (i > maxReach) {
                return false;
            }

            // 更新最远可达位置
            // 从位置i能跳到的最远位置是 i + nums[i]
            maxReach = Math.max(maxReach, i + nums[i]);

            // 提前判断：如果已经能到达或超过最后一个位置，直接返回true
            if (maxReach >= nums.length - 1) {
                return true;
            }
        }

        // 遍历完成，检查是否能到达最后一个位置
        return maxReach >= nums.length - 1;
    }

}
