package StringToInt;
//��һ���ַ���ת����һ��������
//Ҫ����ʹ���ַ���ת�������Ŀ⺯���� ��ֵΪ0�����ַ�������һ���Ϸ�����ֵ�򷵻�0 

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
