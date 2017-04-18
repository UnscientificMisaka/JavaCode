package StringRank;

import java.util.ArrayList;
import java.util.Collections;

//����һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С����������ַ���abc,
//���ӡ�����ַ�a,b,c�������г����������ַ���abc,acb,bac,bca,cab��cba��
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
