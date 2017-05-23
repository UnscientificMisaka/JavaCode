package BaiduYearConfGame;

import java.util.ArrayList;
import java.util.Scanner;

//百度年会盛况空前，每个部门的年会活动也是非常有趣。某部门的年会中进行了一个有趣的游戏：一张方桌上有四边，每边可以坐一人，每人面前摆放一排长方形木块。我们一次给四边标号，分别为玩家 1、2、3、4（详见下图）。
//
//玩家 1 掷出两个骰子，其点数分别为 x, y(1 \le x, y \le 6)x,y(1≤x,y≤6)，则从玩家 1 开始按照逆时针（玩家 1、2、3、4）的顺序，数到 x+yx+y 时不妨记为玩家 c，那么从玩家 c 面前顺时针方向第 min(x, y) + 1min(x,y)+1 个木块开始，按照玩家 1、2、3、4 的顺序，每位玩家依次拿走连续的两个木块，循环三次，也就是说每位玩家最终应该有 66 个木块。
//
//注意：按照顺时针方向拿走木块，任何时候（包括拿第一个木块的时候），如果某一边的木块不够拿了，则继续拿顺时针方向下一个玩家的第一个木块。
//
//举个例子，玩家 1 掷骰子点数为 3,53,5，那么应该从玩家 4 顺时针第 44 块木块开始。依次用蓝色、绿色、红色、紫色分别代表玩家 1、2、3、4 拿到的木块，如下图所示：
//
//
//
//分别用 num_1, num_2, num_3, num_4
//num​1,num2,num3,num4
//​​  表示玩家 1/2/3/41/2/3/4 面前木块的数量。在这些木块中有两个 幸运木块，它们 在同一个玩家面前且相邻。如果 同时拿走这两个幸运木块，就可以拿走年会的终极大奖。
//
//现在轮到 玩家 1 掷骰子，他希望拿走终极大奖，你能帮他算出一共有多少种掷骰子的组合能使得 玩家 1 赢得终极大奖么？不考虑骰子之间的顺序，即 3,43,4 和 4,34,3 被认为是同一种骰子组合。
//
//输入格式
//
//第一行输入 num_1, num_2, num_3, num_4num
//num​1,num2,num3,num4
//​​  (1 \le num_i < 52, (1≤num
//​i
//​​ <52, \sum_{i=1}^4num_i=54)∑
//​i=1
//​4
//​​ num
//​i
//​​ =54)，依次表示 1/2/3/41/2/3/4 玩家面前摆放的木块数。第二行输入两个整数 k(1 \le k \le 4),k(1≤k≤4), d(1 \le d < num_k)d(1≤d<num
//​k
//​​ )，表示玩家 kk 面前顺时针数第 dd 和 d+1d+1 位置上的木块是幸运木块（从 11 开始计数）。
//
//输出格式
//
//输出一行，表示 玩家 1 能够赢得终极大奖的骰子组合的数目。
//
//样例说明
//
//对于样例，用红色标识出了幸运木块的位置。对应的玩家 1 掷骰子的方案有三种，分别是 (1, 1)(1,1)，(1, 5)(1,5)，(3, 6)(3,6)。
public class Main {
	
	public void handle(int[] arr,int goal_people,int goal_pos){
		if(arr.length != 4){
			return;
		}
		int length = arr[0]+arr[1]+arr[2]+arr[3];
		boolean[] bar = new boolean[length];
		int z = 0;
		int goal = 1;
		while(z<goal_people){
			goal += arr[z];
			z++;
		}
		goal += goal_pos;
        ArrayList<ArrayList<Integer>> foo = new ArrayList<ArrayList<Integer>>(); 
        for(int x = 1;x<=6;x++){
        	for(int y = 1;y<=x;y++){
        		ArrayList<Integer> tmp = new ArrayList<Integer>();
        		int start_people = (x + y) % 4;
        		int i = 0;
        		int start_pos = 1;
        		while(i<=start_people){
        			start_pos += arr[i];
        		}
        		start_pos = start_pos - y;
        		if(this.judge(bar,start_pos,goal)){
        			foo.add(tmp);
        		}
        		
        	}
        }

        for(int i = 0;i<foo.size();i++){
        	for(int s =0;s< foo.get(i).size();s++){
        		System.out.print(foo.get(i).get(s));
        	}
        	System.out.println(""); 	
        }
        System.out.println(foo.size());// result is foo.size()
       
    }
	
	public boolean judge(boolean[] bar,int start_pos, int goal){
		int i = start_pos;
		int count = 0;
		while(count<3){
			bar[start_pos] = true;
			bar[start_pos-1] = true;
			count++;
			i = i - 8;
			if(i < 0){
				i = bar.length-1;
			}
		}
		if(bar[goal] == true && bar[goal+1] == true){
			return true;
		}
		return false;
	}
    
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	String first= scan.nextLine();
    	String[] arr = first.split(" ");
    	int[] foo = new int[4];
    	
		for(int i = 0;i<arr.length;i++){
			foo[i] = Integer.parseInt(arr[i]);
    	}
		
		String second = scan.nextLine();
		String[] arr2 = second.split(" ");
		
		int goal_people = Integer.parseInt(arr2[0]);
		int goal_pos = Integer.parseInt(arr2[1]);
		
//		System.out.println(first);
//    	System.out.println(goal_people+":"+goal_pos);
    	
		new Main().handle(foo, goal_people, goal_pos);
    }
	
}
