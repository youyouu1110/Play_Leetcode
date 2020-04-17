package Leetcode_283;

public class Solution_2 {

	public static void moveZeroes(int[] nums) {
		int k = 0;  //[0..k)中保存非0元素
		for(int i = 0; i < nums.length; i ++) {
			if(nums[i] != 0) {
				nums[k] = nums[i];
				k ++;
			}
		}
		for(int i = k; i < nums.length; i ++)
			nums[i] = 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,1,0,3,12};
		Solution_2.moveZeroes(nums);
		for(int i = 0; i < nums.length; i ++)
			System.out.print(nums[i] + " ");
	}

}
