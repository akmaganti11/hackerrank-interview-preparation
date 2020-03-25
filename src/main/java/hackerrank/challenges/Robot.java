package hackerrank.challenges;

import java.util.ArrayList;
import java.util.List;

public class Robot {

	private Integer currentX = 0;
	private Integer currentY = 5;
	private Integer previousX = 0;
	private Integer previousY = 0;
	private Integer dx = 0;
	private Integer dy = 0;
	private Integer x = 0;
	private Integer y = 0;
	List<String> steps = new ArrayList<>();

	public Robot(Integer x, Integer y) {
		super();
		this.previousX = currentX;
		this.previousY = currentY;
		this.currentX = x;
		this.currentY = y;
		this.x = x;
		this.y = y;
	}

	public Robot() {
		super();
	}

	public void moveX(Integer dx) {
		this.dx = dx;
		currentX = currentX + dx;
		printLastCoordinates();
		steps.add("moveX");
	}

	public void moveY(Integer dy) {
		this.dy = dy;
		currentY = currentY + dy;
		printLastCoordinates();
		steps.add("moveY");
	}

	public void printCurrentCoordinates() {
		System.out.println(currentX + " " + currentY);
	}

	public void printLastCoordinates() {
		System.out.println(previousX + " " + previousY);
	}

	public void printLastMove() {
		String step = steps.get(steps.size() - 1);
		if (step != null && "moveX".equalsIgnoreCase(step)) {
			int distance = dx - x;
			System.out.println(x + " " + distance);
		} else if (step != null && "moveY".equalsIgnoreCase(step)) {
			int distance = dy - y;
			System.out.println(y + " " + dy);
		}
	}

}

class a {

}
