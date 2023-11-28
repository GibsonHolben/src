/**
 * Creates a come hat extends building
 * @author Gibson Holben
 * @version 0.0.1
 */
public class Home extends Building
{
	/**The type of driveway the home has
	 *Default = dirt */
	private String 		 TypeOfDriveway 	= "dirt";
	
	/**Does the Home have a garage?
	 *Default = true*/
	private boolean 	 hasGarage 			= true;
	
	/** THe number of bedrooms the Home has
	 * default = 2*/
	byte				 numOfBedrooms 	= 2;
	
	/**
	 * Default constructor
	 */
	Home()
	{
		//If no default super() is explicitly 
		//called for the extended class 
		//it will call the default constructor implicitly
		super();	//Calls the building default constructor
	}
	
	
	/**
	 * Creates a Home with a passed in address
	 * @param adr The address of the home
	 * @param numbofbed The new number of bedrooms
	 */
	Home(Address adr, int numbofbed)
	{
		super(adr, 4);
		numOfBedrooms = (byte) numbofbed;
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
	

	Home(Address adr, int Floors, String Foundation,String Roof,
		 int Rooms, float length, float width, 
		 String typeOfDrive, boolean hasGarage, byte numOfBed)
	{
		super(adr, Floors);
		super.setFoundation(Foundation);
		super.setRoof(Roof);
		super.setRooms(Rooms);
		super.setLength(length);
		super.setWidth(width);
		
		this.TypeOfDriveway = typeOfDrive;
		this.hasGarage = hasGarage;
		this.numOfBedrooms = numOfBed;
	}
	
	
	
	Home(Address adr, String Foundation,
			String typeOfDrive, boolean hasGarage)
	{
		super();
		this.setA1(adr);
		this.setFoundation(Foundation);
		
		this.TypeOfDriveway = typeOfDrive;
		this.hasGarage = hasGarage;
	}
	
	
	
	Home(String StreetAddress, 
		 String State,
		 String City, 
		 int zip,
		 float length,
		 int floors,
		 String Foundation,
		 String typeOfDrive, 
		 boolean hasGarage)
	{
		super(new Address(StreetAddress, State,
							City, zip), floors);
		this.setLength(length);
		this.setFoundation(Foundation);
		
		this.TypeOfDriveway = typeOfDrive;
		this.hasGarage = hasGarage;
	}
	
	
	public String toString() 
	{
		return super.toString() + "|" + TypeOfDriveway + "|" 
		+ hasGarage + "|" + numOfBedrooms;		
	}
}
