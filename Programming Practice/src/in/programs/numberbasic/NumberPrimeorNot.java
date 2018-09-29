package in.programs.numberbasic;

public class NumberPrimeorNot {

	public static void main(String[] args) {

		int inputNumber = 4;
		if(isPrime(inputNumber)) {
			System.out.println("is a prime");
		}else {
			System.out.println("is a not prime");
		}

	}

	private static boolean isPrime(int input) {
		int inc =2;
		boolean flag= true;
		while(inc <= input/2) {
			if(input % inc == 0) {
				flag = false;
				break;
			}
			inc++;

		}

		return flag;
	}

}
