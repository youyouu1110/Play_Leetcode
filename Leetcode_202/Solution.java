package Leetcode_202;

import java.util.HashMap;

//编写一个算法来判断一个数 n 是不是快乐数。
//
//「快乐数」定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，
//   然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。如果 可以变为  1，那么这个数就是快乐数。
//   如果 n 是快乐数就返回 True ；不是，则返回 False 。
//
//示例：
//输入：19
//输出：true
//解释：
//1^2 + 9^2 = 82
//8^2 + 2^2 = 68
//6^2 + 8^2 = 100
//1^2 + 0^2 + 0^2 = 1

public class Solution {
	
	//对于每次计算各位平方和之后的数，如果map中存在这个数，
	//说明无论计算多少次都无法达到1，此时直接返回false；否则将这个数存入map，并对这个数进行上述操作。
	public static boolean isHappy(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        while(n != 1) {
        	int temp = 0;
        	while(n > 0) {
        		int pop = n % 10;
        		n /= 10;
        		temp = pop * pop;
        		if(map.containsKey(temp))
        			return false;
        		else
        			map.put(temp, 1);
        	}
        	n = temp;
        }
        return true;
    }
	
	public static void main(String[] args) {
		int n = 2;
		System.out.println(isHappy(n));
	}

}
