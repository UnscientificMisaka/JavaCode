package FindContinuousSequence;
//С����ϲ����ѧ,��һ����������ѧ��ҵʱ,Ҫ������9~16�ĺ�,�����Ͼ�д������ȷ����100��
//���������������ڴ�,�����뾿���ж������������������еĺ�Ϊ100(���ٰ���������)��
//û���,���͵õ���һ������������Ϊ100������:18,19,20,21,22��
//���ڰ����⽻����,���ܲ���Ҳ�ܿ���ҳ����к�ΪS��������������? Good Luck
import java.util.ArrayList;

public class Main {
	// ����
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
