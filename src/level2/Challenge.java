package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level2.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		Sonar sonar = new Sonar(roomba);
	}

	public void initialize() {
		driveDirect(400, 400);
		sleep(4000);
		driveDirect(0, 100);
		sleep(3000);
		driveDirect(400, 400);
		sleep(6000);
		driveDirect(100, 0);
		sleep(3000);
		driveDirect(400, 400);

	}

	public void loop() {

	}
}
