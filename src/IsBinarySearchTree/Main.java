package IsBinarySearchTree;

import java.util.Arrays;

//����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ����
//����������Yes,�������No���������������������������ֶ�������ͬ

public class Main {
	
	public boolean VerifySquenceOfBST(int[] sequence){
		if(sequence.length == 0 || sequence == null){
			return false;
		}
		int root = sequence[sequence.length-1];
		int[] arr = Arrays.copyOf(sequence,sequence.length-1);
		int min = arr.length;
		for(int i = 0;i<arr.length;i++){
			if(arr[i]>root){
				min = i;			
				break;
			}
		}
		
		for(int i = min;i<arr.length;i++){
			if(arr[i]<root){
				return false;
			}
		}
		for(int i = 0;i<min;i++){
			if(arr[i]>root){
				return false;
			}
		}
		boolean leftChild = true;
		boolean rightChild = true;
		if(min > 0){
			int[] left = Arrays.copyOf(arr, min);
			leftChild = VerifySquenceOfBST(left);
		}
		if(min < arr.length - 1){
			int[] right = Arrays.copyOfRange(arr, min,arr.length-min+1);
			rightChild = VerifySquenceOfBST(right);
		}
		return leftChild&&rightChild;
	}
	
	public static void main(String[] args){
		Main m = new Main();
//		int[] sequence = {4,8,6,12,16,14,10};
		int[] sequence = {1};
		System.out.println(m.VerifySquenceOfBST(sequence));
	}
}
