package gearlevels;

import main.Context;

public class Neutral implements State {

	@Override
	public void doAction(Context context) {
		System.out.println("Neutral Gear");
		context.setState(this);
	}

	public String toString() {
		return "Neutral Gear";
	}
}