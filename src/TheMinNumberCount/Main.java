package TheMinNumberCount;

import java.util.ArrayList;

public class Main {
	public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(k > input.length || input.length <=0){
			return res;
		}
		quickSort(input,0,input.length-1);
		for(int i = 0;i<k;i++){
			res.add(input[i]);
		}
//		for(int i = 0;i<res.size();i++){
//			System.out.print(res.get(i)+" ");
//		}
		return res;
	}
	
	public void quickSort(int[] arr,int start,int end){
		int i = start;
		int j = end;
		int val = arr[(int) Math.floor((start+end)/2)];
		while(i <= j){
			while(arr[i] < val){
				i++;
			}
			while(arr[j] > val){
				j--;
			}
			if(i <= j){
				swap(arr,i,j);
				i++;
				j--;
			}
			
		}
		if(i<end){
			quickSort(arr,i,end);
		}
		if(j>start){
			quickSort(arr,start,j);
		}
	}
	
	public void swap(int[] arr,int prev,int after){
		int tmp = arr[prev];
		arr[prev] = arr[after];
		arr[after] = tmp;
	}
	
	public static void main(String[] args){
		Main m = new Main();
		int[] arr = {7,3,5,1,7,5,3,4};
		m.GetLeastNumbers_Solution(arr, 4);
	}
}
