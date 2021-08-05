package ua.Mk;

public class Aplication {

	public static void main(String[] args) {
		Robot robot = new Robot();
		CoffeRobot coffeRobot = new CoffeRobot();
		RobotDancer robotDancer = new RobotDancer();
		RobotCoocker robotCoocker = new RobotCoocker ();
		robot.work();
		coffeRobot.work();
		robotDancer.work();
		robotCoocker.work();
		Robot [] arr = {robot, coffeRobot, robotDancer, robotCoocker};
		for(int i =0; i< arr.length; i++){
			Robot b = arr[i];
			b.work();
		
		}
	}

}
