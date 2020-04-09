package Leetcode_067;

public class Solution_2 {

	public static String addBinary(String a, String b) {
       int aLength = a.length();
       int bLength = b.length();
       
       //高位补0,使a和b位数相同
       while(aLength < bLength) {
    	   a = '0' + a;
    	   aLength ++;
       }
       while(aLength > bLength) {
    	   b = '0' + b;
    	   bLength ++;
       }
       char[] x = a.toCharArray();
	   char[] y = b.toCharArray();
	   int temp = 0; //表示进位
       StringBuilder res = new StringBuilder();
       for(int i = aLength - 1; i >= 0; i --) {
    	   int cur = (x[i] - '0') + (y[i] - '0') + temp;
    	   if(cur == 2) {
    		   res.append(0);
    		   temp = 1;
    	   }
    	   else if(cur > 2) {
    		   res.append(1);
    		   temp = 1;
    	   }else {
    		   res.append(cur);
    		   temp = 0;
    	   }
       }
       if(temp == 1)
    	   res.append(temp);
       
       return res.reverse().toString();
    }
	
	public static void main(String[] args) {
		String a = "1010";
		String b = "1011";
		System.out.println(Solution_2.addBinary(a, b));
	}
}
