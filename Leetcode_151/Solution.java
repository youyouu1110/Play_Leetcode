package Leetcode_151;

//给定一个字符串，逐个翻转字符串中的每个单词。
//示例 1：
//输入: "the sky is blue"
//输出: "blue is sky the"
//
//示例 2：
//输入: "  hello world!  "
//输出: "world! hello"
//解释: 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
//
//示例 3：
//输入: "a good   example"
//输出: "example good a"
//解释: 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
// 
//说明：
//无空格字符构成一个单词。
//输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
//如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。

public class Solution {

	public static String reverseWords(String s) {
		String ss = s.trim();
//		\\s表示 空格,回车,换行等空白符,
//		+号表示一个或多个
		String[] words = ss.split("\\s+");
		StringBuilder sb = new StringBuilder();
		int i = 0; 
		int j = words.length - 1;
		while(i < j) {
			String temp = words[i];
			words[i] = words[j];
			words[j] = temp;
			i ++;
			j --;
		}
		for(int k = 0; k < words.length; k ++) {
			if(k == words.length - 1)
				sb.append(words[k]);
			else
				sb.append(words[k] + " ");
		}
		return sb.toString();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "the    sky is blue";
//		String[] ss = s.split(" ");
		System.out.println(Solution.reverseWords(s));
	}
}
