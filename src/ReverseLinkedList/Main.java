package ReverseLinkedList;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}


public class Main {
	
	public ListNode ReverseList(ListNode head){
		ListNode before = null;
		ListNode next = null;
		if(head == null){
			return null;
		}else{
			while(head != null){
				next = head.next;
				head.next = before;
				before = head;
				head = next;
			}
			return before;
		}
	}
	

	public static void main(String[] args){
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		first.next = second;
		second.next = third;
		Main m = new Main();
		m.ReverseList(first);
	}
}
