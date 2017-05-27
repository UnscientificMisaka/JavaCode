package HasPathInMatrix;

//�����һ�������������ж���һ���������Ƿ����һ������ĳ�ַ��������ַ���·����·�����ԴӾ����е�����һ�����ӿ�ʼ��ÿһ�������ھ������������ң����ϣ������ƶ�һ�����ӡ����һ��·�������˾����е�ĳһ�����ӣ����·�������ٽ���ø��ӡ� ���� a b c e s f c s a d e e 
//�����а���һ���ַ���"bccced"��·�������Ǿ����в�����"abcb"·����
//��Ϊ�ַ����ĵ�һ���ַ�bռ���˾����еĵ�һ�еڶ�������֮��·�������ٴν���ø��ӡ�
public class Main {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str){
        if(matrix == null || rows < 1 || cols < 1 || str == null) {
            return false;
        }
        boolean[] flag = new boolean[matrix.length];
        for(int i = 0; i < rows; i++){
        	for(int j = 0;j < cols; j++){
        		if(test(matrix, rows, cols, i, j, str, 0, flag)) return true;
        	}
        }
        return false;
    }

    public boolean test(char[] matrix, int rows, int cols,int i, int j, char[] str, int count, boolean[] flag){
    	int index = i * cols + j;
    	if(i < 0 || i >=rows || j < 0 || j >= cols || matrix[index] != str[count] || flag[index] == true){
    		return false;
    	}
    	if(count == str.length - 1) return true;
    	flag[index] = true;
    	if(test(matrix, rows, cols, i-1, j, str, count+1, flag) 
    			|| test(matrix, rows, cols, i+1, j, str, count+1, flag)
    			|| test(matrix, rows, cols, i, j-1, str, count+1, flag) 
    			|| test(matrix, rows, cols, i, j+1, str, count+1, flag) ){
    		return true;
    	}
    	flag[index] = false;
    	return false;
    }
    
    public static void main(String[] args){
        char[] matrix = {'a','b','c','e','s','f','c','s','a','d','e','e'};
        char[] str = {'a','b','c','b'};
        System.out.print(new Main().hasPath(matrix, 3, 4, str));
    }
}


