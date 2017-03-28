package BalanceNumber;

import java.util.Scanner;

//牛牛在研究他自己独创的平衡数，平衡数的定义是：将一个数分成左右两部分，分别成为两个新的数。
//左右部分必须满足以下两点：
//1，左边和右边至少存在一位。
//2，左边的数每一位相乘如果等于右边的数每一位相乘，则这个数称为平衡数。
//例如：1221这个数，分成12和21的话，1*2=2*1，则称1221为平衡数，再例如：1236这个数，可以分成123和1*2*3=6，所以1236也是平衡数。而1234无论怎样分也不满足平衡数。 
//输入描述:
//输入一个正整数（int范围内）。
//
//
//输出描述:
//如果该数是平衡数，输出 "YES", 否则输出 "NO"。
//
//输入例子:
//1221
//1234
//
//输出例子:
//YES
//NO
public class test {
	
	public Boolean isBalanceNumber(String n){
		char[] a = n.toCharArray();
		if(a.length<2){
			return false;
		}
		int[] b = new int[a.length];
		for(int i = 0;i<a.length;i++){
			b[i] = a[i] - '0';
		}
		int left,right;
		boolean flag = true;
		for(int i = 0;i<b.length;i++){
			left = 1;
			right = 1;
			for(int m = 0;m<i;m++){
				left = left * b[m];
			}
			for(int j = i;j<b.length;j++){
				right = right * b[j];	
			}
			
			System.out.println(left+"  "+right);
			if(left == right){
				return true;
			}else{
				flag = false;
			}
		}
		
		
			
		
			
		
		return flag;
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String n = scan.nextLine();
		test t = new test();
		if(t.isBalanceNumber(n)){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		
	}
}
