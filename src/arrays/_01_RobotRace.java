package arrays;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[]args) {
		//2. create an array of 5 robots.
		Robot[] potato = new Robot[3];
		//3. use a for loop to initialize the robots.
		for(int i = 0; i<potato.length; i++) {
			potato[i]= new Robot();
			//4. make each robot start at the bottom of the screen, side by side, facing up
			//potato[i].setX(i*100+50);
			//potato[i].setY(500);
			potato[i].setX(250);
			potato[i].setSpeed(100);
		}
	potato[0].setPenColor(Color.red);
	potato[1].setPenColor(Color.blue);
	potato[2].setPenColor(Color.green);
	potato[0].penDown();
	potato[1].penDown();
	potato[2].penDown();
	
		//5. use another for loop to iterate through the array and make each robot move 
		//   a random amount less than 50.
		Random ran = new Random();
		
		boolean done = false;
	int x =0;
	Robot rob = new Robot();
	rob.penDown();
	rob.setSpeed(100);
	rob.setX(300);
	for(int i = 0; i < 360; i++) {
		rob.move(2);
		rob.turn(1);
	}
	rob.penUp();
	rob.move(1000);
	Robot r2 = new Robot();
	r2.penDown();
	r2.setSpeed(100);
	r2.setX(200);
	for(int i = 0; i < 360; i++) {
		r2.move(4);
		r2.turn(1);
	}
	r2.penUp();
	r2.move(1000);
	
	while(!done) {
		for(int i = 0; i<potato.length&&!done; i++) {	
			int u = ran.nextInt(50)+1;
			for(int y = 0;y<u ;y++) {
			potato[i].move(3);
			potato[i].turn(1);
			}
			x=i+1;
			if(potato[i].getX()<=252) {
				done=true;
			}
		}
	}
		
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!
		System.out.println("The fastest robot is robot #" + x);
	//8. try different races with different amounts of robots.
		
	//9. make the robots race around a circular track.
	
}
}
