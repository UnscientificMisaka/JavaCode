package BuildMultiplyArray;

//给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
//其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法

public class Main {
// 	  O(n^2)
    public int[] multiply(int[] A) {
        int[] B = new int[A.length];
        B[0] = 1;
        
        for(int i = 0;i<B.length;i++){
        	int res = 1;
        	for(int j = 0;j<A.length;j++){
        		if(i == j){
        			continue;
        		}
        		res = A[j] * res;
        	}
        	B[i] = res;
        }
        return B;
    }
//    O(n)
    public int[] multiply2(int[] A) {
    	int[] B = new int[A.length];
    	B[0] = 1;
    	for(int i = 1;i<A.length;i++){
    		B[i] = A[i-1] * B[i-1];
    	}
    	int tmp = 1;
    	for(int i = A.length-1;i>=0;i--){
    		B[i] = tmp * B[i]; 
    		tmp = tmp * A[i];	
    	}
    	return B;
    }
    
    public static void main(String[] args){
    	int[] A = {1,2,3,4,5};
    	int[] res = new Main().multiply2(A);
    	for(int i = 0;i<res.length;i++){
    		System.out.println(res[i]);
    	}
    }
}
