package Leetcode_447;

import java.awt.Point;
import java.util.HashMap;
import java.util.Iterator;

//给定平面上 n 对不同的点，“回旋镖” 是由点表示的元组 (i, j, k) ，其中 i 和 j 之间的距离和 i 和 k 之间的距离相等（需要考虑元组的顺序）。
//找到所有回旋镖的数量。你可以假设 n 最大为 500，所有点的坐标在闭区间 [-10000, 10000] 中。
//
//示例:
//输入:
//[[0,0],[1,0],[2,0]]
//输出:
//2
//解释:
//两个回旋镖为 [[1,0],[0,0],[2,0]] 和 [[1,0],[2,0],[0,0]]

public class Solution {

	 public int numberOfBoomerangs(int[][] points) {
		 int res = 0;
		 for(int i = 0; i < points.length; i ++) {
			 HashMap<Integer,Integer> map = new HashMap<>();
			 for(int j = 0; j < points.length; j ++) {
				 if(j != i) {
					 int length = dis(points[j],points[i]);
					 if(!map.containsKey(length))
						 map.put(length, 1);
					 else
						 map.put(length, map.get(length) + 1);
				 }
			 }
			 
			 for(Integer dis: map.keySet())
				 res += map.get(dis) * (map.get(dis) - 1);
		 }
		 return res;
	 }
	 
	 private static int dis(int[] a, int[] b) {
		 int res = ((a[0] - b[0]) * (a[0] - b[0])) + ((a[1] - b[1]) * (a[1] - b[1]));
		 return res;		 
	 }
}
