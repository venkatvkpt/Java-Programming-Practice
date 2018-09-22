package in.programs.numberbasic;

public class CheckNumberPalindrome {

	public static void main(String[] args) {
		System.out.println(checkPalindrome(7107));

	}
	
	public static String checkPalindrome(int inputNumber)
	{
		if (inputNumber == numberReversing(inputNumber))
			return inputNumber+" is a Palindrome";
		else 
			return inputNumber+" is Not a Palindrome";
		
	}
	
	public static int numberReversing(int inputNumber) {
		int output = 0 ;
		int tempNumber = 0;
		while(inputNumber > 0) {
			tempNumber = inputNumber % 10;
			output = (output * 10) + tempNumber;
			inputNumber = inputNumber / 10;
		}
		
		return output;
	}
	
	
}
