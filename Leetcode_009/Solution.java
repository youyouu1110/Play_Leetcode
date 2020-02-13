package Leetcode_009;

//判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
//示例 1:
//输入: 121
//输出: true
//示例 2:
//输入: -121
//输出: false
//解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
//示例 3:
//输入: 10
//输出: false
//解释: 从右向左读, 为 01 。因此它不是一个回文数。
public class Solution {

	 public boolean isPalindrome(int x) {
		 if(x < 0)
			 return false;
		 String s = String.valueOf(x);
		 int i = 0, j = s.length() - 1;
		 while(i < j) {
			 if(s.charAt(i) != s.charAt(j)) 
				return false;
			 else {
				 i ++;
				 j --;
			 }
		 }
		 return true;
	 }
	 
	 public static void main(String[] args) {
		Solution test = new Solution();
		int x = 1423241;
		System.out.println(test.isPalindrome(x));
	}
}
