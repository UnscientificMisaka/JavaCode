package BalanceNumber;

import java.util.Scanner;

//ţţ���о����Լ�������ƽ������ƽ�����Ķ����ǣ���һ�����ֳ����������֣��ֱ��Ϊ�����µ�����
//���Ҳ��ֱ��������������㣺
//1����ߺ��ұ����ٴ���һλ��
//2����ߵ���ÿһλ�����������ұߵ���ÿһλ��ˣ����������Ϊƽ������
//���磺1221��������ֳ�12��21�Ļ���1*2=2*1�����1221Ϊƽ�����������磺1236����������Էֳ�123��1*2*3=6������1236Ҳ��ƽ��������1234����������Ҳ������ƽ������ 
//��������:
//����һ����������int��Χ�ڣ���
//
//
//�������:
//���������ƽ��������� "YES", ������� "NO"��
//
//��������:
//1221
//1234
//
//�������:
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
