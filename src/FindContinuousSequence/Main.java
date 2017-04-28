package FindContinuousSequence;
//小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。
//但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
//没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
//现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck
import java.util.ArrayList;

public class Main {
	// 暴力
	public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
	   ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
	   if(sum < 3){
		   return res;
	   }
	   
	   int small = 1;
	   int big = 2;
	   int middle = (sum + 1) >> 1;
	   while(small < middle){
		   int count = 0;
		   for(int i = small;i<=big;i++){
			   count = count + i;
		   }
		   System.out.println(count+":"+small+":"+big);
		   if(count == sum){
			   ArrayList<Integer> tmp = new ArrayList<Integer>();
			   for(int i = small;i<=big;i++){
				   tmp.add(i);
			   }
			   res.add(tmp);
			   big++;
		   }else if(count < sum){
			   big++;
		   }else if(count > sum){
			   small++;
		   }
	   }
       return res;
    }
	
	public static void main(String[] args){
		Main m = new Main();
		ArrayList<ArrayList<Integer>> res = m.FindContinuousSequence(15);
		for(int z=0;z<res.size();z++){
			System.out.print(" res:"+res.get(z)+" ");
		}		
		
	}
}
