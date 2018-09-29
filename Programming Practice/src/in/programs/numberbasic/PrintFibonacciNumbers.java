package in.programs.numberbasic;

public class PrintFibonacciNumbers {

	public static void main(String[] args) {
	
		fibonacciSeries(11);
	}
	
	private static void fibonacciSeries(int rang) {
		int temp=0;
		int temps=1;
		int temp3=1;
		String out =temp+" "+temps;
		for(int i =0; i<=rang; i++) {
			temp3 = temp + temps;
			temp = temps;
			temps = temp3;
			out +=" " +temp3;
			
		}
		System.out.print(" "+out);
	}

}
