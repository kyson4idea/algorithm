# LeetCode 算法学习项目（JAVA）

## 📝 题目命名规范

### 命名格式
```
[难度][题号]_[英文简称].java
```
### 示例
```java
Easy001_TwoSum.java              // 1. 两数之和
Medium015_ThreeSum.java          // 15. 三数之和  
Hard023_MergeKLists.java         // 23. 合并K个升序链表
```

## 📁 项目结构

本项目按照算法类型和学习优先级进行分类，便于系统性学习和快速定位题目。
```
com.kyson.leetcode/
├── hot100/                   # LeetCode热题100（🔥 优先刷完）
│   ├── array/                # 数组类热门题目
│   ├── linkedlist/           # 链表类热门题目
│   ├── string/               # 字符串类热门题目
│   ├── tree/                 # 树类热门题目
│   ├── dp/                   # 动态规划热门题目
│   └── ...
├── algorithm/                # 按算法类型分类（📚 系统学习）
│   ├── array/                # 数组
│   │   ├── Easy001_TwoSum.java
│   │   ├── Easy026_RemoveDuplicates.java
│   │   ├── Easy088_MergeSortedArray.java
│   │   ├── Medium015_ThreeSum.java
│   │   └── Hard004_MedianTwoArrays.java
│   ├── string/               # 字符串
│   │   ├── Easy014_LongestCommonPrefix.java
│   │   ├── Medium005_LongestPalindrome.java
│   │   ├── Medium049_GroupAnagrams.java
│   │   └── Hard076_MinWindowSubstring.java
│   ├── linkedlist/           # 链表
│   │   ├── Easy021_MergeTwoLists.java
│   │   ├── Easy141_LinkedListCycle.java
│   │   ├── Medium002_AddTwoNumbers.java
│   │   └── Hard023_MergeKLists.java
│   ├── tree/                 # 树
│   │   ├── Easy104_MaxDepth.java
│   │   ├── Easy226_InvertTree.java
│   │   ├── Medium094_InorderTraversal.java
│   │   └── Hard124_BinaryTreeMaxPath.java
│   ├── dp/                   # 动态规划
│   │   ├── Easy070_ClimbStairs.java
│   │   ├── Easy198_HouseRobber.java
│   │   ├── Medium062_UniquePaths.java
│   │   ├── Medium322_CoinChange.java
│   │   └── Hard010_RegularExpression.java
│   ├── twopointers/          # 双指针
│   │   ├── Easy167_TwoSumII.java
│   │   ├── Medium011_ContainerWithMostWater.java
│   │   └── Hard042_TrappingRainWater.java
│   ├── slidingwindow/        # 滑动窗口
│   │   ├── Easy121_BestTimeBuyStock.java
│   │   ├── Medium003_LongestSubstring.java
│   │   └── Hard239_SlidingWindowMaximum.java
│   ├── backtracking/         # 回溯算法
│   │   ├── Medium046_Permutations.java
│   │   ├── Medium078_Subsets.java
│   │   └── Hard051_NQueens.java
│   ├── binarysearch/         # 二分查找
│   │   ├── Easy704_BinarySearch.java
│   │   ├── Medium033_SearchRotatedArray.java
│   │   └── Hard004_MedianTwoArrays.java
│   ├── graph/                # 图算法
│   │   ├── Medium200_NumberOfIslands.java
│   │   ├── Medium207_CourseSchedule.java
│   │   └── Hard127_WordLadder.java
│   ├── greedy/               # 贪心算法
│   │   ├── Easy455_AssignCookies.java
│   │   ├── Medium435_NonOverlappingIntervals.java
│   │   └── Hard045_JumpGameII.java
│   ├── stack/                # 栈
│   │   ├── Easy020_ValidParentheses.java
│   │   ├── Medium155_MinStack.java
│   │   └── Hard084_LargestRectangle.java
│   ├── queue/                # 队列
│   │   ├── Easy232_ImplementQueueUsingStacks.java
│   │   └── Medium622_DesignCircularQueue.java
│   ├── heap/                 # 堆
│   │   ├── Easy703_KthLargest.java
│   │   ├── Medium215_KthLargestElement.java
│   │   └── Hard295_FindMedianDataStream.java
│   ├── math/                 # 数学
│   │   ├── Easy007_ReverseInteger.java
│   │   ├── Medium050_PowerOfX.java
│   │   └── Hard149_MaxPointsOnLine.java
│   ├── bit/                  # 位运算
│   │   ├── Easy136_SingleNumber.java
│   │   ├── Medium137_SingleNumberII.java
│   │   └── Hard268_MissingNumber.java
│   └── design/               # 设计类
│       ├── Easy155_MinStack.java
│       ├── Medium146_LRUCache.java
│       └── Hard460_LFUCache.java
├── company/                  # 公司真题（🎯 针对性训练）
│   ├── alibaba/              # 阿里巴巴
│   ├── tencent/              # 腾讯
│   ├── bytedance/            # 字节跳动
│   ├── meituan/              # 美团
│   ├── jd/                   # 京东
│   ├── xiaomi/               # 小米
│   └── didi/                 # 滴滴
├── contest/                  # 周赛题目（🏆 竞赛提升）
│   ├── weekly/               # 周赛
│   └── biweekly/            # 双周赛
└── utils/                    # 工具类（🛠️ 公共组件）
    ├── TreeNode.java         # 二叉树节点
    ├── ListNode.java         # 链表节点
    ├── GraphNode.java        # 图节点
    ├── TestUtil.java         # 测试工具
    └── PrintUtil.java        # 打印工具
```
### 难度分布目标
- 🟢 Easy: 40% (基础巩固)
- 🟡 Medium: 50% (核心提升)
- 🔴 Hard: 10% (拔高训练)

## 🛠️ 代码规范

### 标准模板
```java
package com.kyson.leetcode.algorithm.array;

import java.util.*;

/**
 * LeetCode 1. 两数之和
 * 
 * 题目描述：
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 
 * 和为目标值 target 的那两个整数，并返回它们的数组下标。
 * 
 * 难度：Easy
 * 标签：数组、哈希表
 * 
 * @author kyson
 * @date 2024-12-xx
 */
public class Easy001_TwoSum {
    
    /**
     * 方法一：暴力解法 - 帮助理解题意
     * 时间复杂度：O(n²)
     * 空间复杂度：O(1)
     */
    public int[] bruteForce(int[] nums, int target) {
        // 实现代码...
    }
    
    /**
     * 方法二：哈希表 - 面试推荐解法  
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    public int[] twoSum(int[] nums, int target) {
        // 实现代码...
    }
    
    /**
     * 测试方法
     */
    public static void main(String[] args) {
        Easy001_TwoSum solution = new Easy001_TwoSum();
        
        // 测试用例1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println("输入: " + Arrays.toString(nums1) + ", target = " + target1);
        System.out.println("输出: " + Arrays.toString(solution.twoSum(nums1, target1)));
        
        // 测试用例2  
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        System.out.println("输入: " + Arrays.toString(nums2) + ", target = " + target2);
        System.out.println("输出: " + Arrays.toString(solution.twoSum(nums2, target2)));
    }
}
``` 

**持续更新中... 🔄**