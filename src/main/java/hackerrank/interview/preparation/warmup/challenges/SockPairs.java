package hackerrank.interview.preparation.warmup.challenges;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SockPairs {

	// Solution
	static int sockMerchant(int n, int[] ar) {
		if (n >= 1 && n <= 100 && ar.length > 0 && ar.length <= 100) {
			Map<Integer, Integer> pairs = new HashMap<>();
			ArrayList<Integer> colorsList = IntStream.of(ar).boxed().collect(Collectors.toCollection(ArrayList::new));
			colorsList.forEach(x -> {
				if (null != pairs.get(x)) {
					pairs.put(x, pairs.get(x) + 1);
				} else {
					pairs.put(x, 1);
				}

			});

			return pairs.entrySet().stream().mapToInt(e -> e.getValue() / 2).sum();
		} else {
			throw new IllegalArgumentException();
		}

	}

	public static void main(String[] args) throws IOException {
		String i = "44 55 11 15 4 72 26 91 80 14 43 78 70 75 36 83 78 91 17 17 54 65 60 21 58 98 87 45 75 97 81 18 51 43 84 54 66 10 44 45 23 38 22 44 65 9 78 42 100 94 58 5 11 69 26 20 19 64 64 93 60 96 10 10 39 94 15 4 3 10 1 77 48 74 20 12 83 97 5 82 43 15 86 5 35 63 24 53 27 87 45 38 34 7 48 24 100 14 80 54";
		int arr1[] = Stream.of(i.split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] ar = { 100 };
		System.out.println(sockMerchant(1, ar));

	}
}
