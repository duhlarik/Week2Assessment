/*
 * Write a while loop that sums the numbers inside an ArrayList. The array list
 * has integer numbers, has already been filled in with values, and is named
 * numberList
 */
import java.util.ArrayList;

public class SumNumArray {

	public static void main(String[] args) {

		ArrayList<Integer> numberList = new ArrayList<>();
		
		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		numberList.add(4);
		numberList.add(5);
		numberList.add(6);
		numberList.add(7);
		numberList.add(8);
		numberList.add(9);
		numberList.add(10);
				

		int sum = 0;
		
		int i = 0;

		while (i < numberList.size()) {

			sum += numberList.get(i);
			i++;
		} 
		System.out.println(sum);
	}

}
