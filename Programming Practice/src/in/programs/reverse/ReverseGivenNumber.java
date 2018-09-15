package in.programs.reverse;

import java.util.Scanner;

public class ReverseGivenNumber {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner givenNumber = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int number = Integer.parseInt(givenNumber.nextLine());
		System.out.println("Reverse Number: "+numberReversing(number));
	}
	
	@SuppressWarnings("unused")
	private static int numberReversing(int inputNumber)
	{
		int tempNumber = 0,outputNumber = 0;
		while(inputNumber >0) {
			tempNumber = inputNumber % 10;
			outputNumber = outputNumber *10 + tempNumber;
			inputNumber = inputNumber / 10;
		}
		
		return outputNumber;	
	}

}
