package TowStackRealizeQueue;

import java.util.Stack;

public class test {

	Stack<Integer> stack1= new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	
	public void push(int node){
		stack1.push(node);
	}
	
	public int pop(){
		while(stack2.size()>0){
			return stack2.pop();
		}
		while(stack1.size()>0){
			stack2.push(stack1.pop());
		}
		return stack2.pop();
	}
	
	public static void main(String[] args){
		test t = new test();
		t.push(1);
		t.push(2);
		t.push(3);
		System.out.println(t.pop());
		System.out.println(t.pop());
		t.push(4);
		System.out.println(t.pop());
		t.push(5);
		System.out.println(t.pop());
		System.out.println(t.pop());
	}
}
