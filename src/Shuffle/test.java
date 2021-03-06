package Shuffle;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*洗牌在生活中十分常见，现在需要写一个程序模拟洗牌的过程。
现在需要洗2n张牌，从上到下依次是第1张，第2张，第3张一直到第2n张。
首先，我们把这2n张牌分成两堆，左手拿着第1张到第n张（上半堆），右手拿着第n+1张到第2n张（下半堆）。
接着就开始洗牌的过程，先放下右手的最后一张牌，再放下左手的最后一张牌，接着放下右手的倒数第二张牌，再放下左手的倒数第二张牌，
直到最后放下左手的第一张牌。接着把牌合并起来就可以了。 
例如有6张牌，最开始牌的序列是1,2,3,4,5,6。首先分成两组，左手拿着1,2,3；右手拿着4,5,6。在洗牌过程中按顺序放下了6,3,5,2,4,1。
把这六张牌再次合成一组牌之后，我们按照从上往下的顺序看这组牌，就变成了序列1,4,2,5,3,6。 
现在给出一个原始牌组，请输出这副牌洗牌k次之后从上往下的序列。

第一行一个数T(T ≤ 100)，表示数据组数。对于每组数据，第一行两个数n,k(1 ≤ n,k ≤ 100)，
接下来一行有2n个数a1,a2,...,a2n(1 ≤ ai ≤ 1000000000)。表示原始牌组从上到下的序列。

对于每组数据，输出一行，最终的序列。数字之间用空格隔开，不要在行末输出多余的空格。

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
