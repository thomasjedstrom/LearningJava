package day1.examples;

public class ExampleStringManipulation {

	public static void main(String[] args) {

		String x = "James Dean";
		
		System.out.println("Hello " + x);
		
		System.out.println(x.toUpperCase());
		
		System.out.println(x.substring(2));
		
		System.out.println(x.substring(2, 7));
		
		System.out.println(x.charAt(3));
		
		String age = "37";
		String salary = "78965.83";
//		Wrapper Classes
		
		int a = Integer.parseInt(age)/2;
		System.out.println(a);
		
		double s = Double.parseDouble(salary) * .15;
		System.out.println(s);

		
		/*
		 * Java has Eight Primitive Data Types
		 * 
		 * NAME		BITS	RANGE
		 * byte		8		-128 to 127
		 * short	16		-32,768 to 32,767
		 * int		32		-2,147,483,648 to 2,147,483,647
		 * long		64		-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		 * float	32		1.3e0-45 to 3.4e+038
		 * double	64		4.9e-324 to 1.8e+308
		 * char		16		'y'
		 * boolean	1		true or false
		 * 
		 * note: String is not primitive data type.  use String to store text.
		 * String x = "Hello World";
		 */
		
		
		
		
		
	}

}
