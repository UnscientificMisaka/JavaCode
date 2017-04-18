package StringRank;

import java.util.ArrayList;
import java.util.Collections;

//输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,
//则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
public class Main {
	ArrayList<String> res = new ArrayList<String>();
	
	public ArrayList<String> Permutation(char[] arr,int start){
		if(start == arr.length - 1){
			res.add(String.valueOf(arr));
//			System.out.println(String.valueOf(arr));
		}else{
			for(int i = start;i<arr.length;i++){
				if(isSwap(arr,start,i)){
					swap(start,i,arr);
					Permutation(arr,start+1);
					swap(start,i,arr);
				}
			}
		}
		Collections.sort(res);
		return res;
	}
	
	public boolean isSwap(char[] arr,int start,int end){
		for(int i = start;i<end;i++){
			if(arr[i] == arr[end]){
				return false;
			}
			
		}
		return true;
	}
	
	public void swap(int start,int end,char[] arr){
		char tmp = arr[start];
		arr[start] = arr[end];
		arr[end] = tmp;
	}
	
	public static void main(String[] args){
		String str = "abc";
		char[] arr = str.toCharArray();
		Main m = new Main();
		m.Permutation(arr,0);
		for(String a:m.res){
			System.out.println(a);
		}
	}
}
