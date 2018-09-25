package gearlevels;

import main.Context;

public class Park implements State {

	@Override
	public void doAction(Context context) {
		System.out.println("Transmission is in park");
		context.setState(this);
	}

	public String toString() {
		return "Parked";
	}

}