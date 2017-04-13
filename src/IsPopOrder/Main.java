package IsPopOrder;

import java.util.Stack;

public class Main {
	
	public boolean isPopOrder(int[] push,int[] pop){
		if(push == null || pop == null){
			return false;
		}
		Stack<Integer> s = new Stack<Integer>();
		int index = 0;
		for(int i = 0;i<push.length;i++){
			s.push(push[i]);	
			while(!s.isEmpty() && s.peek() == pop[index]){
				s.pop();
				index++;
			}
		}
		return s.empty();
	}
	
	public static void main(String[] args){
		Main m = new Main();
		int[] push = {1,2,3,4,5};
		int[] pop = {4,5,3,2,1};
		System.out.println(m.isPopOrder(push, pop));
	}
	
}
