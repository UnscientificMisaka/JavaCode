package ReversePolishNotation;

import java.util.Stack;

//Evaluate the value of an arithmetic expression in Reverse Polish Notation.
//Valid operators are+,-,*,/. Each operand may be an integer or another expression.
//Some examples:

//["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
//["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
public class Main {
	
	public int getPriority(String operator){
		final int plus = 1;
		final int min = 1;
		final int multiply = 2;
		final int divide = 2;
		if("+".equals(plus)){
			return plus;
		}
		
		if("-".equals(min)){
			return min;
		}
		
		if("*".equals(multiply)){
			return multiply;
		}
		
		if("/".equals(divide)){
			return divide;
		}
		return 0;
	}
	
	public int handle(int a, int b, String operator){
		if("+".equals(operator)) return a+b;
		if("-".equals(operator)) return a-b;
		if("*".equals(operator)) return a*b;
		if("/".equals(operator)){
			if(a == 0){
				return 0;
			}
			return a/b;
		} 
		return 0;
	}
	
	
// 逆波兰转中序表达式
	public int evalRPN(String[] tokens){
		Stack<Integer> s = new Stack<Integer>();
		int i = 0;
		while(i < tokens.length){
			try{
				int tmp = Integer.parseInt(tokens[i]);
				s.push(tmp);
			}catch(Exception e){
				int a = s.pop();
				int b = s.pop();
				s.push(handle(b,a,tokens[i]));
			}
			i++;
		}
		return s.pop();
	}
	
//	中序表达式转逆波兰式
	public String evalNormal(String[] tokens){
		StringBuffer sb = new StringBuffer();
		Stack<String> s1 = new Stack<String>();
		Stack<String> s2 = new Stack<String>();
		int i = 0;
		while(i < tokens.length){
			try{
				int tmp = Integer.parseInt(tokens[i]);
				s2.push(String.valueOf(tmp));
				i++;
			}catch(Exception e){
				if(s1.isEmpty()){
					s1.push(tokens[i]);
					i++;
					continue;
				}
				
				if("(".equals(tokens[i])){
					s1.push(tokens[i]);
					i++;
					continue;
				}
				
				if(")".equals(tokens[i])){
					while(!s1.isEmpty()){
						if(!"(".equals(s1.peek())){
							s2.push(s1.pop());
						}else{
							s1.pop();
							break;
						}
					}
					i++;
					continue;
				}
				
				if(this.getPriority(tokens[i]) > this.getPriority(s1.peek())){
					while(!s1.isEmpty()){
						s2.push(s1.pop());
					}
					s1.push(tokens[i]);
					i++;
				}else{
					s1.push(tokens[i]);
					i++; 
				}
			}		
			
		}
		
		while(!s1.isEmpty()){
			s2.push(s1.pop());
		}
		
		while(!s2.isEmpty()){
			sb.append(s2.pop());
		}
		
		return sb.reverse().toString();
	}
	
	public static void main(String[] args){
		Main m = new Main();
		String[] tokens = {"4", "3", "-"};
		String[] _tokens = {"(","2", "+", "1", ")","*", "3"};
//		System.out.println(m.evalNormal(_tokens));
		System.out.println(m.evalRPN(tokens));
	}
}
