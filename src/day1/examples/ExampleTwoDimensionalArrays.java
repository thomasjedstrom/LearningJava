package day1.examples;

public class ExampleTwoDimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] TwoDim = new int[4][3];
		
//		TwoDim[2][1] = 10;
		
//		OR
		
		int temp = 10;
		
		for(int x=0; x<4; x++){
			for(int y=0; y<3; y++){
				TwoDim[x][y] = temp;
				temp +=10;
			}
		}
		
		for(int x=0; x<4; x++){
			for(int y=0; y<3; y++){
				System.out.print(TwoDim[x][y] + " ");
//				note: this is not println
			}
			System.out.println();
		}
	}

}
