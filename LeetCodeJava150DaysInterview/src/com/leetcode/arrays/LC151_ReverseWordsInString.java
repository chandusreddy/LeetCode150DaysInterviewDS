/**
 * *******************************
 * 151. Reverse Words in a String*
 * *******************************

Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. 
The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple 
spaces between two words. The returned string should only have a 
single space separating the words. Do not include any extra spaces.

Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"

Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.

Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between 
two words to a single space in the reversed string.

Constraints:

    1 <= s.length <= 104
    s contains English letters (upper-case and lower-case), digits, and spaces ' '.
    There is at least one word in s.
 * 
 * 
 * **/

package com.leetcode.arrays;

public class LC151_ReverseWordsInString {

	public static String reverseWords(String s) {
		String[] words = s.split("//s+");
		StringBuilder res = new StringBuilder();

		for (int i = words.length - 1; i >= 0; i--) {
			res.append(words[i]);

			if (i != 0) {
				res.append(" ");
			}

		}

		return res.toString().trim();

	}

	public static void main(String[] args) {
		String s = "the sky is blue";
		String test = reverseWords(s);

		System.out.println("The Reverse word of the String is : " + test);

	}

}
