package Leetcode_021;


//将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
//示例：
//输入：1->2->4, 1->3->4
//输出：1->1->2->3->4->4

public class Solution {

	public class ListNode{
		int val;
		ListNode next;
		
		public ListNode(int x) {
			val = x;
		}
	}
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(-1);
		ListNode cur = dummyHead;
		while(l1 != null && l2 != null) {
			if(l1.val < l2.val) {
				cur.next = l1;
				cur = cur.next;
				l1 = l1.next;
			}
			else {
				cur.next = l2;
				cur = cur.next;
				l2 = l2.next;
			}	 
		}
		if(l1 == null)
			cur.next = l2;
		if(l2 == null)
			cur.next = l1;
		
		return dummyHead.next;
    }
}
