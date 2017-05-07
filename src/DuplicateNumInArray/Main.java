package DuplicateNumInArray;

import java.util.HashSet;

//��һ������Ϊn����������������ֶ���0��n-1�ķ�Χ�ڡ� ������ĳЩ�������ظ��ģ�
//����֪���м����������ظ��ġ�Ҳ��֪��ÿ�������ظ����Ρ����ҳ�����������һ���ظ������֡�
//���磬������볤��Ϊ7������{2,3,1,0,2,5,3}����ô��Ӧ��������ظ�������2����3��

//Parameters:
//    numbers:     an array of integers
//    length:      the length of array numbers
//    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
//                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
//    ����Ҫ�ر�ע��~���������ظ���һ������ֵduplication[0]
// Return value:       true if the input is valid, and there are some duplications in the array number
//                     otherwise false

public class Main {
	public boolean duplicate(int numbers[],int length,int [] duplication) {
	    HashSet<Integer> res = new HashSet<Integer>();
	    int tmp = 0;
	    for(int i = 0;i<length;i++){
	    	if(res.contains(numbers[i])){
	    		duplication[0] = numbers[i];
	    		return true;
	    	}else{
		    	res.add(numbers[i]);
	    	}
	    }
	    return false;
    }
	
	public boolean duplicate2(int numbers[],int length,int [] duplication) {
		int[] assit = new int[length];
		for(int i = 0;i<numbers.length;i++){
			if(assit[numbers[i]] == 0){
				assit[numbers[i]]++;
			}else{
				duplication[0] = numbers[i];
				return true;
			}
		}
		return false;
	}
	
	
	
	public static void main(String[] args){
		int[] numbers = {2,4,2,1,4};
		int[] duplication = new int[1];
		System.out.println(new Main().duplicate(numbers, numbers.length, duplication));
	}
}