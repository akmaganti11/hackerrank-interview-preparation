package hackerrank.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {
	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(11, 2, 4);
		List<Integer> b = Arrays.asList(4, 5, 6);
		List<Integer> c = Arrays.asList(10, 8, -12);
		List<List<Integer>> arr = new ArrayList<>();
		arr.add(a);
		arr.add(b);
		arr.add(c);
		System.out.println(diagonalDifference(arr));
	}

	public static int diagonalDifference(List<List<Integer>> arr) {
		List<List<Integer>> array = new ArrayList<>();
		array = arr;
		int lSum = 0;
		int f = 0;
		int rSum = 0;
		int rf = 0;

		for (int l = 0; l < array.size(); l++) {
			List<Integer> list = array.get(l);
			lSum = lSum + list.get(f);
			rSum = rSum + list.get(list.size() - rf - 1);
			f++;
			rf++;
		}

		return Math.abs(lSum - rSum);
	}
}
