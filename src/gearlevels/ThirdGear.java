package gearlevels;

import main.Context;

public class ThirdGear implements State {

	@Override
	public void doAction(Context context) {
		System.out.println("Third Gear");
		context.setState(this);
	}

	public String toString() {
		return "Third Gear";
	}

}