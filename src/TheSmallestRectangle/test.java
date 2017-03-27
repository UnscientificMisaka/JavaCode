package TheSmallestRectangle;

import java.util.Scanner;

//牛牛在二维坐标系中画了N个点，且都是整点。现在牛牛想画出一个矩形，使得这N个点都在矩形内或者在矩形上。
//矩形的边均平行于坐标轴。牛牛希望矩形的面积最小。请你帮助牛牛计算下最小矩形的面积。 
//输入描述:
//首先输入一个正整数N表示点的个数（2 <= N <= 50）
//  
//接下来N行每行两个整数x, y，表示该点的坐标。绝对值均小于等于100.
//
//
//输出描述:
//一个整数表示最小矩形的面积。
//
//输入例子:
//2
//0 1
//1 0
//
//输出例子:
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
