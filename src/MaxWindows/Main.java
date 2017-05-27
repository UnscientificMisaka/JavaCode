package MaxWindows;

import java.util.ArrayDeque;
import java.util.ArrayList;

//给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
//例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，
//他们的最大值分别为{4,4,6,6,6,5}； 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
//{[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}，
//{2,3,4,2,[6,2,5],1}，{2,3,4,2,6,[2,5,1]}。
public class Main {
	
	public ArrayList<Integer> maxInWindows(int[] num, int size){
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(size <= 0 || size >= num.length){
			return res;
		}
		int start = 0;
		int end = size - 1;
		int max;
		int i;
		while(end<num.length){
			max = num[start];
			i = start;
			while(i<=end){
				if(num[i] > max){
					max = num[i];
				}
				i++;
			}
			res.add(max);
			start++;
			end++;
			
		}
		return res;
	}
	
	public ArrayList<Integer> maxInWindows2(int[] num, int size){
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(size <= 0 || size >= num.length){
			return res;
		}
		int start;
		ArrayDeque<Integer> q = new ArrayDeque<>();
		for(int i = 0;i<num.length;i++){
			start = i - size + 1;
			if(q.isEmpty()){
				q.add(i);
			}else if(start > q.peekFirst()){//?ж??????κ???????????
				q.pollFirst();
			}
			
			while((!q.isEmpty()) && num[q.peekLast()] <= num[i])
				q.pollLast();
			q.add(i);
			if(start > 0){
				 res.add(num[q.peekFirst()]);
			}
		}
		return res;
	}
	
	public static void main(String[] args){
		int[] num = {2,3,4,2,6,2,5,1};
		ArrayList<Integer> res = new Main().maxInWindows(num, 3);
		for(int i = 0;i<res.size();i++){
			System.out.println(res.get(i));
		}
	}
}
