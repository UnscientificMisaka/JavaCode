package CreateNewWorld;

import java.util.Scanner;

//������֪���������ײ���㶼��0��1�ļ��㣬ţţ֪�����֮�����ʹ��0��1����һ�������磡
//ţţ����������n��0��m��1������ţţ���Դ����x����Ʒ��ÿ����Ʒ����һ��01����ʾ��ţţ��֪����ǰ���е�0��1������ഴ�����������Ʒ�� 
//��������:
//�������ݰ���x+1�У�
//
//��һ�а�����������x(2 �� x �� 20)��n(0 �� n �� 500)��m(0 �� m �� 500)���Կո�ָ�
//
//��������x�У�ÿ��һ��01��item[i]����ʾ��i����Ʒ��ÿ����Ʒ�ĳ���length(1 �� length �� 50)
//
//
//�������:
//���һ����������ʾţţ����ܴ����������Ʒ
//
//��������:
//3 3 1
//1
//00
//100
//
//�������:
//2
public class test {
	
	public void getCount(int[] arr){
		int i = 0;
		
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] arr = new int[x];
		for(int i = 0;i<x;i++){
			arr[i] = scan.nextInt();
		}
		test t = new test();			
	}
}
