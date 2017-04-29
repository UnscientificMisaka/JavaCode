package FindNumbersWithSum;
//����һ����������������һ������S���������в�����������
//ʹ�����ǵĺ�������S������ж�����ֵĺ͵���S������������ĳ˻���С�ġ�

//�������:
//��Ӧÿ�����԰����������������С���������
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
