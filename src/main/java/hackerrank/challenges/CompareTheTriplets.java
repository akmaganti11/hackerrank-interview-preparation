package hackerrank.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(5, 6, 7);
		List<Integer> b = Arrays.asList(3, 6, 10);
		System.out.println(compareTriplets(a, b));
	}

	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		List<Integer> points = new ArrayList<>();
		List<Integer> a1 = new ArrayList<>();
		List<Integer> b1 = new ArrayList<>();
		a1 = a;
		b1 = b;

		int aPoints = 0;
		int bPoints = 0;

		for (int i = 0; i < a1.size(); i++) {
			if (a1.get(i) > b1.get(i)) {
				aPoints++;
			} else if(b1.get(i) > a1.get(i)){
				bPoints++;
			}
		}
		
		points.add(aPoints);
		points.add(bPoints);
		return points;
	}
}
