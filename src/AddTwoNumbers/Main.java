package AddTwoNumbers;
//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
//
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
//Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//Output: 7 -> 0 -> 8
class ListNode{
	int val;
	ListNode next;
	ListNode(int x){ 
		val = x; 
	}
}


public class Main {
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2){
		ListNode res = new ListNode(0);
		ListNode head = res;
		int extra = 0;
		while(l1 != null || l2 != null || extra != 0){
			ListNode tmp = new ListNode(0);
			int sum = ((l2 == null) ? 0 : l2.val) + ((l1 == null) ? 0 : l1.val) + extra;
			tmp.val = sum % 10;
			extra = sum / 10;
			res.next = tmp;
			res = tmp;
			
			l1 = (l1 == null) ? l1 : l1.next;
            l2 = (l2 == null) ? l2 : l2.next;
		}
		
		return head.next;
	}
	
	public static void main(String[] args){
		ListNode first = new ListNode(2);
		ListNode second = new ListNode(4);
		ListNode third = new ListNode(3);
		
		first.next = second;
		second.next = third;
			
		ListNode forth = new ListNode(5);
		ListNode fifth = new ListNode(6);
		ListNode sixth = new ListNode(4);
		
		forth.next = fifth;
		fifth.next = sixth;
		
		ListNode res =  new Main().addTwoNumbers(first, forth);
		while(res != null){
			System.out.println(res.val);
			res = res.next;
		}
		
	}
}
