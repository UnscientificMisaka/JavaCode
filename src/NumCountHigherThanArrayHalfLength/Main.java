package NumCountHigherThanArrayHalfLength;
//��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡���������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}��
//��������2�������г�����5�Σ��������鳤�ȵ�һ�룬������2����������������0��

public class Main {
	public int MoreThanHalfNum_Solution(int[] arr){
		if(arr.length<=0){
			return 0;
		}
		int count = 1;
		int tmp = arr[0];
		for(int i = 1;i<arr.length;i++){
			if(count == 0){
				tmp = arr[i];
				count = 1;
			}else {
				if(arr[i] == tmp){
					count++;
				}else{
					count--;
				}
			}
		}
		
		count = 0;
		for(int j = 0;j<arr.length;j++){
			if(tmp == arr[j]){
				count++;
			}
		}
		if(count * 2 > arr.length){
			return tmp;
		}
		return 0;	
	}
	
	
	public static void main(String[] args){
		Main m = new Main();
		int arr[] = {2,2,2,2,2,4,5,4,6};
		System.out.println(m.MoreThanHalfNum_Solution(arr));

	}
}
