package Leetcode_026;

public class Solution2 {

	public int removeElement(int[] nums, int val) {
		int i = 0;
		int n = nums.length;
		while(i < n) {
			if(nums[i] == val) {
				nums[i] = nums[n - 1];
				n --;
			}else
				i ++;
		}
		return n;
	}
}
