package Leetcode_075;

import java.util.Arrays;

public class Solution_3 {

	//计数排序
	//时间复杂度O(N)
	//多次遍历
	public static void sortColors(int[] nums) {
		int[] count = new int[3];
		for(int i = 0; i < nums.length; i ++)
			count[nums[i]] ++;
		
		int index = 0;
		for(int i = 0; i < count[0]; i ++)
			nums[index ++] = 0;
		for(int i = 0; i < count[1]; i ++)
			nums[index ++] = 1;
		for(int i = 0; i < count[2]; i ++)
			nums[index ++] = 2;
	}
	
	public static void main(String[] args) {
		int[] nums = {2,0,2,1,1,0};
		sortColors(nums);
		System.out.println(Arrays.toString(nums));
	}
}
