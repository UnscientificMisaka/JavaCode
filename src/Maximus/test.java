package Maximus;

import java.util.Arrays;

//��һ����Ϊn������A��������0��a��b<n��A[b]-A[a]�����ֵ��
//��������A�����Ĵ�Сn���뷵������ֵ��
//����������
//[10,5],2
//���أ�0
public class test {
	public int getDis(int[] A,int n){
		int dis = 0;
		if(n>1){
			int min = A[0];
			for(int i = 0;i<n;i++){
				if(min > A[i]){
					min  = A[i];
				}
				if(A[i] - min > dis){
					dis = A[i] - min;
				}
			}
		}
		return dis;
	}
	
	public static void main(String[] args){
		test t =  new test();
		int[] A = {5,4,1,3,2};
		System.out.println(t.getDis(A,5));
	}
}
