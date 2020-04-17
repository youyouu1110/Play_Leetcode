package Leetcode_215;


//
//在未排序的数组中找到第 k 个最大的元素。
//请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
//示例 1:
//输入: [3,2,1,5,6,4] 和 k = 2
//      [1,2,3,4,5,6]
//输出: 5
//
//示例 2:
//输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
//      [1,2,2,3,3,4,5,5,6]
//输出: 4

public class Solution {

	//插入排序对数组进行排序
	//时间复杂度0(N^2)
	public static int findKthLargest(int[] nums, int k) {
		for(int i = 1; i < nums.length; i ++) 
			for(int j = i; j > 0; j --) 
				if(nums[j - 1] > nums[j])
					swap(nums,j - 1, j);
		return nums[nums.length - k];
	}
	
	public static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {3,2,3,1,2,4,5,5,6};
//		insertSort(nums);
//		System.out.println(Arrays.toString(nums));
		int k = 4;
		System.out.println(findKthLargest(nums,k));
	}
}
