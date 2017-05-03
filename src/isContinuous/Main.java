package isContinuous;

import java.util.Arrays;

//��Ŀ����
//LL���������ر��,��Ϊ��ȥ����һ���˿���,���������Ȼ��2������,2��С��(һ����ԭ����54��^_^)...
//��������г����5����,�����Լ�������,�����ܲ��ܳ鵽˳��,����鵽�Ļ�,������ȥ��������Ʊ,�ٺ٣���
//������A,����3,С��,����,��Ƭ5��,��Oh My God!������˳��.....LL��������,��������,������\С �����Կ����κ�����,
//����A����1,JΪ11,QΪ12,KΪ13�������5���ƾͿ��Ա�ɡ�1,2,3,4,5��(��С���ֱ���2��4),
//��So Lucky!����
//LL����ȥ��������Ʊ���� ����,Ҫ����ʹ�������ģ������Ĺ���,
//Ȼ���������LL��������Ρ�Ϊ�˷������,�������Ϊ��С����0��

public class Main {
	
	public boolean isContinuous(int[] numbers){
		if(numbers.length != 5){
			return false;
		}
		Arrays.sort(numbers);
		int count = 0;
		int tmpCount = 0;
		for(int i = 0;i<numbers.length-1;i++){
			if(numbers[i] == 0){
				count++;
				continue;
			}
			if(numbers[i] == numbers[i+1]){
				return false;
			}
			if(numbers[i+1] - 1 != numbers[i]){
				tmpCount = tmpCount + numbers[i+1] - numbers[i] -1; 
			}
		}
		if(tmpCount <= count){
			return true;
		}	
		return false;
	}
	
	public static void main(String[] args){
		int[] numbers = {1,0,0,6,5};
		System.out.println(new Main().isContinuous(numbers));
	}
}
