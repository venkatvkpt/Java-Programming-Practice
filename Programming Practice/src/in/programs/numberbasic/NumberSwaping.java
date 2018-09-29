
package in.programs.numberbasic;


public class NumberSwaping {

	public static void main(String[] args) {
		numbersSwap(22,100);

	}

	private static void numbersSwap(int firstNumber ,int secondNumber) {
		System.out.println("Before Swap \n First Number: "+firstNumber +" Second Number: "+ secondNumber);
		firstNumber =firstNumber + secondNumber;
		secondNumber = firstNumber - secondNumber;
		firstNumber = firstNumber - secondNumber;
		System.out.println("After Swap \n First Number: "+firstNumber +" Second Number: "+ secondNumber);

	}

}
