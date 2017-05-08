package RegExpMatch;

public class Main {
	
	public boolean match(char[] str, char[] patterns){
		if(str.length == 0){
			int i =0;
			while(i<patterns.length){
				if(patterns[i] != '*'){
					if(i+1<patterns.length){
						i++;
						if(patterns[i] == '*'){
							return true;
						}
					}
					return false;
				}else if(patterns[i] == '*'){
					i++;
				}
			}
		}
		int i = 0;
		int j = 0;
		while(i < str.length && j < patterns.length){
			if(patterns[j] == '.'){
				i++;
				j++;
				continue;
			}
			
			
			if(str[i] == patterns[j]){
				i++;
				j++;
			}else{
				j++;
				if(patterns[j] == '*'){
					j++;
				}else{
					return false;
				}
			}
		}
	
		if(i == str.length && j == patterns.length){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args){
		System.out.println(new Main().match("".toCharArray(), ".*".toCharArray()));
	}
}
