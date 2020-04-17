package Leetcode_283;

//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
//示例:
//输入: [0,1,0,3,12]
//输出: [1,3,12,0,0]
//		
//说明:
//必须在原数组上操作，不能拷贝额外的数组。
//尽量减少操作次数。

public class Solution {

	public static void moveZeroes(int[] nums) {
		int k = 0;
		for(int i = 0; i < nums.length; i ++) {
			if(nums[i] != 0) {
				if(i != k) {
					int temp = nums[i];
					nums[i] = nums[k];
					nums[k] = temp;
					k ++;
				}else
					k ++;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};
		Solution.moveZeroes(nums);
		for(int i = 0; i < nums.length; i ++)
			System.out.print(nums[i] + " ");
	}
}
