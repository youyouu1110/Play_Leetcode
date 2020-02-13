package Leetcode_001;

import java.util.TreeMap;

public class Solution3 {

	public int[] twoSum(int[] nums, int target) {
		
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i = 0; i < nums.length; i++) {
        	int complement = target - nums[i];
        	if(map.containsKey(complement)) {
        		int[] res = {i, map.get(complement)};
        		return res;
        	}
        	map.put(nums[i], i);
        }
        return null;
    }
}
