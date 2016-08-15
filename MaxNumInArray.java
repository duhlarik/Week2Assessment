/*
 * Complete the following program. The program should find
 * the maximum number inside the array "array1" using a while
 * loop, and then print that max on the console.
 */

public class MaxNumInArray {

	public static void main(String[] args) {

		int[] array1 = { 1, 105, 2, 22, 50, 10, 63, 99, 45, 102 };

		int max = array1[0];

		int i = 1;

		while (i < array1.length) {

			if (array1[i] > max) {

				max = array1[i];

			}
			
			i++;
		}

		System.out.println(max);
	}
}
