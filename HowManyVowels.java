/*
 * Use a while/loop and switch/case to count the number of vowels
 * in the string "How many vowels in this string?"
 */

public class HowManyVowels {

	public static void main(String[] args) {

		String vowels = "How many vowels in this string?";
		
		System.out.println(vowels);
		
		String lowerVowels = vowels.toLowerCase();

		int count = 0;
		
		int i = 0;

		while (i < vowels.length()) {
			
			switch (lowerVowels.charAt(i)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count += 1;
				break;

			} i++;
			
		}
		System.out.println("There are " + count + " vowels in this string.");
	}

}
