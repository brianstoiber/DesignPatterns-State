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
	private Park park;
	private Neutral neutral;
	private FirstGear firstGear;
	private SecondGear secondGear;
	private ThirdGear thirdGear;
	private FourthGear fourthGear;
	private FifthGear fifthGear;

	public CarTransmission() {
		speed = 0;
		carContext = new Context();
		park = new Park();
		park.doAction(carContext); // car is parked (locked) in initialization phase
		neutral = new Neutral();
		firstGear = new FirstGear();
		secondGear = new SecondGear();
		thirdGear = new ThirdGear();
		fourthGear = new FourthGear();
		fifthGear = new FifthGear();
	}

	public Context getContext() {
		return carContext;
	}

	public void accelerate(int delta) {
		this.speed += delta;
		upShift();
	}

	public void decelerate(int delta) {
		this.speed -= delta;
		downShift();
	}

	public void upShift() {
		if (this.speed == 0) {
			neutral.doAction(carContext);
		} else if (this.speed > 0 && this.speed <= 20) {
			firstGear.doAction(carContext);
		} else if (this.speed > 20 && this.speed <= 30) {
			secondGear.doAction(carContext);
		} else if (this.speed > 30 && this.speed <= 40) {
			thirdGear.doAction(carContext);
		} else if (this.speed > 40 && this.speed <= 50) {
			fourthGear.doAction(carContext);
		} else {
			fifthGear.doAction(carContext);
		}
	}

	public void downShift() {
		if (this.speed < 50 && this.speed > 40) {
			fourthGear.doAction(carContext);
		} else if (this.speed < 40 && this.speed > 30) {
			thirdGear.doAction(carContext);
		} else if (this.speed < 30 && this.speed > 20) {
			secondGear.doAction(carContext);
		} else if (this.speed < 20 && this.speed > 0) {
			firstGear.doAction(carContext);
		} else if (this.speed == 0) {
			neutral.doAction(carContext);
		} else {
			park.doAction(carContext);
		}
	}

	public int getSpeed() {
		return this.speed;
	}
}