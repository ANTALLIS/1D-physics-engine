public class Testing {
	public static void main() {
		MainSim sim = new MainSim();
		
		Ball ball_one = new Ball(1, 1, 2, "ball one");
		Ball ball_two = new Ball(1, 1, -2, "ball two");
		
		sim.runToNextCollision();
		
		sim.outputState();
		System.out.println("End.");
	}
}
