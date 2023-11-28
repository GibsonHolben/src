/**
 * This is my code for clothing store
 * @author CTEWilliamsC92
 *
 */
public class ClothingStore extends Building
{
	//instance variables
	/**
	 * The name of the clothing store
	 * Default is Nike
	 */
	private String Name = "Nike";

	/**
	 * The type of parking lot the clothing store has
	 *  Default is Garage.
	 */
	private String ParkingLotType = "Garage";
	
	/**
	 *
	 * Default is 5.
	 */
	private int ParkingLotSpace = 5;
	
	//1
	/**
	* Default Constructor
	* Adds up the number of ClothingStores
	*
	*/
	ClothingStore()
	{
		super();
	}
	
	//2
	/**
	 * Instance variables passed in from building
	 * @param a1 - the address from building
	 * @param Floors - how many floors in the building
	 */
	ClothingStore(Address a1, int Floors)
	{
		super(a1, Floors);
	}
	
	//3
	/**
	 * Instance variables passed in from building
	 * @param StreetAddress - Address for the building
	 * @param State - The state that the building is in 
	 * @param City - The city the building is in
	 * @param zip - The zip code for the building
	 * @param Floors - The number of floors in the building
	 * @param Foundation - The foundation for the building 
	 * @param Roof - The condition of the roof in building
	 * @param Rooms - The number of rooms in the building
	 * @param length - The length of the building
	 * @param width - The width of the building
	 */
	ClothingStore(String StreetAddress, String State, 
			String City, int zip,
			int Floors, String Foundation,String Roof,
			int Rooms, float length, float width)
	{
		super(StreetAddress, State, City,zip,
				Floors, Foundation,Roof,
				Rooms, length, width);
	}
	
	//4
	/**
	 * "Pass in address object, and all instance variables
	 *  for your new object"
	 * @param Floors - The number of floors in the building 
	 * @param Foundation - The foundation for the building 
	 * @param Roof - The condition of the roof in building
	 * @param Rooms - The number of rooms in the building
	 * @param length - The length of the building
	 * @param width - The width of the building
	 * @param Name - Name of building
	 * @param ParkingLotType - The type of parking lot
	 * @param ParkingLotSpace - The amount of parking
	 * lot spaces available
	 */
		ClothingStore(Address a1, int Floors, String Foundation,String Roof,
				int Rooms, float length, float width, String Name, 
				String ParkingLotType, int ParkingLotSpace)
		
		{
			super(a1, Floors);
			this.setFoundation(Foundation);
			this.setRooms(Rooms);
			this.setRoof(Roof);
			this.setLength(length);
			this.setWidth(width);
					
			this.Name 				= Name;
			this.ParkingLotType 	= ParkingLotType; 
			this.ParkingLotSpace 	= ParkingLotSpace;
		}
	
	
	
	//5
	/**
	 * Pass in address object and 3  instance variables 
	 * of your choice for new object.
	 * @param A1 - The address from building
	 * @param Name - Name of building
	 * @param ParkingLotType - The type of parking lot
	 * @param ParkingLotSpace The amount of parking lot space available
	 */
	ClothingStore(Address A1, String Name, 
			String ParkingLotType, int ParkingLotSpace)
	{
		super();
		this.setA1(A1);
		this.Name 				= Name;
		this.ParkingLotType 	= ParkingLotType; 
		this.ParkingLotSpace 	= ParkingLotSpace;
	}
	
	//6
	/**
	 * Pass in address instance variable - 
	 * not as an object and 5 instance variables of 
	 * your choice for the new object.
	 * 
	 * @param StreetAddress - Address for the building
	 * @param State - The state the building is in
	 * @param City - The city the building is in
	 * @param zip - The zip code the building is in
	 * @param Floors - The amount of floors in the building
	 * @param Foundation - The type of foundation in the building
	 * @param Roof - the condition of  the roof of the building
	 * @param Rooms - The amount of rooms in the building
	 * @param length  - the length of the building
	 * @param width - The width of the building
	 * @param Name - The name of the owner of building
	 * @param ParkingLotType
	 * @param ParkingLotSpace
	 */
	ClothingStore(String StreetAddress, String State,
			String City, int zip,
			int Floors, String Foundation,String Roof,
			int Rooms, float length, float width, String Name, 
			String ParkingLotType, int ParkingLotSpace)
	
	{
		super(StreetAddress, State, City, zip,
				Floors, Foundation, Roof,
				Rooms, length, width);
		this.Name 				= Name;
		this.ParkingLotType 	= ParkingLotType; 
		this.ParkingLotSpace 	= ParkingLotSpace;
		
	//Getter and setters
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * @return the parkingLotType
	 */
	public String getParkingLotType() {
		return ParkingLotType;
	}

	/**
	 * @param parkingLotType the parkingLotType to set
	 */
	public void setParkingLotType(String parkingLotType) {
		ParkingLotType = parkingLotType;
	}

	/**
	 * @return the parkingLotSpace
	 */
	public int getParkingLotSpace() {
		return ParkingLotSpace;
	}

	/**
	 * @param parkingLotSpace the parkingLotSpace to set
	 */
	public void setParkingLotSpace(int parkingLotSpace) {
		ParkingLotSpace = parkingLotSpace;
	}
	
	/**
	 * The toString for the variables
	 */
	public String toString()
	{
		String CSV = super.toString() + "|" + Name +"|" 
				+ ParkingLotType + "|" + ParkingLotSpace;
		return CSV;
	}
	
	/**
	* Prints the variables to the console in an orderly fashion
	*/
	public void printAll()
	{
		System.out.println("Name: " +  Name);
		System.out.println("ParkingLotType: " + ParkingLotType);
		System.out.println("ParkingLotSpace: " + ParkingLotSpace);
	
		super.printAll();
	}

}
