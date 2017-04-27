package CountNumInOrderArray;

//统计一个数字在排序数组中出现的次数。
public class Main {
	//暴力
	public int GetNumberOfK(int [] array , int k) {

        int count = 0;
 		for(int i = 0;i<array.length;i++){
            if(array[i] == k){
                count++;
            }
        }
        return count;
    }
	
	//二分查找 循环
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
		}else if(mid -1 >=0 && array[mid-1] == k){//找到但不是第一个
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
		}else if(mid + 1 <= end && array[mid+1] == k){//找到但不是最后一个
			return getLast(array,k,mid+1,end);
		}else{
			return mid;
		}
	}
	
	//二分查找 递归
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
