package gearlevels;

import main.Context;

public class FirstGear implements State {

	@Override
	public void doAction(Context context) {
		System.out.println("First Gear");
		context.setState(this);
	}

	public String toString() {
		return "First Gear";
	}

}