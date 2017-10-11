
public class Main {
	public static void main(String[] args){
		int a = 5, b = 2;
		//Arithmetic addition
		System.out.println("Addition: " + Arithmetic.add(a, b));
		//Arithmetic subtraction
		System.out.println("Subtraction: " + Arithmetic.subtract(a, b));
		//Arithmetic multiplication
		System.out.println("Multiplication: " + Arithmetic.multiply(a, b));
		//Arithmetic division
		System.out.println("Division: " + Arithmetic.divide(a, b));
		//Arithmetic exponentiation
		System.out.println("Exponentiation: " + Arithmetic.power(a, b));
		
		double theta = Math.PI / 6.0;
		//Trigonometric sine function
		System.out.println("sin(theta): " + Trigonometry.sin(theta));
		//Trigonometric cosine function
		System.out.println("cos(theta): " + Trigonometry.cos(theta));
		//Trigonometric tangent function
		System.out.println("tan(theta): " + Trigonometry.tan(theta));
	}
}
