package CountNumInOrderArray;

//ͳ��һ�����������������г��ֵĴ�����
public class Main {
	//����
	public int GetNumberOfK(int [] array , int k) {

        int count = 0;
 		for(int i = 0;i<array.length;i++){
            if(array[i] == k){
                count++;
            }
        }
        return count;
    }
	
	//���ֲ��� ѭ��
	public int GetNumberOfK2(int [] array , int k) {
		int first = getFirst(array,k,0,array.length-1);
		int last = getLast(array,k,0,array.length-1);
		if(first != -1 && last != -1){
			return last - first + 1;
		}
		return 0;		
	}
	
	public int getFirst(int[] array,int k,int start,int end){
		if(start > end){
			return -1;
		}
		int mid = (start + end) >> 1;
		if(array[mid] > k){
			return getFirst(array,k,start,mid-1);
		}else if(array[mid] < k){
			return getFirst(array,k,mid+1,end);
		}else if(mid -1 >=0 && array[mid-1] == k){//�ҵ������ǵ�һ��
			return getFirst(array,k,start,mid-1);
		}else{
			return mid;
		}
	}
	
	public int getLast(int[] array,int k,int start,int end){
		if(start > end){
			return -1;
		}
		int mid = (start + end) >> 1;
		if(array[mid] > k){
			return getLast(array,k,start,mid-1);
		}else if(array[mid] < k){
			return getLast(array,k,mid+1,end);
		}else if(mid + 1 <= end && array[mid+1] == k){//�ҵ����������һ��
			return getLast(array,k,mid+1,end);
		}else{
			return mid;
		}
	}
	
	//���ֲ��� �ݹ�
	public int getFirst2(int[] array,int k,int start,int end){
		if(start > end){
			return -1;
		}
		int mid = (start + end) >> 1;
		if(array[mid] > k){
			return getFirst2(array,k,start,mid-1);
		}else if(array[mid] < k){
			return getFirst2(array,k,mid+1,end);
		}else if(mid -1 >=0 && array[mid-1] == k){
			return getFirst2(array,k,start,mid-1);
		}else{
			return mid;
		}
	}
	
	public static void main(String[] args){
		Main m = new Main();
		int[] array = {1,2,3,3,3,4,4,5};
		System.out.println(m.GetNumberOfK2(array, 3));
	}
	
}
