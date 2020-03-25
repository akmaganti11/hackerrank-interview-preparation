import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class SampleTest {
int a=0;

	public SampleTest(int a) {
	super();
	this.a = a;
}

	public static void main(String[] args) {
//		System.out.println(addNumbers(2.3f, 1.9f));
		winner("E", "H");
	}

	public static String winner(String erica, String bob) {
		Map<String, Integer> compare = new HashMap<>();
		getScore(erica, "erica", compare);
		getScore(bob,"bob", compare);
		
		if (compare.get("erica") > compare.get("bob")) {
			return "Erica";
		} else if (compare.get("erica") < compare.get("bob")) {
			return "Bob";
		} else {
			return "Tie";
		}

	}

	private static Map<String, Integer> getScore(String scoreOfPerson, String name, Map<String, Integer> compare) {
		for (int i = 0; i < scoreOfPerson.length(); i++) {
			char score = scoreOfPerson.charAt(i);
			if ('E' == score) {
				Integer val = compare.get(name);
				if (null != val) {
					compare.put(name, val + 1);
				} else {
					compare.put(name, 1);
				}
			} else if ('M' == score) {
				Integer val = compare.get(name);
				if (null != val) {
					compare.put(name, val + 3);
				} else {
					compare.put(name, 3);
				}
			} else if ('H' == score) {
				Integer val = compare.get(name);
				if (null != val) {
					compare.put(name, val + 5);
				} else {
					compare.put(name, 5);
				}
			}

		}
		return compare;
	}

	public static int addNumbers(float a, float b) {
		return (int) (a + b);

	}

}
