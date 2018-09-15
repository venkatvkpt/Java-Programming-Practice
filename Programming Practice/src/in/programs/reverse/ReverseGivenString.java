package in.programs.reverse;

import java.util.Scanner;

public class ReverseGivenString {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter String: ");
		String input = inputScanner.nextLine();
		
		System.out.println("Reverse String: "+reverseString(input));
		
	}
	
	private static String reverseString(String input) 
	{
		
		String output = "";
		char inputarray[] = input.toCharArray();
		
		for(int incVar = inputarray.length-1; incVar >=0  ; incVar --) {
			output += (inputarray[incVar]);
		}
		return output;		
	}

}
