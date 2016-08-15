
 /*Write Java code that reads two integers using the scanner,
 * x and y, then print out the result of x divided by y. Write the
 * code having in mind handling at least two exceptions using
 * try and catch.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divide2Integers {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);

		String choice = "yes";

		while (choice.equalsIgnoreCase("yes")) {

			try {
				System.out.println("Enter integer x:");

				int x = scan1.nextInt();

				System.out.println("Enter integer y:");

				int y = scan1.nextInt();

				double result = ((double) x / y);
				System.out.println(result);
				scan1.nextLine();
			}

			catch (ArithmeticException f) {

				System.out.println("You are trying to divide by zero. \nYou must enter a number greater than zero for \"y.\" " + f);
				scan1.nextLine();
			}

			catch (InputMismatchException e) {

				System.out.println("Invalid entry. Please enter an integer. " + e);
				scan1.nextLine();
			}
			System.out.println("Continue?");

			choice = scan1.nextLine();
		}
		scan1.close();
	}

}
