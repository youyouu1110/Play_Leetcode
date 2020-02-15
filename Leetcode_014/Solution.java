package Leetcode_014;

//编写一个函数来查找字符串数组中的最长公共前缀。
//如果不存在公共前缀，返回空字符串 ""。
//示例 1:
//输入: ["flower","flow","flight"]
//输出: "fl"
//示例 2:
//输入: ["dog","racecar","car"]
//输出: ""
//解释: 输入不存在公共前缀。

public class Solution {

	public String longestCommonPrefix(String[] strs) {
		String res = "";
		if(strs == null || strs.length == 0)
			return res;
		for(int i = 0; i < strs[0].length(); i ++) {
			char c = strs[0].charAt(i);
			for(int j = 1; j < strs.length; j ++) {
				if(i == strs[j].length() || strs[j].charAt(i) != c)
					return res;
			}
			res += c;
		}
		return res;
	
    }
	
//	public String longestCommonPrefix(String[] strs) {
//	    if (strs == null || strs.length == 0) return "";
//	    for (int i = 0; i < strs[0].length() ; i++){
//	        char c = strs[0].charAt(i);
//	        for (int j = 1; j < strs.length; j ++) {
//	            if (i == strs[j].length() || strs[j].charAt(i) != c)
//	                return strs[0].substring(0, i);             
//	        }
//	    }
//	    return strs[0];
//	}

	
	public static void main(String[] args) {
		Solution test = new Solution();
		String[] strs = {"aa", "a"};
		System.out.println(test.longestCommonPrefix(strs));
	}
}
