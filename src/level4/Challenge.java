package level4;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level4.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * complete the MAZE
	 * Hint: use bump sensors
	 */
	
	
	public void initialize() {
		driveDirect(1000,1000);
		sleep(500);
		driveDirect(0,105);
		sleep(2400);
		driveDirect(1000,1000);
		sleep(3000);
		driveDirect(105,0);
		sleep(2650);
		driveDirect(1000,1000);
		sleep(900);
		driveDirect(105,0);
		sleep(900);
		driveDirect(1000,1000);
		sleep(2000);
		driveDirect(0,105);
		sleep(2900);
		driveDirect(1000,1000);
		
		
		
	}

	public void loop() {

	}
}
