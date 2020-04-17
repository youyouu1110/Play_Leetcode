package Leetcode_075;

import java.util.Arrays;

//给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
//此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
//注意:
//不能使用代码库中的排序函数来解决这道题。
//
//示例:
//输入: [2,0,2,1,1,0]
//输出: [0,0,1,1,2,2]

public class Solution {

	//选择排序,时间复杂度O(N^2)
	public static void sortColors(int[] nums) {

		for(int i = 0; i < nums.length; i ++) {
			int minIndex = i;
			for(int j = i + 1; j < nums.length; j ++) {
				if(nums[minIndex] > nums[j])
					minIndex = j;
			}
			int temp = nums[i];
			nums[i] = nums[minIndex];
			nums[minIndex] = temp;
		}
    }
	
	public static void main(String[] args) {
		int[] nums = {2,0,2,1,1,0};
		sortColors(nums);
		System.out.println(Arrays.toString(nums));	
	}
}
