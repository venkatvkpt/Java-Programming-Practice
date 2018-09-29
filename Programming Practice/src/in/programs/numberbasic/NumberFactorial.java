package in.programs.numberbasic;

public class NumberFactorial {

	public static void main(String[] args) {
		int input = 11;
		System.out.println("Factorial of "+input+" is "+factorial(input) );
		

	}
	private static int factorial(int input) {
		int tempVariable = 1;
		for(int i =1; i<= input; i++) {
			tempVariable *= i;
		}
		
		return tempVariable;
	}

}
