package TheSmallestRectangle;

import java.util.Scanner;

//ţţ�ڶ�ά����ϵ�л���N���㣬�Ҷ������㡣����ţţ�뻭��һ�����Σ�ʹ����N���㶼�ھ����ڻ����ھ����ϡ�
//���εı߾�ƽ���������ᡣţţϣ�����ε������С���������ţţ��������С���ε������ 
//��������:
//��������һ��������N��ʾ��ĸ�����2 <= N <= 50��
//  
//������N��ÿ����������x, y����ʾ�õ�����ꡣ����ֵ��С�ڵ���100.
//
//
//�������:
//һ��������ʾ��С���ε������
//
//��������:
//2
//0 1
//1 0
//
//�������:
//1
public class test {
	
	public int getArea(int[] a){
		int minX = a[0];
		int maxX = a[0];
		int minY = a[1];
		int maxY = a[1];
		for(int i = 0;i<a.length-1;i=i+2){
			if(a[i]<minX){
				minX = a[i];
			}
			if(a[i]>maxX){
				maxX = a[i];
			}
		}
		for(int i = 1;i<a.length;i=i+2){
			if(a[i]<minY){
				minY = a[i];
			}
			if(a[i]>maxY){
				maxY = a[i];
			}
		}
		return (maxX - minX) * (maxY - minY);
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i = 0;
		int[] arr = new int[2*n];
		while(i < 2*n){
			arr[i] = scan.nextInt();
			i++;
		}
		test t = new test();
		System.out.println(t.getArea(arr));
	}
}
