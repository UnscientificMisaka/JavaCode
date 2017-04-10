package MergeLinkedList;

//输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。

class ListNode{
	int val;
	ListNode next = null;
	
	public ListNode(int val){
		this.val = val;
	}
}


public class Main {
	
	public ListNode Merge(ListNode list1,ListNode list2){
		if(list1 == null){
			return list2;
		}
		if(list2 == null){
			return list1;
		}
		
	
		if(list1.val < list2.val){
			list1.next = Merge(list1.next,list2);
			return list1;
		}else{
			list2.next = Merge(list2.next,list1);
			return list2;
		}
	}
	
	public ListNode Merge2(ListNode list1,ListNode list2){
		if(list1 == null){
			return list2;
		}
		if(list2 == null){
			return list1;
		}
		
		ListNode res = null;
		ListNode cur = null;
		
		while(list1 != null && list2 !=null){
			if(list1.val < list2.val){
				if(res == null){
					res = list1;
					cur = list1;
				}else{
					cur.next = list1;
					cur = cur.next;
				}
				list1 = list1.next;
			}else{
				if(res == null){
					res = list2;
					cur = list2;
				}else{
					cur.next = list2;
					cur = cur.next;
				}
				list2 = list2.next;
			}
		}
		
		//其中一个链表遍历完后
		if(list1 == null){
			cur.next = list2;
		}else{
			cur.next = list1;
		}
		

		return res;
	}
	
	public static void main(String[] args){
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(3);
		ListNode c = new ListNode(5);
		ListNode d = new ListNode(2);
//		ListNode e = new ListNode(4);
//		ListNode f = new ListNode(6);
		a.next = b;
		b.next = c;
//		d.next = e;
//		e.next = f;
		Main m = new Main();
		ListNode res = m.Merge2(a, d);
		while(res != null){
			System.out.println(res.val);
			res = res.next;
		}

	}

}
