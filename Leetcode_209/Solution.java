package Leetcode_209;


//给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的连续子数组。如果不存在符合条件的连续子数组，返回 0。
//
//示例: 
//输入: s = 7, nums = [2,3,1,2,4,3]
//输出: 2
//解释: 子数组 [4,3] 是该条件下的长度最小的连续子数组。

public class Solution {
	
	//时间复杂度0(N^2)
	public static int minSubArrayLen(int s, int[] nums) {
		int length = 0;
		int temp = nums.length;
		for(int i = 0; i < nums.length; i ++) {
			int sum = 0;
			for(int j = i; j < nums.length; j ++) {
				sum += nums[j];
				if(sum >= s) {
					length = j - i + 1;
					break;
				}
			}
			if(temp > length)
				temp = length;
		}
		return temp;
    }
	
	public static void main(String[] args) {
		int[] nums = {2,3,1,2,4,3};
		int s = 7;
		System.out.println(minSubArrayLen(s,nums));
	}

}
