package SetArrayItemProcedure;

import java.util.ArrayList;
//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
//使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，
//并保证奇数和奇数，偶数和偶数之间的相对位置不变。

public class test {
	ArrayList<Integer> res = new ArrayList<Integer>();
	
	public void reOrder(int[] array){
		for(int i = 0;i<array.length;i++){
			if(array[i]%2 != 0){
				res.add(array[i]);
			}
		}
		for(int i = 0;i<array.length;i++){
			if(array[i]%2 == 0){
				res.add(array[i]);
			}
		}
		for(int i = 0;i<array.length;i++){
			array[i] = res.get(i);
			System.out.print(array[i]+" ");
		}
		
	}
	
	public void reOrder2(int[] array){
		int i = 0;
		for(int j = 0;j<array.length;j++){
			if(array[j]%2 != 0){
				if(i != j){
					int tmp = array[i];
					array[i] = array[j];
					for(int k = j;k>i+1;k--){
						array[k] = array[k-1];
					}
					array[i+1] = tmp;
				}
				i++;
			}
		}
	
		
		
	}
	
	public static void main(String[] args){
		int[] array = {2,4,6,1,3,5,7};
		test t = new test();
		t.reOrder2(array);
		for(int i = 0;i<array.length;i++){
			System.out.print(array[i] + " ");
		}
		
	}
}

