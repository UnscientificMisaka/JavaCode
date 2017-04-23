package FirstOnlyAppearOnceChar;

import java.util.HashMap;

public class Main {
	
	  public int FirstNotRepeatingChar(String str) {
		  HashMap<Character,Integer> map = new HashMap<Character,Integer>();
	        if(str.length() == 0){
	            return -1;
	        }
	      
	        for(int i = 0;i<str.length();i++){
	        	if(map.containsKey(str.charAt(i))){
	        		map.put(str.charAt(i),2);
	        	}else{
	        		map.put(str.charAt(i), 1);
	        	}
	        }
	        for(int i = 0;i<str.length();i++){
	        	if(map.get(str.charAt(i)) == 1){
	        		return i;
	        	}
	        }
	        return -1;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "NXWtnzyoHoBhUJaPauJaAitLWNMlkKwDYbbigdMMaYfkVPhGZcrEwp";
		System.out.println(new Main().FirstNotRepeatingChar(str));
	}

}
