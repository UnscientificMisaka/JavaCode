package Maximus;
//��һ����Ϊn������A��������0��a��b<n��A[b]-A[a]�����ֵ��
//��������A�����Ĵ�Сn���뷵������ֵ��
//����������
//[10,5],2
//���أ�0
public class test {
	public int getDis(int[] A,int n){
		int max = 0;
		int min = A[0];
		int i = 0;
		int maxIndex = 0;
		int minIndex = 0;
		while(i<A.length){
			if(A[i]>max){
				max = A[i];
				maxIndex = i;
			}
			if(A[i]<min){
				min = A[i];
				minIndex = i;
			}
			i++;
		}
		System.out.println("��������±�"+maxIndex+":"+max+"��С�����±�"+minIndex+":"+min);
		if(maxIndex>minIndex){
			n = max - min;
		}else{
			n = 0;
		}
		return n;	
	}
	
	public static void main(String[] args){
		test t =  new test();
		int[] A = {2676,4662,8383,357,6595};
		System.out.println(t.getDis(A,5));
	}
}
