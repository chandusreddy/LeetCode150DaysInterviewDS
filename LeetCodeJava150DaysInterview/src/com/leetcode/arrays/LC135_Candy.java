/*************
 * 135. Candy*
  ************

There are n children standing in a line. Each child is assigned
 a rating value given in the integer array ratings.

You are giving candies to these children subjected to the following requirements:

    Each child must have at least one candy.
    Children with a higher rating get more candies than their neighbors.

Return the minimum number of candies you need to have to distribute the candies to the children.

Example 1:

Input: ratings = [1,0,2]
Output: 5
Explanation: You can allocate to the first, second and third child
 with 2, 1, 2 candies respectively.

Example 2:

Input: ratings = [1,2,2]
Output: 4
Explanation: You can allocate to the first, second and third child 
with 1, 2, 1 candies respectively.
The third child gets 1 candy because it satisfies the above two conditions.

 * ***/

package com.leetcode.arrays;

import java.util.Arrays;

public class LC135_Candy {
	public static int candy(int[] ratings) {

		int candies = 0, n = ratings.length;
		int[] left = new int[n];
		int[] right = new int[n];

		Arrays.fill(left, 1);
		Arrays.fill(right, 1);

		// Left relative array
		for (int i = 1; i < n; i++) {
			// If current index rating > previous ; give extra candies
			if (ratings[i] > ratings[i - 1])
				left[i] = left[i - 1] + 1;
		}

		// Right relative array
		for (int i = n - 2; i >= 0; i--) {
			if (ratings[i] > ratings[i + 1])
				right[i] = right[i + 1] + 1;
		}

		// Merge both the sides
		for (int i = 0; i < n; i++) {
			candies = candies + Math.max(left[i], right[i]);
		}

		return candies;
	}

	public static void main(String[] args) {
		int[] ratings = { 1, 0, 2 };
		int test = candy(ratings);
		System.out.println(" The min number of candies that needs to be distributed are : " + test);

	}
}
