package UglyNumber;

public class Main {
	 
	public int GetUglyNumber_Solution(int index) {
		if(index <= 0){
			return 0;
		}
		if(index<7){
			return index;
		}
		int count = 6;
		int res = 0;
			for(int i = 7;;i++){
				if(i % 2 == 0 || i % 3 == 0 || i % 5 == 0){
					for(int j = 6;j < i;j++){
						System.out.println("j:"+j+"i:"+i);
						if(i % j == 0 && j % 2 !=0 ){
							break;
						}
						if(j == i-1){
							count++;
						}
					}
				}
				if(count == index){
					res = i;
					break;
				}
			}
	        return res;
	    }
	
	public int GetUglyNumber_Solution2(int index) {
		if(index <= 0){
			return 0;
		}
		if(index<7){
			return index;
		}
		int[] res = new int[index];
		res[0] = 1;
		int index2 = 0;
		int index3 = 0;
		int index5 = 0;
		for(int i = 1;i < index;i++){
			int tmp2 = res[index2] * 2;
			int tmp3 = res[index3] * 3;
			int tmp5 = res[index5] * 5;
			res[i] = Math.min(tmp2, Math.min(tmp3,tmp5));
			if(res[i] == tmp2){
				index2++;
			}
			if(res[i] == tmp3){
				index3++;
			}
			if(res[i] == tmp5){
				index5++;
			}
		}
		return res[index-1];
	}
	
	 public static void main(String[] args){
		Main m = new Main();
		System.out.println(m.GetUglyNumber_Solution2(11));
	 }
}
