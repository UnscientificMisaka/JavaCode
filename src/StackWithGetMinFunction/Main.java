package StackWithGetMinFunction;

import java.util.Stack;

public class Main {
	Stack<Integer> data = new Stack<Integer>();
	Stack<Integer> min = new Stack<Integer>();
	Integer tmp = null;
	
	public void push(int node){
		if(tmp == null){
			tmp = node;
			data.push(node);
			min.push(tmp);
		}else{
			if(node <= tmp){
				tmp = node;
				min.push(tmp);
			}
			data.push(node);
		}
	}
	
	public void pop(){
		int dataPop = data.pop();
		int minPop = min.pop();
		if(dataPop != minPop){
			min.push(minPop);
		}
	}
	
	public int top(){
		int dataPop = data.pop();
		data.push(dataPop);
		return dataPop;
	}
	
	public int min(){
		int minPop = min.pop();
		min.push(minPop);
		return minPop;
	}
}
