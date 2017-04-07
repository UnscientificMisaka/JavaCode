package InvertedNode;

import java.util.LinkedList;

//输入一个链表，输出该链表中倒数第k个结点

class ListNode{
	int val;
	ListNode next = null;
	
	public ListNode(int val){
		this.val = val;
		this.next = null;
	}
}


public class test {
	LinkedList<Integer> list = new LinkedList<Integer>();
	
	public ListNode printFromEnd(ListNode head,int k){
		if(head == null || k<=0){
			return null;
		}else{
			ListNode pre = head;
			ListNode last = head;
			for(int i = 0;i<k-1;i++){
				if(pre.next != null){
					pre = pre.next;
				}else{
					return null;
				}
			}
			while(pre.next != null){
				pre = pre.next;
				last = last.next;
			}
			return last;
		}
	}
	
	public static void main(String[] args){
		test t = new test();
		ListNode first = new ListNode(1);
		ListNode sec = new ListNode(2);
		ListNode thd = new ListNode(3);
		first.next = sec;
		sec.next = thd;
		System.out.println(t.printFromEnd(first, 2).val);
	}
}
