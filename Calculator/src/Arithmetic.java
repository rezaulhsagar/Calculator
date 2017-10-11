
public class Arithmetic {
	public static int add(int a, int b){
		return a + b;
	}
	public static int subtract(int a, int b){
		return a - b;
	}
	public static int multiply(int a, int b){
		return a * b;
	}
	public static int divide(int a, int b){
		return a / b;
	}
	public static int power(int a, int p){
		int ret = a;
		for(int i=0;i<p;i++){
			ret *= a;
		}
		return ret;
	}
	public static int abs(int a){
		if(a < 0) return a+a;
		else return a;
	}
}
