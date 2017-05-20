package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
		driveDirect(400, 400);
		sleep(3000);
		driveDirect(0, 100);
		sleep(2500);
		driveDirect(400, 400);
		sleep(2500);
		driveDirect(100, 0);
		sleep(2500);
		driveDirect(400, 400);
		sleep(2500);
		driveDirect(0, 105);
		sleep(2500);
		driveDirect(400, 400);
		sleep(2300);
		driveDirect(100, 0);
		sleep(2600);
		driveDirect(400, 400);

	}

	public void loop() {

	}
}
