package ExactDivision;

import java.io.IOException;
import java.util.Scanner;

//ţţ����[a, b]�������ҵ�һЩ��������Ա�һ������c����,��������Ҫ����ţţͳ��������һ���ж��ٸ������������������� 
//��������:
//����������������a,b,��-5*10^8 �� a �� b �� 5*10^8)
//������һ��������c��1 <= c <= 1000��
//
//
//�������:
//���һ��������ʾ������
//
//��������:
//0 14 5
//
//�������:
//3

public class test {
	public static void main(String[] args) throws IOException{

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		while(a%c != 0)
			a++;
//		System.out.println(a);
		if(a>b){
			System.out.println(0);
		}else{
			System.out.println((b-a)/c+1);
		}
		
	}
}
