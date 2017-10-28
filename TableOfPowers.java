/* Serhiy Bardysh
 * 
 * Taking user input/integer and by using math   
 * turning it in to Squared and Cubed value by
 * displaying in it in the Table format. 
 * 
 */

import java.util.Scanner;

public class TableOfPowers {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		int userInput = 0;
		String choice = "y";
		
		while (choice.equals("y")) {
		
		System.out.println("Please enter the integer: ");

		userInput = scnr.nextInt();

		System.out.printf("%-10s %-10s %-10s\n", "Number", "Squared", "Cubed");
		System.out.printf("%-10s %-10s %-10s\n", "=======", "=======", "======");

		for (int i = 1; i <= userInput; i++) {

			int userOutputSquare = i * i;

			int userOutputCube = getCubes(i);
					
			System.out.printf("%-10d %-10d %-10d\n", i, userOutputSquare, userOutputCube);

		}
		    
			System.out.println("Do you want to continue? y/n");

			choice = scnr.next();
			
			}

		System.out.println("Good bye!!!");
		
		scnr.close();
		    
		}
	
	// created method
				
	public static int getCubes(int input) {

		int result = (int) Math.pow(input, 3);

		return result;
	}
}
