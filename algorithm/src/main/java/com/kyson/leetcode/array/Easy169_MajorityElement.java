package com.kyson.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 *
 *
 * 示例 1：
 *
 * 输入：nums = [3,2,3]
 * 输出：3
 * 示例 2：
 *
 * 输入：nums = [2,2,1,1,1,2,2]
 * 输出：2
 *
 *
 * 提示：
 * n == nums.length
 * 1 <= n <= 5 * 104
 * -109 <= nums[i] <= 109
 *
 *
 * 进阶：尝试设计时间复杂度为 O(n)、空间复杂度为 O(1) 的算法解决此问题。
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
