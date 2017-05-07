package StringToInt;
//将一个字符串转换成一个整数，
//要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0 

public class Main {
	
	public int StrToInt(String str){
		if(str == null || "".equals(str)){
			return 0;
		}
		char[] arr = str.toCharArray();
		boolean flag = false;
		if(arr[0] == '-'){
			flag = true;
			
		}
		int res = 0;
		for(int i = 0;i<arr.length;i++){
			if(i == 0 && (arr[i] == '+' || arr[i] == '-') ){
				continue;
			}
			if(arr[i] < '0' || arr[i] >'9'){
				return 0;
			}
			res = res * 10 + (arr[i] - '0');
		}
		return flag ? -res : res;
	}
	
	public static void main(String[] args){
		System.out.println(new Main().StrToInt("-1234"));
		
	}
}
