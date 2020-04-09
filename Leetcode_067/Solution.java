package Leetcode_067;

public class Solution {
/*
 * 
 * 
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
   输入为 非空 字符串且只包含数字 1 和 0。
   示例 1:
   输入: a = "11", b = "1"
   输出: "100"

   示例 2:
   输入: a = "1010", b = "1011"
   输出: "10101"

 */
	
	//输入的a,b在long的范围内，若a,b长度过长，则此方法失效
	public static String addBinary(String a, String b) {
        int x = twoToTen(a) + twoToTen(b);
        return tenToTwo(x);
    }
	
	public static int twoToTen(String a) {
		char[] c = a.toCharArray();
		int res = 0;
		for(int i = 0; i < c.length; i ++) {
			int x = (int) ((c[i] - '0') * Math.pow(2, a.length() - 1 - i));
			res += x;
		}
		return res;
	}
	
	public static String tenToTwo(int a) {
		StringBuilder sb = new StringBuilder();
		while(a / 2 != 0) {
			int pop = a % 2;
			a /= 2;
			sb.append(pop);
		}
		sb.append(1);
		return sb.reverse().toString();
	}
	
	public static void main(String[] args) {
		String a = "0";
		String b = "0";
		System.out.println(Solution.twoToTen(a));
	//	System.out.println(Solution.tenToTwo(b));
		System.out.println(Solution.addBinary(a, b));
		
	}
}
