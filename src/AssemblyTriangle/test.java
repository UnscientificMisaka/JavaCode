package AssemblyTriangle;

import java.util.Scanner;

//ţţ������N��ľ��,�ֱ���Ϊ1~N,��������N������ȡ������ľ����ʹ������ľ������һ��������,���ܼ����ţţ�ж�����ȡ����?(��������ȡ����ʹ�õ�ľ�������һ����һ������Ϊ�ǲ�ͬ��ȡ��)�� 
//��������:
//��������һ��������N����������һ�й���N����������ʾÿ��ľ���ĳ��ȡ�
//
//N �� 50, ľ���ĳ��� �� 10000.
//
//
//�������:
//���һ��������ʾ��������
//
//��������:
//5
//1 2 3 4 5
//
//�������:
//3
public class test {
	
	public int getNumber(int[] arr){
		int count = 0;
		for(int i = 0;i<arr.length;i++){
			for(int m = i+1;m<arr.length;m++){
				for(int n = m+1;n<arr.length;n++){
					if(arr[i]+arr[m]>arr[n]&&arr[i]+arr[n]>arr[m]&&arr[m]+arr[n]>arr[i]){
						count++;
					}
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		int i = 0;
		while(i<n){
			arr[i] = scan.nextInt();
			i++;
		}
		test t = new test();
		System.out.println(t.getNumber(arr));
	}
}
