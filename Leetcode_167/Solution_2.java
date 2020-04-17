package Leetcode_167;

import java.util.Arrays;

public class Solution_2 {

	//对撞指针
	//时间复杂度O(N)
	public static int[] twoSum(int[] numbers, int target) {
		int i = 0;
		int j = numbers.length -  1;
		while(i < j) {
			if(numbers[i] + numbers[j] == target)
				return new int[] {i + 1, j + 1};
			else if(numbers[i] + numbers[j] < target)
				i ++;
			else
				j --;
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
