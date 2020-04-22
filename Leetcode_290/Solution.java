package Leetcode_290;

import java.util.Arrays;
import java.util.HashMap;


//给定一种规律 pattern 和一个字符串 str ，判断 str 是否遵循相同的规律。
//这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应规律。
//
//示例1:
//输入: pattern = "abba", str = "dog cat cat dog"
//输出: true
//
//示例 2:
//输入:pattern = "abba", str = "dog cat cat fish"
//输出: false
//
//示例 3:
//输入: pattern = "aaaa", str = "dog cat cat dog"
//输出: false
//
//示例 4:
//输入: pattern = "abba", str = "dog dog dog dog"
//输出: false
//说明:
//你可以假设 pattern 只包含小写字母， str 包含了由单个空格分隔的小写字母。 

public class Solution {
	
	 public static boolean wordPattern(String pattern, String str) {
		 char[] c = pattern.toCharArray();
	     String[] strs = str.split(" ");
	     if(c.length != strs.length)
	    	 return false;
	     HashMap<Character,String> map = new HashMap<>();
	     for(int i = 0; i < c.length; i ++) {
	    	 if(!map.containsKey(c[i]))
	    		 if(map.containsValue(strs[i])) {
	    			 return false;
	    		 }else {
	    			 map.put(c[i], strs[i]);
	    	  }
	          else {
	        	  if(!map.get(c[i]).equals(strs[i]))
	        		 return false;
	        	}
	        }
	        return true;       
	 }
	 public static void main(String[] args) {
		String pattern = "abba";
		String str = "dog dog dog dog";
		System.out.println(wordPattern(pattern,str));
 	}
}
