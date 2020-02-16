package Leetcode_169;

import java.util.TreeMap;

//给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
//你可以假设数组是非空的，并且给定的数组总是存在多数元素
//示例 1:
//输入: [3,2,3] -> [2,3,3]
//输出: 3
//示例 2:
//输入: [2,2,1,1,1,2,2] -> [1,1,1,2,2,2,2]
//输出: 2

public class Solution2 {

	//时间复杂度O(N)
	public int majorityElement(int[] nums) {
		TreeMap<Integer,Integer> map = new TreeMap<>();
		for(int num : nums) {
			if(map.containsKey(num))
				map.put(num, map.get(num) + 1);
			else
				map.put(num, 1);
		}
		for(int i = 0; i < nums.length; i ++)
			if(map.get(nums[i]) > nums.length / 2)
				return nums[i];
		return -1;
    }
	
	public static void main(String[] args) {
		Solution2 test = new Solution2();
		int[] nums = {2,2,1,1,1,2,2};
		System.out.println(test.majorityElement(nums));
	}
	
}
