/* Use a for loop to calculate the sum of all odd numbers
 * between 1 and a number (n) entered by the user. The program 
 * should also print the sum on the console.
 */

import java.util.Scanner;

public class SumOdd {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);

		int sum = 0;

		System.out.println("Enter a number to calculate the sum of the odd numbers up to your number.");

		int input = scan1.nextInt();

		for (int i = 1; i <= input; i++) {

			if (i % 2 != 0) {

				sum += i;
			}

		}
		System.out.println("The sum of your numbers is: " + sum);
		scan1.close();
	}

}
