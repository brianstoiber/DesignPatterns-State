package gearlevels;

import main.Context;

public class FifthGear implements State {

	@Override
	public void doAction(Context context) {
		System.out.println("Fifth Gear");
		context.setState(this);
	}

	public String toString() {
		return "Fifth Gear";
	}

}