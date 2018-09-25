package gearlevels;

import main.Context;

// state interface 
// each state of the car's transmission/gearing

public interface State {

	public void doAction(Context context);

}
