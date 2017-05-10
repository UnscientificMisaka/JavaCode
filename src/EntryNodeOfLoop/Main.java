package EntryNodeOfLoop;
//题目描述
//一个链表中包含环，请找出该链表的环的入口结点。
class ListNode{
	int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Main {
	public ListNode EntryNodeOfLoop(ListNode pHead){
		if(pHead == null || pHead.next == null){
			return null;
		}
		ListNode head = pHead;
		ListNode tmp = pHead;
		while(tmp != null && tmp.next != null){
			tmp = tmp.next.next;
			pHead = pHead.next;
			if(tmp == pHead){
				tmp = head;
				while(tmp != pHead){
					tmp = tmp.next;
					pHead = pHead.next;
				}
				return pHead;
			}
		}
		return null;
	}
	
	public static void main(String[] args){
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode forth = new ListNode(4);
		
		first.next = second;
		second.next = third;
		third.next = forth;
		forth.next = second;
		
		System.out.println(new Main().EntryNodeOfLoop(first).val);
	}
}
