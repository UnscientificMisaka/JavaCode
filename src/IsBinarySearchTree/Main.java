package IsBinarySearchTree;

import java.util.Arrays;

//输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
//如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同

public class Main {
	
	public boolean VerifySquenceOfBST(int[] sequence){
		if(sequence.length == 0 || sequence == null){
			return false;
		}
		return judge(sequence,0,sequence.length - 1);
	}
	
	public boolean judge(int[] arr,int start,int end){
		if(end <= start){
			return true;
		}
		int i = start;
		for(;i < end;i++){
			if(arr[i]>arr[end]){
				break;
			}
		}
		for(int j = i;j < end;j++){
			if(arr[j]<arr[end]){
				return false;
			}
		}
		return judge(arr,start,i-1) && judge(arr,i,end-1);
	}
	
	public static void main(String[] args){
		Main m = new Main();
//		int[] sequence = {4,8,6,12,16};
		int[] sequence = {5,4,3,2,1};
//		int[] sequence = {1};
		System.out.println(m.VerifySquenceOfBST(sequence));
	}
}
