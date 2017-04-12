package ClockwisePrintMatrix;

import java.util.ArrayList;

//����һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ�����֣����磬����������¾��� 
//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
//�����δ�ӡ������
//1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
public class Main {

	public ArrayList<Integer> printMatrix(int[][] matrix){
		int row = matrix.length;//��
		int column = matrix[0].length;//��
		int layers = (Math.min(row,column)-1)/2+1;
		
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(column == 1){
			for(int i = 0;i<row;i++){
				res.add(matrix[i][0]);
			}
			return res;
		}
		
		if(row == 1){
			for(int i = 0;i<column;i++){
				res.add(matrix[0][i]);
			}
			return res;
		}
		
		for(int i = 0;i<layers;i++){
			for(int j = i;j<column;j++){
				res.add(matrix[i][j]);
			}
			for(int m = i+1;m<row;m++){
				res.add(matrix[m][column-1]);
			}
			for(int n = column-2;n>=i&&(row-i != 1);n--){
				res.add(matrix[row-1][n]);
			}
			for(int k = row-2;k>i;k--){
				res.add(matrix[k][i]);
			}
			column--;
			row--;
		}
		
		return res;
	}
	
	public static void main(String[] args){
//		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
//		int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
//		int[][] arr = {{1}};
//		int[][] arr = {{1},{2},{3},{4},{5}};
//		int[][] arr = {{1,2,3,4,5}};
		int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
		
		Main m = new Main();
		ArrayList<Integer> res = new ArrayList<Integer>();
		res = m.printMatrix(arr);
		for(int i = 0;i<res.size();i++){
			System.out.print(res.get(i)+"  ");
		}
	}
}
