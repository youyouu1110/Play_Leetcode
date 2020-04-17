package Leetcode_209;

//给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的连续子数组。如果不存在符合条件的连续子数组，返回 0。
//
//示例: 
//输入: s = 7, nums = [2,3,1,2,4,3]
//输出: 2
//解释: 子数组 [4,3] 是该条件下的长度最小的连续子数组。

public class Solution_2 {
	
	//滑动窗口
	public static int minSubArrayLen(int s, int[] nums) {
		//窗口为nums[i..j]
		int i = 0;
		int j = -1;
		int sum = 0;
		int res = nums.length + 1;
		while(i < nums.length) {
			if(j + 1 < nums.length && sum < s) {
				j ++;
				sum += nums[j];
			}else {
				sum -= nums[i];
				i ++;
			}
			
			if(sum >= s)
				res = Math.min(res, j - i + 1);
		}
		if(res == nums.length + 1)
			return 0;
		return res;
	}
	
	public static void main(String[] args) {
		int[] nums = {2,3,1,2,4,3};
		int s = 7;
		System.out.println(minSubArrayLen(s,nums));
	}
}
