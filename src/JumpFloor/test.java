package JumpFloor;

public class test {
	
	public int getMethods(int n){
		int result = 0;
		if(n <= 0){
			return 0;
		}
		if(n == 1){
			return 1;
		}
		if(n == 2){
			return 2;
		}
		for(int i = 0;i<n;i++){
			result = result + getMethods(i);
		}
		return result;
	}
	
	public static void main(String[] args){
		test t = new test();
		System.out.println(t.getMethods(4));
	}
}
