package ReverseSentence;
//ţ���������һ����Ա��Fish��ÿ���糿���ǻ�����һ��Ӣ����־��дЩ�����ڱ����ϡ�
//ͬ��Cat��Fishд�������ĸ���Ȥ����һ������Fish������������ȴ������������˼��
//���磬��student. a am I������������ʶ������һ�ԭ���Ѿ��ӵ��ʵ�˳��ת�ˣ�
//��ȷ�ľ���Ӧ���ǡ�I am a student.����Cat��һһ�ķ�ת��Щ����˳��ɲ����У����ܰ�����ô��
import java.util.Stack;

public class Main {
	public String ReverseSentence(String str){
		Stack<String> res = new Stack<String>();
		String a = "";
		String tmp = "";
		String[] arr = str.split("");
		for(int i = 0;i<arr.length;){
			if(" ".equals(arr[i])){
				res.push(" "+tmp);
				tmp = "";
			}else if(i == arr.length-1){
				tmp += arr[i];
				res.push(tmp);
			}else{
				tmp += arr[i];
			}
			i++;
		}
		while(!res.isEmpty()){
			String s = res.pop();
			a = a + s;
		}
		return a;
	}
	
	public String ReverseSentence2(String str){
		StringBuffer sb = new StringBuffer("");
		String[] arr = str.split(" ");
		for(int i = arr.length-1;i>0;i--){
			sb.append(arr[i] + " ");
		}
		sb.append(arr[0]);
		return sb.toString();
	}
	
	public static void main(String[] args){
		String str = "student a am i";
		System.out.println(new Main().ReverseSentence2(str));
	}
}
