package FindNumsAppearOnce;

import java.util.HashSet;
import java.util.Iterator;

//һ�����������������������֮�⣬���������ֶ����������Ρ���д�����ҳ�������ֻ����һ�ε����֡�
//num1,num2�ֱ�Ϊ����Ϊ1�����顣��������
//��num1[0],num2[0]����Ϊ���ؽ��
public class Main {
	
	public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
		HashSet<Integer> res = new HashSet<Integer>();
		if(array == null || array.length < 2){
			return;
		}

		for(int i = 0;i<array.length;i++){
			if(res.contains(array[i])){
				res.remove(array[i]);
			}else{
				res.add(array[i]);
			}
		}
		
		for(Iterator it = res.iterator();it.hasNext();){
			num1[0] = (int) it.next();
			num2[0] = (int) it.next();
		}
    }
	
	public static void main(String[] args){
		int[] array = {1,2,3,4,5,5,4,3};
		int[] num1 = new int[1];
		int[] num2 = new int[1];
		new Main().FindNumsAppearOnce(array, num1, num2);
	}
}
