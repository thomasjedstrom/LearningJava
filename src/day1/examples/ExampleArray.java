package day1.examples;

public class ExampleArray {

	public static void main(String[] args) {

		int[] a = {1, 2, 3, 5, 8, 13, 21};

		System.out.println(a[2] + a[4]);
		
//		enhanced For Loop
		for(int temp : a){
			System.out.println(temp);
		}
	}

}
