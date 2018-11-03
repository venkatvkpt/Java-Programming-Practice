package in.programs.arrays;

public class AscendingOrder {

	public static void main(String[] args) {
		int [] input = {1,53,2,2,4,32,546,5};
		System.out.println(" Before Sorting");
		for(int before : input) {
			System.out.print(before+" ");
		}
		order(input);
		System.out.println("\n After Sorting");
		for(int after : input) {
			System.out.print(after +" ");
		}

	}


	private static void order(int[] in) {
		int size = in.length;
		int temp =0;
		for(int i =0;i<size;i++) {
			for(int j =1; j < size-i ;j++) {

				if(in[j-1] > in[j]) {
					temp = in[j-1];
					in[j-1] = in[j];
					in[j] = temp;
				}
			}
		}

	}

}
