package Maximus;

import java.util.Arrays;

//有一个长为n的数组A，求满足0≤a≤b<n的A[b]-A[a]的最大值。
//给定数组A及它的大小n，请返回最大差值。
//测试样例：
//[10,5],2
//返回：0
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
