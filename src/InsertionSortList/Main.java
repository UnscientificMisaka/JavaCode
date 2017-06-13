package InsertionSortList;
//Sort a linked list using insertion sort.
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class Main {
	public ListNode insertionSortList(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		}
		ListNode nHead = new ListNode(-1);
		ListNode cur = head;
		ListNode prev = nHead;
		while(cur != null) {
			ListNode tmp = cur.next;
			prev = nHead;
			while(prev.next != null && prev.next.val < cur.val) {
				prev = prev.next;
			}
			cur.next = prev.next;
			prev.next = cur;
			cur = tmp;
		}
		return nHead.next;
	}
	
	public static void main(String[] args) {
		ListNode first = new ListNode(3);
		ListNode second = new ListNode(5);
		ListNode third = new ListNode(1);
		ListNode forth = new ListNode(7);
		
		first.next = second;
		second.next = third;
		third.next = forth;
		ListNode res = new Main().insertionSortList(first);
		while(res != null) {
			System.out.println(res.val);
			res = res.next;
		}
	}
}
