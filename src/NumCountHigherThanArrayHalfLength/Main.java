package NumCountHigherThanArrayHalfLength;
//数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
//由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。

public class Main {
	public int MoreThanHalfNum_Solution(int[] arr){
		if(arr.length<=0){
			return 0;
		}
		int count = 1;
		int tmp = arr[0];
		for(int i = 1;i<arr.length;i++){
			if(count == 0){
				tmp = arr[i];
				count = 1;
			}else {
				if(arr[i] == tmp){
					count++;
				}else{
					count--;
				}
			}
		}
		
		count = 0;
		for(int j = 0;j<arr.length;j++){
			if(tmp == arr[j]){
				count++;
			}
		}
		if(count * 2 > arr.length){
			return tmp;
		}
		return 0;	
	}
	
	
	public static void main(String[] args){
		Main m = new Main();
		int arr[] = {2,2,2,2,2,4,5,4,6};
		System.out.println(m.MoreThanHalfNum_Solution(arr));

	}
}
