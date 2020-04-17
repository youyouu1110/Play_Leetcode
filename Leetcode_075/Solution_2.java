package Leetcode_075;

import java.util.Arrays;

public class Solution_2 {

	//存储0,1,2的个数，分别循环赋值给nums
	//时间复杂度O(N)
	public static void sortColors(int[] nums) {
		int count0 = 0; //0的个数
		int count1 = 0;	//1的个数
		int count2 = 0; //2的个数
		for(int i = 0; i < nums.length; i ++) {
			if(nums[i] == 0)
				count0 ++;
			if(nums[i] == 1)
				count1 ++;
			if(nums[i] == 2)
				count2 ++;
		}
		
		for(int i = 0; i < count0; i ++)
			nums[i] = 0;
		for(int i = count0; i < count0 + count1; i ++)
			nums[i] = 1;
		for(int i = count0 + count1; i < count0 + count1 + count2; i ++)
			nums[i] = 2;
		
	}
	
	public static void main(String[] args) {
		int[] nums = {2,0,2,1,1,0};
		sortColors(nums);
		System.out.println(Arrays.toString(nums));
	}
	
}
