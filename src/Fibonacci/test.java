package Fibonacci;

public class test {
	
//	public int Fibonacci(int n){
//		if(n <= 0){
//			return 0;
//		}
//		if(n == 1){
//			return 1;
//		}
//		else{
//			return  Fibonacci(n-2) + Fibonacci(n-1);
//		}
//	}
	
	public int Fibonacci(int n){
		int result[] = {0,1};
		if(n<2){
			return result[n];
		}
		int prev = 1;
		int prevPrev = 0;
		int now = 0;
		for(int i = 2;i<=n;i++ ){
			now = prev + prevPrev;
			prevPrev = prev;
			prev = now;
		}
		return now;
	}
	
	public static void main(String[] args){
		test t = new test();
		System.out.println(t.Fibonacci(4));
	}
}
