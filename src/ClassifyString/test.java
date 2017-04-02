package ClassifyString;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class test {
	
	public int getResult(String[] arr){
		HashSet<String> t = new HashSet<String>();
		for(int i = 0;i<arr.length;i++){
			char[] res = arr[i].toCharArray();
			Arrays.sort(res);
			t.add(String.valueOf(res));
		}
		return t.size();
	}
	
//	public int strToAscii(String str){
//		char[] res = str.toCharArray();
//		int result = 0;
//		for(int i = 0;i<res.length;i++){
//			result = result + (int) res[i];
//		}
//		return result;
//	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] arr = new String[n];
		int i = 0;
		while(scan.hasNextLine()&&i<n){
			arr[i] = scan.next();
			i++;
		}
		test t = new test();
		System.out.println(t.getResult(arr));
	}
}
