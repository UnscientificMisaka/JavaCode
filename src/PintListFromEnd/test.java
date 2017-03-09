package PintListFromEnd;

import java.util.ArrayList;
import java.util.Stack;

//首先思路是递归，递归能做的肯定想到栈也能
class ListNode{
	int val;
	ListNode next = null;
	public ListNode(int val){
		this.val = val;
	}
	
	public void setNext(ListNode next){
		this.next = next;
	}
}


public class test {	
	ArrayList<Integer> list = new ArrayList<Integer>();
	Stack<Integer> stack = new Stack<Integer>();
	 
	public ArrayList<Integer> printUseRecurrence(ListNode listNode){
		if(listNode!=null){
			printUseRecurrence(listNode.next);
			list.add(listNode.val);
		}
		return list;
	}
	
	public void printUseStack(ListNode listNode){
		while(listNode!=null){
			stack.push(listNode.val);
			listNode = listNode.next;
		}
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}
		
	}
	
	
	public static void main(String[] args){
		ListNode head = new ListNode(0);
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(2);
		head.next = one;
		one.next = two;
		test test = new test();
//		test.printUseRecurrence(head);
//		for(int i = 0;i<test.list.size();i++){
//			System.out.println(test.list.get(i));
//		}
		test.printUseStack(head);
		
	
	}
}
