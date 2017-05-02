package ReverseSentence;
//牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。
//同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。
//例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，
//正确的句子应该是“I am a student.”。Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
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
