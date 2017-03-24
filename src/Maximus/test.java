package Maximus;
//有一个长为n的数组A，求满足0≤a≤b<n的A[b]-A[a]的最大值。
//给定数组A及它的大小n，请返回最大差值。
//测试样例：
//[10,5],2
//返回：0
public class test {
	public int getDis(int[] A,int n){
		int max = 0;
		int min = A[0];
		int i = 0;
		int maxIndex = 0;
		int minIndex = 0;
		while(i<A.length){
			if(A[i]>max){
				max = A[i];
				maxIndex = i;
			}
			if(A[i]<min){
				min = A[i];
				minIndex = i;
			}
			i++;
		}
		System.out.println("最大数字下标"+maxIndex+":"+max+"最小数字下标"+minIndex+":"+min);
		if(maxIndex>minIndex){
			n = max - min;
		}else{
			n = 0;
		}
		return n;	
	}
	
	public static void main(String[] args){
		test t =  new test();
		int[] A = {2676,4662,8383,357,6595};
		System.out.println(t.getDis(A,5));
	}
}
