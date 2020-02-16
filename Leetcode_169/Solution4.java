package Leetcode_169;

public class Solution4 {

	//ʱ�临�Ӷ�O(N)
	//�ռ临�Ӷ�O(1)
	//Boyer-Moore ͶƱ�㷨
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
