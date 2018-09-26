package test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import main.CarTransmission;

public class CarTransmissionTest {
	
	private static CarTransmission car;
	
	@BeforeClass
	public static void setUp() {
		car = new CarTransmission();
	}

	@AfterClass
	public static void tearDown() {
		car = null;
	}
	
	// testing the gear level based on the speed of the car
	// showing the gear level as well as the current speed based on the accel/decel speeds
	@Test
	public void testAccelerateAndDecelerate(){
		System.out.println("Car is moving " + car.getSpeed() + " mph \n");
		
		car.accelerate(22);
		assertEquals(22, car.getSpeed());
		assertEquals("Second Gear",car.getContext().getState().toString());
		System.out.println("Car is moving " + car.getSpeed() + " mph \n");
		
		car.accelerate(13);
		assertEquals(35, car.getSpeed());
		assertEquals("Third Gear", car.getContext().getState().toString());
		System.out.println("Car is moving " + car.getSpeed() + " mph \n");
		
		car.accelerate(25);
		assertEquals(60, car.getSpeed());
		assertEquals("Fifth Gear", car.getContext().getState().toString());
		System.out.println("Car is moving " + car.getSpeed() + " mph \n");
		
		car.decelerate(19);
		assertEquals(41, car.getSpeed());
		assertEquals("Fourth Gear", car.getContext().getState().toString());
		System.out.println("Car is moving " + car.getSpeed() + " mph \n");
		
		car.decelerate(36);
		assertEquals(5, car.getSpeed());
		assertEquals("First Gear", car.getContext().getState().toString());
		System.out.println("Car is moving " + car.getSpeed() + " mph \n");
	}
	
}