package DoublePower;

//����һ��double���͵ĸ�����base��int���͵�����exponent����base��exponent�η���

public class test {
	public double Power(double base, int exponent) {
		double result = 1;
        for(int i = 0;i<Math.abs(exponent);i++){
        	result = result * base;
        }
        
        if(exponent<0){
        	result = 1/Math.abs(result);
        }
        return result;
	}
	
	public static void main(String[] args){
		double base = 2;
		int exponent = -3;
		test t = new test();
		System.out.println(t.Power(base, exponent));
	}
	
}
