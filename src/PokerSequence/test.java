package PokerSequence;


import java.util.HashSet;

public class test {
	char[] arr = {'1','2','3','4','5'};
//	char[] arr = {'a','a','a','a','a','b','b','b','b','b','b','b','b','b'};
	HashSet<String> res = new HashSet<String>();
	int count = 0;
	public void getArray(char[] arr,int start){
		if(start == arr.length-1){
			String charToStr = String.valueOf(arr);
			count++;
			System.out.println(charToStr);
//			res.add(charToStr);
		}else{
			for(int i = start;i<arr.length;i++){
				if(isSwap(arr,start,i)){
					swap(arr,start,i);
					getArray(arr,start+1);
					swap(arr,start,i);
				}
				
			}
		}
	}
	
	
	public boolean isSwap(char[] arr,int start,int end){
		for(int i = start;i<end;i++){
			if(arr[i] == arr[end]){
				return false;
			}
			
		}
		return true;
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
		System.out.println(t.count);
		
	}

}
