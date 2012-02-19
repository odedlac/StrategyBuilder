/**
 * 
 */
package vehicles;

/**
 * @author Oded
 *
 */
public class Director {

	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public void constructAirplane() {
		builder.buildFlying();
		builder.buildLiftOff();
		builder.buildAirplane();		
	}

}
