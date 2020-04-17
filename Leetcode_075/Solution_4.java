package Leetcode_075;

import java.util.Arrays;

public class Solution_4 {

	//时间复杂度O(N)
	//遍历一次
	public static void sortColors(int[] nums) {
		int zero = -1; // [0..zero] == 0
		int two = nums.length; // [two..n-1] == 2
		for(int i = 0; i < two; ) {
			if(nums[i] == 1)
				i ++;
			else if(nums[i] == 0) {
				zero ++;
				int temp = nums[zero];
				nums[zero] = nums[i];
				nums[i] = temp;
				i ++;
			}
			else { // nums[i] == 2
				two --;
				int temp = nums[two];
				nums[two] = nums[i];
				nums[i] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] nums = {2,0,2,1,1,0};
		sortColors(nums);
		System.out.println(Arrays.toString(nums));
	}
}
