package Leetcode_205;

import java.util.HashMap;

//给定两个字符串 s 和 t，判断它们是否是同构的。
//如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。
//所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。
//
//示例 1:
//输入: s = "egg", t = "add"
//输出: true
//
//示例 2:
//输入: s = "foo", t = "bar"
//输出: false
//
//示例 3:
//输入: s = "paper", t = "title"
//输出: true
//说明:
//你可以假设 s 和 t 具有相同的长度。

public class Solution {
	public static boolean isIsomorphic(String s, String t) {
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        HashMap<Character,Character> map = new HashMap<>();
        for(int i = 0; i < c1.length; i ++) {
        	if(!map.containsKey(c1[i])) {
        		if(!map.containsValue(c2[i]))
        			map.put(c1[i], c2[i]);
        		else
        			return false;
        	}else {
        		if(map.get(c1[i]) != c2[i])
        			return false;
        	}
        }
        return true;
    }
	
	public static void main(String[] args) {
		String s = "egg";
		String t = "add";
		System.out.println(isIsomorphic(s,t));
	}
}
