package GetMedian;
//如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
//如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。

import java.util.ArrayList;
import java.util.List;

class Heap {
	public List<Integer> list = null;
	public static final boolean isMaxHeap = true;
	public static final boolean isMinHeap = false;
	private boolean flag = true;
	
	public Heap(){
		this.list = new ArrayList<Integer>();
	}
	
	public Heap(boolean flag){
		this.list = new ArrayList<Integer>();
		this.flag = flag;
	} 
	
	public int size(){
		return this.list.size();
	}
	
	public int peek(){
		if(list.size() == 0){
			return 0;
		}
		return list.get(0);
	}
	
	public void swap(int i,int j){
		int tmp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, tmp);
	}
	
//	从下向上调整
	public void add(int val){
		this.list.add(val);
		int i = list.size() - 1;//最后节点索引
		int index;// 父节点索引
		int parent;// 父节点值
		int cur;
		while(i > 0){
			index = (i-1) / 2;
			parent = list.get(index);
			cur = list.get(i);
			if(flag == true && parent < cur){
				swap(index, i);
			}else if(flag == false && parent > cur){
				swap(index, i);
			}
			i = index;
		}
	}
//	取堆顶，向下调整堆
	public int pop(){
		if(list.size() == 0){
			return -1;
		}
		
		int res = list.get(0);
		list.set(0, list.get(list.size()-1));
		list.remove(list.size() -1);
		int length = list.size() - 1;
		int i = 0;
		int left, right;
		while(i < length){
			left = (i << 1) + 1;
			right = (i << 1) + 2;
			int maxIndex = i;
			if(flag == true){
				if(left < length && list.get(left) > list.get(maxIndex)) maxIndex = left;
				if(right < length && list.get(right) > list.get(maxIndex)) maxIndex = right;
			}else{
				if(left < length && list.get(left) < list.get(maxIndex)) maxIndex = left;
				if(right < length && list.get(right) < list.get(maxIndex)) maxIndex = right;
			}
			
			if(maxIndex != i){
				swap(maxIndex, i);
				i = maxIndex;
			}else{
				break;
			}
			
		}
		return res;
	}
}

public class Main {
	Heap heapMax = new Heap();
	Heap heapMin = new Heap(false);
	int count = 0;
	public void Insert(Integer num){
	
		if(count % 2 == 1){
			heapMax.add(num);
			heapMin.add(heapMax.pop());
		}else{
			heapMin.add(num);
			heapMax.add(heapMin.pop());
		}
		count++;	
	}
	
	public Double GetMedia(){
		if((heapMax.size() + heapMin.size()) % 2 != 0){
			return (double) heapMin.peek();
		}else{
			return (double)(heapMin.peek() + heapMax.peek()) / 2;
		}
	}
	
	public static void main(String[] args){
		Main m = new Main();
		
		
		m.Insert(5);
		m.Insert(2);
		m.Insert(3);
		m.Insert(4);
		m.Insert(1);
		m.Insert(6);
		
//		m.Insert(3);
		
		System.out.println(m.GetMedia());
	}
	
}
