package recursion;

public class WordPalendrom {
	public static void main(String[] args) {
		System.out.println(isTheWordPalendrom("WOW"));
		System.out.println(isTheWordPalendrom("mOm"));
		System.out.println(isTheWordPalendrom("hello"));
		System.out.println("using recusrion");
		System.out.println(isPalendrom("WOW"));
		reverseN(1234567);

	}

	// iteration
	static boolean isTheWordPalendrom(String word) {
		int left_Pointer = 0;
		int right_Pointer = word.length() - 1;
		while (left_Pointer < right_Pointer) {
			if (word.charAt(left_Pointer) == word.charAt(right_Pointer)) {
				return true;

			}
			left_Pointer++;
			right_Pointer--;

		}
		return false;

	}

	static boolean isPalendrom(String word) {
		String newWod = reversedWord(word);
		if (word.equals(newWod)) {
			return true;

		}
		return false;

	}

	private static String reversedWord(String word) {
		if (word == null || word.isEmpty()) {
			return word;

		}

		return word.charAt(word.length() - 1) + reversedWord(word.substring(0, word.length() - 1));
	}

	static void reverseN(int n) {
		if (n > 0) {
			System.out.print(n % 10 + " ");
			reverseN(n / 10);

		}

	}

}
