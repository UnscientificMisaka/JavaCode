package LongestSubstringWithoutRepeatingCharacter;

import java.util.HashMap;

//Given a string, find the length of the longest substring without repeating characters.
//
//Examples:
//
//Given "abcabcbb", the answer is "abc", which the length is 3.
//
//Given "bbbbb", the answer is "b", with the length of 1.
//
//Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
//
//Subscribe to see which companies asked this question.
//
//Show Tags
//Show Similar Problems

public class Main {
	
	public int find(String str){
		if(str.length() == 0){
			return 0;
		}
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int res = 0;
		int flag = 0;
		for(int i = 0; i < str.length(); i++){
			if(map.containsKey(str.charAt(i))){
				flag = Math.max(map.get(str.charAt(i)) + 1, flag);
			}
			map.put(str.charAt(i), i);
			res = Math.max(i - flag + 1 , res);
		}
		return res;
	}
	
	public static void main(String[] args){
		System.out.println(new Main().find("abcabd"));
	}
}
