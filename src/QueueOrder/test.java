package QueueOrder;

import java.util.ArrayDeque;
import java.util.Scanner;
//С��ͬѧ��1��n��n�����ְ���һ����˳�������һ������Q�С��������Զ���Qִ�������³���
//while(!Q.empty())              //���в��գ�ִ��ѭ��
//
//{
//
//    int x=Q.front();            //ȡ����ǰ��ͷ��ֵx
//
//    Q.pop();                 //������ǰ��ͷ
//
//    Q.push(x);               //��x�����β
//
//    x = Q.front();              //ȡ����ʱ���ͷ��ֵ
//
//    printf("%d\n",x);          //���x
//
//    Q.pop();                 //������ʱ��Ķ�ͷ
//
//}
//
//��ȡ����ͷ��ֵ������ʱ�򣬲���������ǰ��ͷ��
//С��ͬѧ���֣���γ���ǡ�ð�˳�������1,2,3,...,n������С�������㹹���ԭʼ�Ķ��У�����������[ע��ԭ������������5�д�Ӧ��Ϊ3������������] 
//��������:
//��һ��һ������T��T �� 100����ʾ����������ÿ����������һ����n��1 �� n �� 100000�������������n֮�Ͳ�����200000��
//
//
//�������:
//����ÿ�����ݣ����һ�У���ʾԭʼ�Ķ��С�����֮����һ���ո��������Ҫ����ĩ�������Ŀո�.
//
//��������:
//4
//1
//2
//3
//10
//
//�������:
//1
//2 1
//2 1 3
//8 1 6 2 10 3 7 4 9 5
public class test {
		
	public void print(int a){
		ArrayDeque<Integer> queue = new ArrayDeque<Integer>(a);
		for(int i = a;i>0;i--){
			queue.addFirst(i);
			int x = queue.getLast();
			queue.addFirst(x);
			queue.removeLast();
		}
		while(!queue.isEmpty()){
			if(queue.size() == 1){
				System.out.print(queue.poll());
			}else{
				System.out.print(queue.poll()+" ");
			}
		}
		System.out.println("");
		
	}
	

    public static void main(String[] args){
    	test t = new test();
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	int i = 0;
    	int[] arr = new int[n];
    	while(i<n){
    		arr[i] = scan.nextInt();
    		i++;
    	}
    	for(int m = 0;m<arr.length;m++){
    		t.print(arr[m]);
    	}
    	
    	
    }  
	

}


