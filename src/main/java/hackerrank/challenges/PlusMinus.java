package hackerrank.challenges;

public class PlusMinus {
	public static void main(String[] args) {
		int[] array = new int[] { -4, 3, -9, 0, 4, 1 };
		plusMinus(array);
	}

	static void plusMinus(int[] arr) {
		float positives = 0;
		float negatives = 0;
		float zeros = 0;
		float length = arr.length;
		for (int i = 0; i < length; i++) {
			if (arr[i] > 0) {
				positives++;
			} else if (arr[i] < 0) {
				negatives++;
			} else {
				zeros++;
			}
		}

		float p = positives / length;
		System.out.println(p);
		float n = negatives / length;
		System.out.println(n);
		float z = zeros / length;
		System.out.println(z);
	}
}
