package Leetcode_001;

import java.util.TreeMap;

public class Solution2 {

	public int[] twoSum(int[] nums, int target) {
		
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i = 0; i < nums.length; i ++)
        	map.put(nums[i], i);
        
        for(int i = 0; i < nums.length; i ++) {
        	Integer index = map.get(target - nums[i]);
        	if(index != null && index != i) {
        		int[] res = {i, index};
        		return res;
        	}
        }
        return null;
    }
}
