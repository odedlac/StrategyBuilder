/**
 * 
 */
package tests;

import static org.junit.Assert.*;


import org.junit.Test;


import vehicles.Airplane;

import vehicles.Builder;
import vehicles.Director;
import vehicles.HarrierBuilder;
import vehicles.ModelAirplaneBuilder;
import vehicles.PassengerPlaneBuilder;




/**
 * @author oded
 *
 */
public class AirplaneTest {



	@Test
	public void test1() {
				
		String expectedOutput = "Like a fighter jet";
		String stringReturned = null;
		
		Builder builder = new HarrierBuilder();
		
		Director director = new Director(builder);

		director.constructAirplane();

		Airplane classUnderTest = builder.getAirplane();

		stringReturned = classUnderTest.howDoYouFly();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}

	
	@Test
	public void test2() {
				
		String expectedOutput = "I don't Fly";
		String stringReturned = null;
	
		Builder builder = new ModelAirplaneBuilder();
		
		Director director = new Director(builder);

		director.constructAirplane();

		Airplane classUnderTest = builder.getAirplane();


		stringReturned = classUnderTest.howDoYouFly();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}
	
	@Test
	public void test3() {
				
		String expectedOutput = "Like a passenger airplane";
		String stringReturned = null;
		
		Builder builder = new PassengerPlaneBuilder();
		
		Director director = new Director(builder);

		director.constructAirplane();

		Airplane classUnderTest = builder.getAirplane();

		stringReturned = classUnderTest.howDoYouFly();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}
	
	
	@Test
	public void test4() {
				
		String expectedOutput = "Vertically";
		String stringReturned = null;

		Builder builder = new HarrierBuilder();
		
		Director director = new Director(builder);

		director.constructAirplane();

		Airplane classUnderTest = builder.getAirplane();

		stringReturned = classUnderTest.howDoYouLiftOff();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}
	
	@Test
	public void test5() {
				
		String expectedOutput = "I don't LiftOff";
		String stringReturned = null;

		Builder builder = new ModelAirplaneBuilder();
		
		Director director = new Director(builder);

		director.constructAirplane();

		Airplane classUnderTest = builder.getAirplane();

		stringReturned = classUnderTest.howDoYouLiftOff();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}

	@Test
	public void test6() {
				
		String expectedOutput = "Horizontally";
		String stringReturned = null;

		Builder builder = new PassengerPlaneBuilder();
		
		Director director = new Director(builder);

		director.constructAirplane();

		Airplane classUnderTest = builder.getAirplane();

		stringReturned = classUnderTest.howDoYouLiftOff();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}


}
