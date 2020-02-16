package Leetcode_169;

public class Solution1 {

	//Ê±¼ä¸´ÔÓ¶ÈO(N^2)
	public int majorityElement(int[] nums) {
		for(int num : nums) {
			int count = 0;
			for(int e : nums) {
				if(e == num)
					count += 1;
			}
			if(count > nums.length / 2)
				return num;
		}
		return -1;	
	}
	
	public static void main(String[] args) {
		Solution1 test = new Solution1();
		int[] nums = {2,2,1,1,1,2,2};
		System.out.println(test.majorityElement(nums));
	}
}
