package Leetcode_242;

import java.util.HashMap;

//给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
//
//示例 1:
//输入: s = "anagram", t = "nagaram"
//输出: true
//
//示例 2:
//输入: s = "rat", t = "car"
//输出: false
//说明:
//你可以假设字符串只包含小写字母。

public class Solution {

	public static boolean isAnagram(String s, String t) {
		if(s == ""|| s == null || t == "" || t == null)
			return false;
		if(s.length() != t.length())
			return false;
		char[] c1 = s.toCharArray();
		char[] c2 = t.toCharArray();
		HashMap<Character,Integer> map = new HashMap<>();
		for(char c : c1) {
			if(!map.containsKey(c))
				map.put(c,1);
			else
				map.put(c, map.get(c) + 1);
		}
		for(char c : c2) {
			if(map.containsKey(c)) {
				if(map.get(c) != 0)
					map.put(c, map.get(c) - 1);
				else
					return false;
			}else {
				return false;
			}
		}
		return true;
    }
	
	public static void main(String[] args) {
		String s = "aacc";
		String t = "ccac";
		System.out.println(isAnagram(s,t));
	}
}
