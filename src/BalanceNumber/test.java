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
		if(a.length == 2){
			if(a[0] == a[1]){
				return true;
			}else{
				return false;
			}
		}
		int[] b = new int[a.length];
		for(int i = 0;i<a.length;i++){
			b[i] = a[i] - '0';
		}
		int left = b[0];
		int right = b[1];
		boolean flag = true;
		for(int i = 0;i<b.length-1;i++){
				left = left * b[i+1];
			if(i == b.length-2){
				right = b[b.length-1];
			}else{
				for(int p = i+1;p<b.length-1;p++){
					System.out.println("right��ֵ��  "+right);
//					System.out.println("right��һ����ֵ��  "+b[p+1]);
					right = right * b[p+1];
				}
			}
			
			System.out.println(left+"  "+right);
			if(left == right){
				return true;
			}else{
				flag = false;
				right = b[i+1];
				System.out.println("��"+right);
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
