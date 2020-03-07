package hackerrank.interview.preparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class Test {

	public static void main(String[] args) {
		int[] numbers = { 5, 1, 7, 9, 2, 4, 6, 8, 10, 3, 12, 14, 11, 13 };
		
		int[] array1 = Arrays.copyOfRange(numbers, 0, numbers.length/2-1);
	    int[] array2 = Arrays.copyOfRange(numbers, numbers.length/2, numbers.length);
		List<int[]> arraysList = new ArrayList<>();
		arraysList.add(array1);
		arraysList.add(array2);
		
		for(int i=0; i<array1.length; i++) {
			System.out.println();
		}
		
		arraysList.stream().forEach(a -> {
			execute(a);
		});
		
//		Spliterator<int[]> split = Arrays.asList(numbers).spliterator();
//		split.forEachRemaining(s -> {
//			execute(s);
//		});
		

	}

	private static void execute(int[] numbers) {
		for(int i =0; i<numbers.length; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				if(numbers[i]+numbers[j] == 12) {
					System.out.println("("+numbers[i] + ", "+numbers[j]+")");
				}
			}
		}
	}

}
