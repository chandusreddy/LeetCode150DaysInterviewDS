package com.leetcode.arrays;

public class LC121_BestTimetoBuyorSellStock {

	public static int maxProfit(int[] prices) {
		int minsoFar = prices[0];
		int res = 0;
		for (int i = 1; i < prices.length; i++) {
			minsoFar = Math.min(minsoFar, prices[i]);
			res = Math.max(res, prices[i] - minsoFar);
		}
		return res;

	}

	public static void main(String[] args) {
		int[] stocks = {7,1,5,3,6,4};
		int maxp = maxProfit(stocks);
		System.out.println("The max profit for the stocks is : " +maxp);
		
		
	}
}
