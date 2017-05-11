package DeleteDuplication;

//题目描述
//在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
//例如，链表1->2->3->3->4->4->5 处理后为 1->2->5

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Main {
	public ListNode deleteDuplication(ListNode pHead){
		if(pHead == null){
			return null;
		}
		ListNode first = new ListNode(-1);
		first.next = pHead;
		ListNode last = first;
		ListNode tmp = pHead;
		while(tmp != null && tmp.next != null){
			if(tmp.val == tmp.next.val){
				int val = tmp.val;
				while(tmp != null && tmp.val == val){
					tmp = tmp.next;
				}
				last.next = tmp;
			}else{
				last = tmp;
				tmp = tmp.next;
			}
		}
		return first.next;
	}
	
	public static void main(String[] args){
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third =  new ListNode(3);
		ListNode forth = new ListNode(3);
		ListNode fifth = new ListNode(4);
		ListNode sixth = new ListNode(4);
		ListNode seventh = new ListNode(5);
		
		first.next = second;
		second.next = third;
		third.next = forth;
		forth.next = fifth;
		fifth.next = sixth;
		sixth.next = seventh;
		
		System.out.println(new Main().deleteDuplication(first).val);
	}
}
