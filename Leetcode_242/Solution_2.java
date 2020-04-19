package Leetcode_242;

public class Solution_2 {

	public static boolean isAnagram(String s, String t) {
		if(s.length() != t.length())
			return false;
		int[] count = new int[128];
		char[] c1 = s.toCharArray();
		char[] c2 = t.toCharArray();
		for(int i = 0; i < c1.length; i ++)
			count[c1[i]] ++;
		
		for(int i = 0; i < c2.length ; i ++)
			count[c2[i]] --;
		
		for(int i = 0; i < count.length; i ++)
			if(count[i] < 0)
				return false;
		return true;
	}
	public static void main(String[] args) {
		String s = "aacc";
		String t = "ccac";
		System.out.println(isAnagram(s,t));
	}
}
