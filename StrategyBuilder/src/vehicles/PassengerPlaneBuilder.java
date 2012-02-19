/**
 * 
 */
package vehicles;


/**
 * @author Oded
 *
 */
public class PassengerPlaneBuilder implements Builder {

	private Airplane airplane;
	private Flying flying;
	private LiftOff liftOff;

	/* (non-Javadoc)
	 * @see vehicles.Builder#getAirplane()
	 */
	@Override
	public Airplane getAirplane() {
		return airplane;
	}

	/* (non-Javadoc)
	 * @see vehicles.Builder#buildFlying()
	 */
	@Override
	public void buildFlying() {
		flying =  FlyingFactory.createFlying("Passenger Airplane");
	}

	/* (non-Javadoc)
	 * @see vehicles.Builder#buildLiftOff()
	 */
	@Override
	public void buildLiftOff() {
		liftOff = LiftOffFactory.createLiftOff("Horizontally");
	}

	/* (non-Javadoc)
	 * @see vehicles.Builder#buildAirplane()
	 */
	@Override
	public void buildAirplane() {
		airplane = new Airplane(liftOff,flying);		
	}

}
