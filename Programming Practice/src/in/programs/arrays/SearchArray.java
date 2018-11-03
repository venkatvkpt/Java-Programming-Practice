package in.programs.arrays;

public class SearchArray {

	public static void main(String[] args) {
		int [] input = {1,243,4,0,2,5,67,3,7,4,8,1,0,3,1};
		
		System.out.println(search(input,0));
	}
	
	private static String search(int [] in,int find) {
		
		int size = in.length;
		String found = " ";
		for(int i = 0; i < size; i++) {
			if(in[i] == find) {
				found += i+", ";
			}
		}
		
		if(found.equals(" ")) {
			return "Given Value "+find+" Not Available.";
		}else {
			return "Given Value "+find+" Available in "+found.substring(0, found.length() - 2)+" Position";
		}
		
				
	}

}
