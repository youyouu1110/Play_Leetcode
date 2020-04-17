package Leetcode_167;

import java.util.Arrays;

//给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
//函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
//说明:
//返回的下标值（index1 和 index2）不是从零开始的。
//你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
//
//示例:
//输入: numbers = [2, 7, 11, 15], target = 9
//输出: [1,2]
//解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 

public class Solution {

	//有序？ -> 二分搜索法 
	//时间复杂度0(NlogN)
	public static int[] twoSum(int[] numbers, int target) {
		for(int i = 0; i < numbers.length; i ++) {
			int x = target - numbers[i];
			int l = i + 1;
			int r = numbers.length - 1;
			while(l <= r) { // [l..r]中查找x
				int mid = (l + r) / 2;
				if(numbers[mid] == x)
					return new int[] {i + 1, mid + 1};
				else if(numbers[mid] > x) {
					r = mid - 1;
				}else {
					l = mid + 1;
				}
			}
		}
		throw new IllegalArgumentException("Error!");
	}
	
	public static void main(String[] args) {
		int[] numbers = {2, 7, 11, 15};
		int target = 9;
		int[] res = twoSum(numbers,target);
		System.out.println(Arrays.toString(res));
	}
	
}
