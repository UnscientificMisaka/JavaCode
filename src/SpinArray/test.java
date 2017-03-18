package SpinArray;

public class test {
	
	public int getMinFromSpinArray(int[] array){
		int min = 0;
		if(array == null){
			return 0;
		}
		for(int i = 1;i<array.length;i++){
			if(array[i]<array[i-1]){
				min = array[i];
			}
		}
		return min;
	}
	
	
	public static void main(String[] args){
		test t = new test();
		int[] array = {3,4,5,1,2};
		System.out.println(t.getMinFromSpinArray(array));
	}
}
