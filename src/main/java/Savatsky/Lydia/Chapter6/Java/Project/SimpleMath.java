package Savatsky.Lydia.Chapter6.Java.Project;

public class SimpleMath {
	
	public double divide(double numerator, double denominator) {
		if(denominator == 0) {
			throw new ArithmeticException("Cannot divide by 0");
		}
		
		double result = numerator/denominator;
		return result;
	}
	
	public double multiply(double number1, double number2) {
		
		result1 = number1 * number2;
		return result1;
	}
}
