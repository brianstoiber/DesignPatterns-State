package gearlevels;

import main.Context;

public class SecondGear implements State {

	@Override
	public void doAction(Context context) {
		System.out.println("Second Gear");
		context.setState(this);
	}

	public String toString() {
		return "Second Gear";
	}
}
