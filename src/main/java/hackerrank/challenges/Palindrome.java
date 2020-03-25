package hackerrank.challenges;
import java.util.ArrayList;
import java.util.List;

public class Palindrome {

	public static int findAllPalindromesUsingBruteForceApproach(String s) {
		List<String> palindromes = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				if (palindromeCheck(s.substring(i, j))) {
					palindromes.add(s.substring(i, j));
				}
			}
		}
		return palindromes.size();
	}

	private static boolean palindromeCheck(String input) {
		StringBuilder plain = new StringBuilder(input);
		StringBuilder reverse = plain.reverse();
		return (reverse.toString()).equals(input);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findAllPalindromesUsingBruteForceApproach("aaa"));
	}

}
