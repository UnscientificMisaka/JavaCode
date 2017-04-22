package GetMinByCombineArrayItem;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
	
	public String PrintMinNumber(int [] numbers) {
		String res = "";
		if(numbers.length == 0 || numbers == null){
			return res;
		}
		String[] resArr = new String[numbers.length];
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<numbers.length;i++){
			resArr[i] = String.valueOf(numbers[i]);
		}
		Arrays.sort(resArr,new Comparator<String>(){
			public int compare(String s1,String s2){
				String res1 = s1 + s2;
				String res2 = s2 + s1;
				return res1.compareTo(res2);
			}
		});
		for(int i = 0;i<numbers.length;i++){
			sb.append(resArr[i]);
		}
		return sb.toString();
	}
	
	public static void main(String[] args){
		Main m = new Main();
		int[] arr = {3,32,321};
		System.out.println(m.PrintMinNumber(arr));
	}
}
