package examples;
import org.jointheleague.graphical.robot.Robot;

public class IntroToRobot {
	
	public static void main(String[] args) {

		Robot r2d2 = new Robot();
		r2d2.penDown();
		r2d2.setPenWidth(20);
		r2d2.setSpeed(5);

		// create four squares four times
		for (int j = 0; j < 4; j++) {
			
			r2d2.setRandomPenColor();
		
			for (int i = 0; i < 4; i++) {
				r2d2.move(100);
				r2d2.turn(90);
			}
			
			r2d2.turn(90);
		
		}

	}
	
}
