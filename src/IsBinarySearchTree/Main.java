package IsBinarySearchTree;

import java.util.Arrays;

//输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
//如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同

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
