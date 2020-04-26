package Leetcode_003;

//给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
//
//示例 1:
//输入: "abcabcbb"
//输出: 3 
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
//
//示例 2:
//输入: "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
//
//示例 3:
//输入: "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。

public class Solution {

	 public static int lengthOfLongestSubstring(String s) {
		 //滑动窗口为c[i..j]
		 char[] c = s.toCharArray();
		 //存储大小写字母的ASCII码
		 int[] count = new int[256];
		 int i = 0;
		 int j = -1;
		 int length = 0;
		 while(i < c.length) {
			 if(j + 1 < c.length && count[c[j + 1]] == 0) {
				 j ++;
				 count[c[j]] ++;
				 
			 }else {
				 count[c[i]] --;
				 i ++;
			 }
			 length = Math.max(length, j - i + 1);
		 }
		 return length;
	 }
	 
	 public static void main(String[] args) {
		String s = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(s));
	}
}
