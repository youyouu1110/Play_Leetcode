package Leetcode_219;

import java.util.Set;
import java.util.TreeSet;

//示例 1:
//输入: nums = [1,2,3,1], k = 3
//输出: true
//
//示例 2:
//输入: nums = [1,0,1,1], k = 1
//输出: true
//
//示例 3:
//输入: nums = [1,2,3,1,2,3], k = 2
//输出: false
public class Solution_2 {

	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		Set<Integer> set = new TreeSet<>();
		for(int i = 0; i < nums.length; i ++) {
			if(set.contains(nums[i]))
				return true;
			set.add(nums[i]);
			if(set.size() == k + 1)
				set.remove(nums[i - k]);
		}
		return false;
	}
	
}
