package PokerSequence;


import java.util.HashSet;

public class test {
	char[] arr = {'2','2','A','A','3','3','4','4'};
	HashSet<String> res = new HashSet<String>();
	
	public void getArray(char[] arr,int start){
		if(start == arr.length-1){
			String charToStr = String.valueOf(arr);
			res.add(charToStr);
		}else{
			for(int i = start;i<arr.length;i++){
				swap(arr,start,i);
				getArray(arr,start+1);
				swap(arr,start,i);
			}
		}
	}
	
	public void swap(char[] arr,int start,int i){
		char tmp;
		tmp = arr[start];
		arr[start] = arr[i];
		arr[i] = tmp;
	}
	
	public static void main(String[] args){
		
		test t = new test();
		t.getArray(t.arr,0);
		for(String str : t.res){
			System.out.println(str);
		}
		
		
	}

}
