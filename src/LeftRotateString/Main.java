package LeftRotateString;

//��Ŀ����
//�����������һ����λָ�����ѭ�����ƣ�ROL���������и��򵥵�����
//�������ַ���ģ�����ָ���������������һ���������ַ�����S���������ѭ������Kλ������������
//���磬�ַ�����S=��abcXYZdef��,
//Ҫ�����ѭ������3λ��Ľ��������XYZdefabc�����ǲ��Ǻܼ򵥣�OK���㶨����
public class Main {
	
	public String LeftRotateString(String str,int n) {
		int len = str.length();
		if(len == 0) return "";
		n = n % len;
		str += str;
		return str.substring(n, len+n);
    }
	
	public static void main(String[] args){
		String str = "abcdefghijkl";
		System.out.println(new Main().LeftRotateString(str, 2));
	}
}
