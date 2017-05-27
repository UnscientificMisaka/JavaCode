package RobotMovingCount;
//������һ��m�к�n�еķ���һ�������˴�����0,0�ĸ��ӿ�ʼ�ƶ���
//ÿһ��ֻ�������ң��ϣ����ĸ������ƶ�һ�񣬵��ǲ��ܽ�������������������λ֮�ʹ���k�ĸ��ӡ�
//���磬��kΪ18ʱ���������ܹ����뷽��35,37������Ϊ3+5+3+7 = 18��
//���ǣ������ܽ��뷽��35,38������Ϊ3+5+3+8 = 19�����ʸû������ܹ��ﵽ���ٸ����ӣ�
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
