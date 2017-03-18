package Shuffle;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*ϴ����������ʮ�ֳ�����������Ҫдһ������ģ��ϴ�ƵĹ��̡�
������Ҫϴ2n���ƣ����ϵ��������ǵ�1�ţ���2�ţ���3��һֱ����2n�š�
���ȣ����ǰ���2n���Ʒֳ����ѣ��������ŵ�1�ŵ���n�ţ��ϰ�ѣ����������ŵ�n+1�ŵ���2n�ţ��°�ѣ���
���žͿ�ʼϴ�ƵĹ��̣��ȷ������ֵ����һ���ƣ��ٷ������ֵ����һ���ƣ����ŷ������ֵĵ����ڶ����ƣ��ٷ������ֵĵ����ڶ����ƣ�
ֱ�����������ֵĵ�һ���ơ����Ű��ƺϲ������Ϳ����ˡ� 
������6���ƣ��ʼ�Ƶ�������1,2,3,4,5,6�����ȷֳ����飬��������1,2,3����������4,5,6����ϴ�ƹ����а�˳�������6,3,5,2,4,1��
�����������ٴκϳ�һ����֮�����ǰ��մ������µ�˳�������ƣ��ͱ��������1,4,2,5,3,6�� 
���ڸ���һ��ԭʼ���飬������⸱��ϴ��k��֮��������µ����С�

��һ��һ����T(T �� 100)����ʾ��������������ÿ�����ݣ���һ��������n,k(1 �� n,k �� 100)��
������һ����2n����a1,a2,...,a2n(1 �� ai �� 1000000000)����ʾԭʼ������ϵ��µ����С�

����ÿ�����ݣ����һ�У����յ����С�����֮���ÿո��������Ҫ����ĩ�������Ŀո�

3
3 1
1 2 3 4 5 6
3 2
1 2 3 4 5 6
2 2
1 1 1 1

1 4 2 5 3 6
1 5 4 3 2 6
1 1 1 1
*/

public class test {
	
	public void handle(int n,int k,int[] data){
		if(k>0){
			int[] left = new int[n];
			int[] right = new int[n];
			int [] result = new int[2*n];
			for(int i = 0;i<data.length;i++){
				if(i<data.length/2){
					left[i] = data[i];
				}
				if(i>=data.length/2){
					right[i-data.length/2] = data[i];
				}
			}
			
			for(int i = 0;i<n;i++){
				result[2*i] = left[i];
				result[2*i+1] = right[i];
			}
			
			k--;
			handle(n,k,result);
			if(k==0){
				this.print(result);
			}
			
		}
		
		
	}
	
	public void print(int[] result){
		for(int i = 0;i<result.length;i++){
			if(i == result.length-1){
				System.out.print(result[i]);
			}else{
				System.out.print(result[i]+" ");
			}
		}
		System.out.println("");
	}
	
	public static void main(String[] args) throws IOException{
		test t = new test();
		
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int nArr[] = new int[T];
		int kArr[] = new int[T];
		List <int []> list = new ArrayList<int []>();
		while(T>0&&scan.hasNextInt()){
			for(int i = 0;i<T;i++){
				nArr[i] = scan.nextInt();
				kArr[i] = scan.nextInt();
				int data[] = new int[2*nArr[i]];
				for(int m = 0;m<2*nArr[i];m++){
					data[m] = scan.nextInt();
				}
				list.add(data);
			}
			for(int i = 0;i<T;i++){
				t.handle(nArr[i], kArr[i],list.get(i));
			}
				T--;
				
		}
		
		
		
	
		
		
	}
}
