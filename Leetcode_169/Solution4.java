package Leetcode_169;

public class Solution4 {

	//时间复杂度O(N)
	//空间复杂度O(1)
	//Boyer-Moore 投票算法
	public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}
