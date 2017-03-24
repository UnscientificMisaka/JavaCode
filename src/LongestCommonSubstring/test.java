package LongestCommonSubstring;

import java.util.Scanner;

//输入为两行字符串（可能包含空格），长度均小于等于50
//输出为一个整数，表示最长公共连续子串的长度。
//输入例子:
//abcde
//abgde
//
//输出例子:
//2
public class test {
	
	public int[][] getDP(char[] res1,char[] res2){
		if(res1.length<1||res2.length<1){
			return null;
		}
		
		int[][] dp = new int[res1.length][res2.length];
		
		for(int m = 0;m<res1.length;m++){
			if(res1[m] == res2[0]){
				dp[m][0] = 1;
			}
		}
		
		for(int n = 1;n<res2.length;n++){
			if(res2[n] == res1[0]){
				dp[0][n] = 1;
			}
		}
		
		for(int m = 1;m<res1.length;m++){
			for(int n = 1;n<res2.length;n++){
				if(res1[m] == res2[n]){
					dp[m][n] = dp[m-1][n-1] + 1;
				}
			}
		}
		return dp;
	}
	
	public int getMax(int[][] dp,char[] res1,char[] res2){
		int max = 0;
		for(int m = 1;m<res1.length;m++){
			for(int n = 1;n<res2.length;n++){
				if(dp[m][n] > max){
					max = dp[m][n];
				}
			}
		}
		
		return max;
	}
	
//	额外空间只需O(1)的解法
	public int getMax2(int[][] dp,char[] res1,char[] res2){
		int max = 0;
		int line = 0;
		int queue = res2.length - 1;
		while(line < res1.length){
			int m = line;
			int n = line;
		}
		return max;
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		char[] res1 = str1.toCharArray();
		char[] res2 = str2.toCharArray();
		int count = 0;
		test t = new test();
		if(res1.length == 1&&res2.length == 1){
			if(res1[0] == res2[0]){
				count = 1;
				System.out.println(count);
			}else{
				System.out.println(count);
			}
		}else{
			int[][] dp = t.getDP(res1, res2);
			count = t.getMax(dp, res1, res2);
			System.out.println(count);
		}
		
		
		
	}
	

	
}
