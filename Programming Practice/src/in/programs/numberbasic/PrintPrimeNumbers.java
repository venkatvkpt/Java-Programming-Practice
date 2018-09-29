package in.programs.numberbasic;

public class PrintPrimeNumbers {

	public static void main(String[] args) {

		int rang =100;
		
		for(int i = 0; i <= rang ; i++) {
			if(isPrime (i))
				System.out.print(" "+i);
		}
	}
	
	private static boolean isPrime(int input) {
		int incrementer =2;
		boolean flag = true;
		while(incrementer <= input/2) {
			if(input % incrementer ==0) {
				flag = false;
				break;
			}
			incrementer++;
		}
		return flag;
	}

}
