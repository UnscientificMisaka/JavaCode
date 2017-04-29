package FindNumbersWithSum;
//输入一个递增排序的数组和一个数字S，在数组中查找两个数，
//使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。

//输出描述:
//对应每个测试案例，输出两个数，小的先输出。
import java.util.ArrayList;

public class Main {
	
	public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(array.length<2){
			return res;
		}
		int small = 0;
		int big = array.length - 1;
		while(big > small){
			if(array[small] + array[big] > sum){
				big--;
			}else if(array[small] + array[big] < sum){
				small++;
			}else{
					res.add(array[small]);
					res.add(array[big]);
					break;
			}
		}
		return res;
	}
	
	public static void main(String[] args){
		int[] array = {1,2,3,4,5,6,7};
		ArrayList<Integer> res = new Main().FindNumbersWithSum(array, 9);
		for(int i = 0;i<res.size();i++){
			System.out.println(res.get(i));
		}
	}
}
