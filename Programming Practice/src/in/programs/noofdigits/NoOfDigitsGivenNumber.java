package in.programs.noofdigits;

public class NoOfDigitsGivenNumber {

	public static void main(String[] args) {
		System.out.println(noOfDigits(1213243213));
	}
	 public static int noOfDigits(int inputNumber) {
		 int output =0;
		 while(inputNumber >0) {
			 inputNumber = inputNumber /10;
			 output++;
		 }
		return output;
		 
	 }

}
