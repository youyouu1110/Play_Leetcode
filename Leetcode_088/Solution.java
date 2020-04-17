package Leetcode_088;

import java.util.Arrays;

//给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
//
//说明:
//初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
//你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
//示例:
//输入:
//nums1 = [1,2,3,0,0,0], m = 3
//nums2 = [2,5,6],       n = 3
//输出: [1,2,2,3,5,6]

public class Solution {

	public static void merge(int[] nums1, int m, int[] nums2, int n) {

		int[] temp = new int[m];
		System.arraycopy(nums1, 0, temp, 0, m);
		int i = 0;
		int j = 0;
		for (int k = 0; k < nums1.length; k++) {
            if(i >= m) {
            	nums1[k] = nums2[j++];           	
            }
            else if(j >= n) {
            	nums1[k] = temp[i++];            	
            }
            else if(temp[i] <= nums2[j]) {
            	nums1[k] = temp[i++];
            	
            }else {
            	nums1[k] = nums2[j++];
            }
        }	
    }
	
	public static void main(String[] args) {
		int[] nums1 = {1,2,0,0};
		int[] nums2 = {2,5};
		int m = 2;
		int n = 2;
		merge(nums1,m,nums2,n);
		System.out.println(Arrays.toString(nums1));
		
	}

}
