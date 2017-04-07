package LiBaiDrink;



public class test {
	
	public void getResult(int[] arr,int start,int end){
		if(start == arr.length-1){
			for(int i = 0;i<arr.length;i++){
				System.out.print(arr[i]);
			}
			System.out.println("");
		}else{
			for(int i = start;i<arr.length;i++){
				if(isSwap(arr,start,i)){
					swap(arr,start,i);
					getResult(arr,start+1,arr.length);
					swap(arr,start,i);
				}
				
			}
		}
	}
	
	public boolean isSwap(int[] arr,int start,int end){
		for(int i = 0;i<end;i++){
			if(arr[i] == arr[end]){
				return false;
			}
		}
		return true;
	}
	
	public void swap(int[] arr,int start,int end){
		int tmp;
		tmp = arr[start];
		arr[start] = arr[end];
		arr[end] = tmp;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,4};
		test t = new test();
		t.getResult(arr,0,arr.length);

	}

	
}
