package ReorderList;
//Given a singly linked list L: L 0¡úL 1¡ú¡­¡úL n-1¡úL n,
//reorder it to: L 0¡úL n ¡úL 1¡úL n-1¡úL 2¡úL n-2¡ú¡­
//You must do this in-place without altering the nodes' values.
//For example,
//Given{1,2,3,4}, reorder it to{1,4,2,3}
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		this.val = x;
		this.next = null;
	}
}

public class Main {
	public void reorderList(ListNode head) {
		if(head == null) {
	        return;
		}
	
		ListNode slow = head;
		ListNode fast = head;
		while(fast.next != null && fast.next.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		ListNode tmp = slow.next;
		if(tmp != null && tmp.next != null) {
			ListNode next = tmp.next;
			while(next != null) {
				tmp.next = next.next;
				next.next = slow.next;
				slow.next = next;
				next = tmp.next;
			}
		}
		insert(head, slow);
	}
	
	public void insert(ListNode head, ListNode slow) {
		ListNode pHead = head;
		ListNode next = slow.next;
		while(pHead != null && next != null) {
			slow.next = next.next;
			next.next = pHead.next;
			pHead.next = next;
			next = slow.next;
			pHead = pHead.next.next;
		}
	}
	
	public static void main(String[] args) {
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
//		ListNode forth = new ListNode(4);
		first.next = second;
		second.next = third;
//		third.next = forth;
		new Main().reorderList(first);
		while(first != null) {
			System.out.println(first.val);
			first = first.next;
		}
	}
}
