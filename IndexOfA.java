/*
 * Write a for loop that finds all the indices of the letter "a"
 * in the String "This Java bootcamp is so AWESOME."
 */

public class IndexOfA {

	public static void main(String[] args) {

		String bootcamp = "This Java bootcamp is so AWESOME.";

		for (int i = 0; i < bootcamp.length(); i++) {

			if ((bootcamp.charAt(i) == 'a') || (bootcamp.charAt(i) == 'A')) {

				System.out.print(i + ", ");
			}
		}
	}
}
