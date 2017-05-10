package StringBufferFIrstUnrepeatedChar;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
	Map<Character,Integer> map = new LinkedHashMap<>();
	public void insert(char ch){
		if(map.containsKey(ch)){
			map.put(ch, map.get(ch)+1);
		}else{
			map.put(ch, 1);
		}
	}
	
	public char FirstAppearingOnce() {
		char res = '#';
		for(Map.Entry<Character, Integer> en : map.entrySet()){
			if(en.getValue() == 1){
				res =  en.getKey();
				return res;
			}
		}
		return res;
	}
	
	public static void main(String[] args){
		Main m = new Main();
		m.insert('g');
		m.insert('o');
		System.out.println(m.FirstAppearingOnce());
		m.insert('o');
		m.insert('g');
		m.insert('l');
		m.insert('e');
		System.out.println(m.FirstAppearingOnce());
		
	}
}
