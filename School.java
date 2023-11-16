/**
 * A class that is used to create a school that is
 * based off of the Building class
 * <b>Extends: Building</b>
 * @author <p>Gibson Holben</p>
 * @version 0.0.0.1
 */
public class School extends Building 
{
	/**The schools name
	 * Default = blank*/
	private String 	Name = "";
	
	/**The number of clasrooms in the school
	 * Default = 1*/
	private short 	numOfClassrooms = 1;
	
	/**THe number of stuents in each class
	 * Default = 1*/
	private short 	numOfStudentsPerClass = 1;
	
	/**The number of parking spaces in the parking lot
	 * Deafult = 1*/
	private short 	numOfParkingLotSpaces = 1;
	
	/**The type of parking lot the school has
	 * Default = Blank*/
	private String 	ParkingLotType = "";
	
	
	/**
	 * The default constructor
	 */
	School()
	{
		super();
	}
	
	
	
	School(Address a1,
			int Floors, 
			String Name, 
			short numOfParkingLotSpaces, 
			String ParkingLotType )
	{
		super(a1, Floors);
		this.Name = Name;
		this.numOfParkingLotSpaces = numOfParkingLotSpaces;
		this.ParkingLotType = ParkingLotType;
	}
	
	
	
	School(String StreetAddress, 
			String State,
			String City, 
			int zip,
			int Floors,
			String Foundation,
			String Roof,
			int Rooms, 
			float length, 
			float width,
			String Name, 
			short numOfParkingLotSpaces, 
			String ParkingLotType,
			short numOfStudentsPerClass,
			short numOfClassrooms)
	{
		super(StreetAddress, State, City, zip,
				Floors, Foundation, Roof,
				Rooms, length, width);
		
		this.Name = Name;
		this.numOfParkingLotSpaces = numOfParkingLotSpaces;
		this.ParkingLotType = ParkingLotType;
		this.numOfClassrooms = numOfClassrooms;
		this.numOfStudentsPerClass = numOfStudentsPerClass;
	}
}
