package LastRemaining;


//ÿ����һ��ͯ��,ţ�Ͷ���׼��һЩС����ȥ�����¶�Ժ��С����,����������ˡ�
//HF��Ϊţ�͵�����Ԫ��,��ȻҲ׼����һЩС��Ϸ������,�и���Ϸ��������:
//����,��С������Χ��һ����Ȧ��Ȼ��,�����ָ��һ����m,�ñ��Ϊ0��С���ѿ�ʼ������
//ÿ�κ���m-1���Ǹ�С����Ҫ���г��׸�,Ȼ���������Ʒ�����������ѡ����,���Ҳ��ٻص�Ȧ��,
//��������һ��С���ѿ�ʼ,����0...m-1����....������ȥ....ֱ��ʣ�����һ��С����,���Բ��ñ���,
//�����õ�ţ������ġ�����̽���ϡ���ذ�(��������Ŷ!!^_^)��
//������������,�ĸ�С���ѻ�õ������Ʒ�أ�(ע��С���ѵı���Ǵ�0��n-1)

public class Main {
	public int LastRemaining(int n,int m){
		if(n < 1 || m < 1){
			return -1;
		}
		int[] arr = new int[n];
		int count = n;
		int i = -1;
		int step = 0;
		while(count > 0){
			i++;
			if(i > n-1){
				i = 0;
			}
			if(arr[i] == -1){
				continue;
			}
			step++;
			if(step == m){
				arr[i] = -1;
				step = 0;
				count--;
			}
		}
		return i;
	}
	
	public static void main(String[] args){
		System.out.println(new Main().LastRemaining(5,3));
	}
}
