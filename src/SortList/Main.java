package SortList;
//Sort a linked list in O(n log n) time using constant space complexity.

class ListNode {
	int val;
	ListNode next = null;
	
	public ListNode(int x){
		this.val = x;
	}
}

public class Main {
	
	public ListNode sortList(ListNode head){

		if(head == null || head.next == null){
			return head;
		}
		
		ListNode tmp = getMiddle(head);
		ListNode last = tmp.next;
		tmp.next = null;
		return mergeLists(sortList(head), sortList(last));	
	}
	
	public ListNode getMiddle(ListNode head){
		if(head == null || head.next == null){
			return head;
		}
		
		ListNode fast = head;
		ListNode slow = head;
		fast = slow;
		
		while(fast.next != null && fast.next.next != null){
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}
	
	public ListNode mergeLists(ListNode head, ListNode last){
		if(head == null){
			return last;
		}
		
		if(last == null){
			return head;
		}
		
		ListNode first = head.next;
		ListNode second = last.next;
		ListNode res, tmp;
		
		if(head.val < last.val){
			res = tmp = head;
			second = last;
		}else{
			res = tmp = last;
			first = last;
		}
		
		while(first != null || second != null){
			if(first == null){
				res.next = second;
				return tmp;
			}else if(second == null){
				res.next = first;
				return tmp;
			}else if(first.val < second.val){
				res.next = first;
				first = first.next;
				res = res.next;
			}else{
				res.next = second;
				second = second.next;
				res = res.next;
			}
		}
		
		return tmp;
	}
	
	public static void main(String[] args){
		ListNode first = new ListNode(5);
		ListNode second = new ListNode(4);
		ListNode third = new ListNode(3);
		ListNode forth = new ListNode(2);
		ListNode fifth = new ListNode(1);
		first.next = second;
		second.next = third;
		third.next = forth;
		forth.next = fifth;
		
		ListNode res = new Main().sortList(first);
		while(res != null){
			System.out.println(res.val);
			res = res.next;
		}
	}
}
