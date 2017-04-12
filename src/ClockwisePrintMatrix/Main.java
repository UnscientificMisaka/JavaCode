package ClockwisePrintMatrix;

import java.util.ArrayList;

//输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下矩阵： 
//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
//则依次打印出数字
//1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
public class Main {

	public ArrayList<Integer> printMatrix(int[][] matrix){
		int row = matrix.length;//行
		int column = matrix[0].length;//列
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
