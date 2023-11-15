/**
 * A simple class that creates a Home
 * @author Gibson Holben
 * @version 0.0.1
 */
public class Home extends Building
{
	/**The type of driveway the home has
	 *Default = dirt */
	private String 		 typeOfDriveway 	= "dirt";
	
	/**Does the Home have a garage?
	 *Default = true*/
	private boolean 	 isGarage 			= true;
	/** THe number of bedrooms the Home has
	 * default = 2*/
	byte				 numOfBedrooms 	= 2;
	
	/**
	 * Default constructor
	 */
	Home()
	{
		super();	//Calls the building default constructor
	}
	
	
	/**
	 * Creates a Home with a passed in address
	 * @param adr The address of the home
	 * @param numbof The new number of bedrooms
	 */
	Home(Address adr, int numbof)
	{
		super(adr, 4);	//Calls the building default constructor
		numOfBedrooms = (byte) numbof;
	}
	
	
	Home(String StreetAddress,
			String State,
			String City,
			int zip,
			int Floors,
			String Foundation,
			String Roof,
			int Rooms, 
			float length, 
			float width)
	{
		super(StreetAddress, State, City,
		zip, Floors, Foundation, Roof, Rooms, length, width);
	}

}
