package SumOfChildArray;

public class Main {
//	HZż������Щרҵ������������Щ�Ǽ����רҵ��ͬѧ��
//	��������鿪����,���ַ�����:�ڹ��ϵ�һάģʽʶ����,
//	������Ҫ��������������������,������ȫΪ������ʱ��,
//	����ܺý��������,��������а�������,�Ƿ�Ӧ�ð���ĳ������,
//	�������Աߵ��������ֲ����أ�����:{6,-3,-2,7,-15,1,2,2},
//	����������������Ϊ8(�ӵ�0����ʼ,����3��Ϊֹ)��
//	��᲻�ᱻ������ס��(�������ĳ���������1)
	public int FindGreatestSumOfSubArray(int[] array) {
		int res = 0;
		int max = array[0];
		for(int i = 0;i<array.length;i++){
			for(int j = i;j<array.length;j++){
				if(i == j){
					res = array[i];
					if(res>max){
						max = res;
					}
				}else{
					res = res+array[j];
					if(res>max){
						max = res;
					}
				}
			}
		}
		return max;
    }
	
	
	public static void main(String[] args){
		int[] arr = {6,-3,-2,7,-15,1,2,2};
		Main m = new Main();
		System.out.println(m.FindGreatestSumOfSubArray(arr));
	}
}
