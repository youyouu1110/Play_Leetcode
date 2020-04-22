package Leetcode_451;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

//给定一个字符串，请将字符串里的字符按照出现的频率降序排列。
//
//示例 1:
//输入:
//"tree"
//输出:
//"eert"
//解释:
//'e'出现两次，'r'和't'都只出现一次。
//因此'e'必须出现在'r'和't'之前。此外，"eetr"也是一个有效的答案。

//示例 2:
//输入:
//"cccaaa"
//输出:
//"cccaaa"
//解释:
//'c'和'a'都出现三次。此外，"aaaccc"也是有效的答案。
//注意"cacaca"是不正确的，因为相同的字母必须放在一起。

//示例 3:
//输入:
//"Aabb"
//输出:
//"bbAa"

//解释:
//此外，"bbaA"也是一个有效的答案，但"Aabb"是不正确的。
//注意'A'和'a'被认为是两种不同的字符。

public class Solution {

	/// Time Complexity: O(nlogn)
	/// Space Complexity: O(256)
	private class Pair implements Comparable<Pair>{

        public char c;
        public int f;

        public Pair(char c, int f){
            this.c = c;
            this.f = f;
        }

        @Override
        public int compareTo(Pair another){
            return another.f - this.f;
        }
    }

    public String frequencySort(String s) {

        int[] freq = new int[256];
        for(char c: s.toCharArray())
            freq[c] ++;

        ArrayList<Pair> lst = new ArrayList<>();
        for(char c = 0; c < 256; c ++)
            if(freq[c] != 0)
                lst.add(new Pair(c, freq[c]));

        Collections.sort(lst);

        StringBuilder sb = new StringBuilder();
        for(Pair p: lst)
            for(int i = 0; i < p.f; i ++) sb.append(p.c);
        return sb.toString();
    }
}
