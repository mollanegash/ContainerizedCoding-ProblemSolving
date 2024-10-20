package leetcodeAndHackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UncommonFromSentences {
	public static void main(String[] args) {
		String s1 = "good";
		String s2 = "start";
		String s3 = "this apple is sweet";
		String s4 = "this apple is sour";
		String s5 = "apple apple";
		String s6 = "Banana";

		String[] string_12 = uncommonFromSentences(s1, s2);
		System.out.println(Arrays.toString(string_12));
		String[] string_34 = uncommonFromSentences(s3, s4);
		System.out.println(Arrays.toString(string_34));
		String[] string_56 = uncommonFromSentences(s5, s6);
		System.out.println(Arrays.toString(string_56));

	}

	public static String[] uncommonFromSentences(String s1, String s2) {
		Map<String, Integer> wordCount = new HashMap<>();
		
		String combinedWords_s1s2 = s1 + " " + s2;
		String words[] = combinedWords_s1s2.split(" ");
		for (String word : words) {
			wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);

		}
		List<String> uncommonWords = new ArrayList<>();

		for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
			if (entry.getValue() == 1) {
				uncommonWords.add(entry.getKey());
			}

		}

		return uncommonWords.toArray(new String[0]);

	}
}
