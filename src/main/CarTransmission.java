package main;

import gearlevels.FifthGear;
import gearlevels.FirstGear;
import gearlevels.FourthGear;
import gearlevels.Neutral;
import gearlevels.Park;
import gearlevels.SecondGear;
import gearlevels.ThirdGear;

// carTransmission class
// methods upShift and downShift are used to determine which gear to shift after the accelerate 
// or decelerate operations based on the speed of the car

public class CarTransmission {

	private int speed;
	private Context carContext;
	private ChangeGear gearChanger;

	public CarTransmission() {
		speed = 0;
		carContext = new Context();
		gearChanger = new ChangeGear();
	}

	public Context getContext() {
		return carContext;
	}

	public void accelerate(int delta) {
		this.speed += delta;
		carContext = gearChanger.upShift(this.speed, carContext);
	}

	public void decelerate(int delta) {
		this.speed -= delta;
		carContext = gearChanger.downShift(this.speed, carContext);
	}

	public int getSpeed() {
		return this.speed;
	}
}