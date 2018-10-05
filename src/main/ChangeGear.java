package main;

import gearlevels.FifthGear;
import gearlevels.FirstGear;
import gearlevels.FourthGear;
import gearlevels.Neutral;
import gearlevels.Park;
import gearlevels.SecondGear;
import gearlevels.ThirdGear;

public class ChangeGear {
	private Park park;
	private Neutral neutral;
	private FirstGear firstGear;
	private SecondGear secondGear;
	private ThirdGear thirdGear;
	private FourthGear fourthGear;
	private FifthGear fifthGear;

	public ChangeGear() {
		neutral = new Neutral();
		firstGear = new FirstGear();
		secondGear = new SecondGear();
		thirdGear = new ThirdGear();
		fourthGear = new FourthGear();
		fifthGear = new FifthGear();
		park = new Park();
	}

	public Context upShift(int speed, Context carContext) {
		if (speed == 0) {
			carContext.setState(neutral);
		} else if (speed > 0 && speed <= 20) {
			carContext.setState(firstGear);
		} else if (speed > 20 && speed <= 30) {
			carContext.setState(secondGear);
		} else if (speed > 30 && speed <= 40) {
			carContext.setState(thirdGear);
		} else if (speed > 40 && speed <= 50) {
			carContext.setState(fourthGear);
		} else {
			carContext.setState(fifthGear);
		}
		return carContext;
	}

	public Context downShift(int speed, Context carContext) {
		if (speed < 50 && speed > 40) {
			carContext.setState(fourthGear);
		} else if (speed < 40 && speed > 30) {
			carContext.setState(thirdGear);
		} else if (speed < 30 && speed > 20) {
			carContext.setState(secondGear);
		} else if (speed < 20 && speed > 0) {
			carContext.setState(firstGear);
		} else if (speed == 0) {
			carContext.setState(neutral);
		} else {
			carContext.setState(park);
		}
		return carContext;
	}

}
