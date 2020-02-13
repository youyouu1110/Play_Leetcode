package Leetcode_001;


//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//
//你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
//
//示例:
//
//给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]

public class Solution {

	public int[] twoSum(int[] nums, int target) {
		
        for(int i = 0; i < nums.length; i ++) {
        	int t = nums[i];
        	for(int j = i + 1; j < nums.length; j ++) {
        		if(nums[j] + t == target) {
        			int[] res = {i,j};
        			return res;
        		}
        	}
        }
        return null;
    }
	
	private static void printArr(int[] nums){
        for(int num: nums)
            System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        int[] nums = {0, 4, 3, 0};
        int target = 7;
        printArr((new Solution()).twoSum(nums, target));
    }
}
