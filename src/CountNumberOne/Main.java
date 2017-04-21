package CountNumberOne;

public class Main {
	public int NumberOf1Between1AndN_Solution(int n) {
 		int val = 1;
 		int res = 0;
 		for(int i = 0;i<n;i++){
 			String str = String.valueOf(val);
 			char[] cha = str.toCharArray();
 			for(int j = 0;j<cha.length;j++){
 				if(cha[j] == '1'){
 					res++;
 				}
 			}
 			val++;
 		}
 		return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		System.out.println(m.NumberOf1Between1AndN_Solution(13));

	}

}
