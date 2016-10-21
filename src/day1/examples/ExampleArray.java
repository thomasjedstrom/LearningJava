package day1.examples;

public class ExampleArray {

	public static void main(String[] args) {

		int[] a = {1, 2, 3, 5, 8, 13, 21};

		System.out.println(a[2] + a[4]);
		
//		enhanced For Loop
		for(int temp : a){
			System.out.println(temp);
		}
		
		
//		creating an empyt array
		int[] x = new int[5];
//		the default to values of 0
		x[3] = 25;
		x[0] = 12;
		
		for(int temp2 : x){
			System.out.println(temp2);
		}
		

		
//		STRING ARRAYS
//		the default values will be "null"
		String[] stx = new String[5];
		
		stx[3] = "25";
		stx[0] = "12";
		
	}

}
