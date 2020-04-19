package Leetcode_350;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//给定两个数组，编写一个函数来计算它们的交集。
//
//示例 1:
//输入: nums1 = [1,2,2,1], nums2 = [2,2]
//输出: [2,2]

//示例 2:
//输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//输出: [4,9]

//说明：
//输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
//我们可以不考虑输出结果的顺序。

public class Solution {

	public static int[] intersect(int[] nums1, int[] nums2) {
       ArrayList<Integer> list = new ArrayList<>();
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i = 0; i < nums1.length; i ++) {
    	   if(!map.containsKey(nums1[i])) {
    		   map.put(nums1[i], 1);
    	   }else {
    		   map.put(nums1[i], map.get(nums1[i]) + 1);
    	   }
       }
       
       for(int num : nums2) {
    	   if(map.containsKey(num)) {
    		   if(map.get(num) != 0) {
    			   map.put(num, map.get(num) - 1);
        		   list.add(num);
    		   }
    	   }
       }
       int[] res = new int[list.size()];
       for(int i = 0; i < list.size(); i ++)
    	   res[i] = list.get(i);
       return res;
    }
	
	public static void main(String[] args) {
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		System.out.println(Arrays.toString(intersect(nums1,nums2)));
	}
}
