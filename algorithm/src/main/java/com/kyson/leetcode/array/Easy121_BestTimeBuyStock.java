package com.kyson.leetcode.array;

/**
 * LeetCode 121: 买卖股票的最佳时机
 * 1. 题目分析
 * 题目要求：给定一个数组，数组中第i个元素是股票在第i天的价格。你只能选择某一天买入股票，选择在未来的某一天卖出股票，求能获得的最大利润。
 * 简单理解：就像你去菜市场买菜，想要以最低价买入，最高价卖出，获得最大利润。但有个限制：必须先买后卖（不能做空）。
 * 输入输出关系：
 * <p>
 * 输入：股票每天的价格数组 [7,1,5,3,6,4]
 * 输出：最大利润 5（第2天买入价格1，第5天卖出价格6）
 * <p>
 * 生活化比喻：你在菜市场转悠，一边记住今天见过的最便宜的苹果价格，一边看到新的价格就想"如果我之前以最低价买了苹果，现在卖出能赚多少？"
 */
public class Easy121_BestTimeBuyStock {

    /**
     * 最优解法
     * @param prices
     * @return
     */
    public int maxProfit_(int[] prices) {
        int minprice = Integer.MAX_VALUE;  // 记录历史最低价格
        int maxprofit = 0;                // 记录最大利润

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                // 发现更低的价格，更新最低价格
                minprice = prices[i];
            } else if (prices[i] - minprice > maxprofit) {
                // 当前价格不是最低价，计算如果今天卖出的利润
                // 如果利润更大，更新最大利润
                maxprofit = prices[i] - minprice;
            }
        }

        return maxprofit;
    }

    /**
     * 动态规划解法：状态转移的思想
     * 状态定义：dp[i][0] 第i天不持有股票时的最大利润
     * dp[i][1] 第i天持有股票时的最大利润
     */
    public int maxProfit(int[] prices){

        int n = prices.length;

        // 1. 边界情况处理
        if (n == 0) return 0;

        // 2. 定义状态数组 dp[i][0] 表示不持股，dp[i][1] 表示持股
        int[][] dp = new int[n][2];

        // 3. 初始化第0天
        dp[0][0] = 0;            // 4. 第0天不持股，利润为0
        dp[0][1] = -prices[0];   // 5. 第0天持股，花了 prices[0]

        // 6. 从第1天开始遍历
        for (int i = 1; i < n; i++) {
            // 7. 第i天不持股：昨天就不持股，或今天卖出
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);

            // 8. 第i天持股：昨天就持股，或今天买入
            // 由于只能买一次，所以只能从 -prices[i]
            dp[i][1] = Math.max(dp[i - 1][1], -prices[i]);
        }

        // 9. 最后返回最后一天不持股的最大利润
        return dp[n - 1][0];
    }

}
