package gearlevels;

import main.Context;

public class FourthGear implements State {

	@Override
	public void doAction(Context context) {
		System.out.println("Fourth Gear");
		context.setState(this);
	}

	public String toString() {
		return "Fourth Gear";
	}

}