package faang;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithUniqueChars {
	public static void main(String[] args) {
		String str = LongestSubstringWithUnique("hello");
		System.out.println(str);

	}

	static String LongestSubstringWithUnique(String string) {
		if (string == null || string.isEmpty()) {
			return "";
		}
		Map<Character, Integer> visited = new HashMap<>();
		String target = "";
		int i = 0;
		int length = string.length();
		for (int j = 0; j < length; j++) {
			char currentChar = string.charAt(j);
			if (visited.containsKey(currentChar) && visited.get(currentChar) >= i) {
				i = Math.max(visited.get(currentChar) + 1, i);

			}
			if (target.length() < j - i + 1) {
				target = string.substring(i, j + 1);

			}
			visited.put(currentChar, j);

		}
		return target;

	}

}
