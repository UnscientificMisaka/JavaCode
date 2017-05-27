package RobotMovingCount;
//地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，
//每一次只能向左，右，上，下四个方向移动一格，但是不能进入行坐标和列坐标的数位之和大于k的格子。
//例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。
//但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
public class Main {
	public int movingCount(int threshold,int rows, int cols){
		int flag[][] = new int[rows][cols];
		return canMove(0, 0, rows, cols, flag, threshold);
	}
	
	public int canMove(int i, int j, int rows, int cols, int[][] flag, int threshold){
		if(i >= rows || i < 0 || j < 0 || j >= cols || getSum(i)+getSum(j) > threshold || flag[i][j] == 1){
			return 0;
		}
		flag[i][j] = 1;
		return canMove(i-1, j, rows, cols, flag, threshold)
				+ canMove(i+1, j, rows, cols, flag, threshold)
				+ canMove(i, j+1, rows, cols, flag, threshold)
				+ canMove(i, j-1, rows, cols, flag, threshold)
				+ 1;
		
	}
	
	public int getSum(int i){
		int sum = 0;
		while(i > 0){
			sum = sum + i % 10;
			i = i / 10;
		}
		return sum;
	}
	
	public static void main(String[] args){
		System.out.println(new Main().movingCount(18,40,40));
	}
}
