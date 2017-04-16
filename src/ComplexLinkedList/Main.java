package ComplexLinkedList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

//输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
//返回结果为复制后复杂链表的head。
//（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）

class RandomListNode{
	int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}


public class Main {
	
	public RandomListNode Clone(RandomListNode pHead){
		RandomListNode res = pHead;

		while(pHead != null){
			RandomListNode tmp = new RandomListNode(res.next.label);
			tmp.next = res.next.next;
			res.next = tmp;
			pHead = pHead.next;
		}
		
		while(pHead != null && res != null){
			res.random = pHead.random;
			res = res.next;
			pHead = pHead.next;
		}
		
		return res;
	}
	
	public RandomListNode Clone2(RandomListNode pHead){
		RandomListNode res = pHead;
		HashMap<RandomListNode,RandomListNode> map = new HashMap<RandomListNode,RandomListNode>();
		while(res != null){
			RandomListNode tmp = new RandomListNode(res.label);
			map.put(res,tmp);
			tmp.next = res.next;
			res.next = tmp;
			res = tmp.next;
		}
		Set<Entry<RandomListNode,RandomListNode>> set = map.entrySet();
		Iterator<Entry<RandomListNode,RandomListNode>> it = set.iterator();
		return map.get(pHead);
	}
	
	public RandomListNode Clone3(RandomListNode pHead){
		if(pHead == null){
			return null;
		}
		RandomListNode tmp = new RandomListNode(pHead.label);
		tmp.random = pHead.random;
		tmp.next = Clone3(pHead.next);
		return tmp;
	}
	
	
	
	public static void main(String[] args){
		RandomListNode head = new RandomListNode(1);
		RandomListNode second = new RandomListNode(2);
		RandomListNode third = new RandomListNode(3);
		RandomListNode forth = new RandomListNode(4);
		head.next = second;
		second.next = third;
		third.next = forth;
		head.random = forth;
		second.random = third;
		third.random = null;
		forth.random = third;
		Main m = new Main();
		RandomListNode res = m.Clone3(head);
		while(res!=null){
			System.out.println(res.label);
			res = res.next;
		}
	}
}


