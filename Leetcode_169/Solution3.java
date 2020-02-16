package Leetcode_169;

import java.util.Arrays;

public class Solution3 {

	public int majorityElement(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length / 2];
	}
}
