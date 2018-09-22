package in.programs.numberbasic;

public class CheckNumberEvenOdd {

	public static void main(String[] args) {
		System.out.println(checkEvenorOdd(130));
	}
	
	public static String  checkEvenorOdd(int inputNumber) {
		String output;
		if(inputNumber % 2 ==0) {
			output = "Number is Even";
		}else {
			output = "Number is Odd";
		}
		return output;		
	}

}
