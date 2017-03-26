package Set;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;


public class test {
	public static void main(String[] args) throws IOException{
		HashSet s = new HashSet();
		
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		
		double res;
		int count = 0;
		for(int i = 1;i<=x-w+1;i++){
			for(int m = 1;m<=z-y+1;m++){
				res = (double)i/(double)m;
				System.out.println("i: "+i+"  m: "+m+"  i/m:  "+res);
				s.add(res);
				
			}
		}
		System.out.println(s.size());
		
	}
}
