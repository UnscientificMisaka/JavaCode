package test;

import java.util.Scanner;

public class test {
	

	
//	
////	С��ͬѧ��1��n��n�����ְ���һ����˳�������һ������Q�С��������Զ���Qִ�������³���
////	while(!Q.empty())              //���в��գ�ִ��ѭ��
////
////	{
////
////	    int x=Q.front();            //ȡ����ǰ��ͷ��ֵx
////
////	    Q.pop();                 //������ǰ��ͷ
////
////	    Q.push(x);               //��x�����β
////
////	    x = Q.front();              //ȡ����ʱ���ͷ��ֵ
////
////	    printf("%d\n",x);          //���x
////
////	    Q.pop();                 //������ʱ��Ķ�ͷ
////
////	}
////
////	��ȡ����ͷ��ֵ������ʱ�򣬲���������ǰ��ͷ��
////	С��ͬѧ���֣���γ���ǡ�ð�˳�������1,2,3,...,n������С�������㹹���ԭʼ�Ķ��У�����������[ע��ԭ������������5�д�Ӧ��Ϊ3������������] 
////	��������:
////	��һ��һ������T��T �� 100����ʾ����������ÿ����������һ����n��1 �� n �� 100000�������������n֮�Ͳ�����200000��
////
////
////	�������:
////	����ÿ�����ݣ����һ�У���ʾԭʼ�Ķ��С�����֮����һ���ո��������Ҫ����ĩ�������Ŀո�.
////
////	��������:
////	4
////	1
////	2
////	3
////	10
////
////	�������:
////	1
////	2 1
////	2 1 3
////	8 1 6 2 10 3 7 4 9 5
//	
//	
    public static void main(String[] args){  
    	Scanner scan = new Scanner(System.in);
    	String str1 = scan.nextLine();
    	String str2 = scan.nextLine();
    	char[] res1 = str1.toCharArray();
    	char[] res2 = str2.toCharArray();
//    	for(int i = 0;i<res1.length;i++){
//    		System.out.println(i+":"+res1[i]);
//    	}
//    	for(int i = 0;i<res2.length;i++){
//    		System.out.println(res2[i]);
//    	}
//    	char a;
//    	System.out.println(Character.isSpace(res1[0]));
    	int m = 0;
    	int n = 0;
    	int count = 0;
    	if(m>n){
    		while(m<res1.length&&n<res2.length){
    			while(Character.isSpace(res2[n])){
    				n++;
    			}
    			while(Character.isSpace(res1[m])){
    				m++;
    			}
    			
        		if(res1[m]==res2[n]&&!Character.isSpace(res1[m])){
        			count++;
        			m++;
        			n++;
        		}else{
        			if(Character.isSpace(res1[m])){	
    					m++;
    					n--;
    				}
        			n++;
        		}

    			
        	}
    	}else if(m<=n){
    		while(m<res1.length&&n<res2.length){
    			while(Character.isSpace(res2[n])){
    				n++;
    			}
    			while(Character.isSpace(res1[m])){
    				m++;
    			}
    	

    			if(res1[m]==res2[n]&&!Character.isSpace(res1[m])){
        			count++;			
        			m++;
        			n++;
        		}else{
        			if(Character.isSpace(res2[n])&&Character.isSpace(res2[n])){	
        				count = 0;
    				}
        			m++;
        		}
        	}
    		
    	}
    	
    	System.out.println(count);
    
    	
    	
    }  
	

}


