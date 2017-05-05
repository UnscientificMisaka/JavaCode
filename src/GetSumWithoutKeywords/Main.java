package GetSumWithoutKeywords;

public class Main {
	public int sum(int n){
		int res = n;
		boolean ans = (n > 0) && ((res += sum(res - 1)) > 0);
		return res;
	}
	
	public static void main(String[] args){
		System.out.print(new Main().sum(10));
	}
}
