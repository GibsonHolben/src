/**
 * The code below is used to make a building class
 * @author CTEWilliamsC92
 *
 */

public class Building
{
	
	/**
	* Shared value for total number of
	* Building is created.
	* Default is 0
	*/
	private static int 			totalNumberofBuilding = 0;
	
	
	//instance variables
	
	/**
	* Address for building
	*/
	private Address 			A1;
	
	/**
	*
	* Default is 1.
	*/
	private int 				floors = 1;
	/**
	*
	* Default is Basement.
	*/
	private String 				Foundation = "Basement";
	
	/**
	* This is the ID for the constructor.
	*/
	private final int 			ID;
	
	/**
	*
	* Default is 6.
	*/
	private int 				rooms = 6;
	
	/**
	*
	* Default is Roof.
	*/
	private String 				Roof = "Roof";
	
	/**
	*
	* Default is 10.
	*/
	private float 				width = 10;
	
	/**
	*
	* Default is 30.
	*/
	private float 				length = 30;
	
	/**
	* Default Constructor
	* Adds up the number of Composers
	*
	*/
	Building()
	{
		Building.totalNumberofBuilding = Building.totalNumberofBuilding +1;
		ID = Building.totalNumberofBuilding;
		A1 = new Address();
	}
	/**
	* Overload constructor
	*
	* @param StreetAddress  - the address of the building .
	* @param State 			- the state that the building is in.
	* @param City 			- the city the building is in.
	* @param zip 			- the zip code for the building.
	* @param Floors 		- how many floors that are in the building.
	*/
	Building(String StreetAddress, String State, String City, int zip, int Floors)
	{
		Building.totalNumberofBuilding = Building.totalNumberofBuilding +1;
		ID = Building.totalNumberofBuilding;
		A1 = new Address(StreetAddress,State,City,zip);
		this.floors = Floors;
		//System.out.println("Stop");
	}
	
	/**
	*
	* @param StreetAddress 	- The address of the building .
	* @param State 			- The state that the building is in.
	* @param City 			- The city the building is in.
	* @param zip 			- The zip code for the building.
	* @param Floors 		- How many floors that are in the building.
	* @param Foundation		- The type of foundation for the building
	* @param Roof 			- The type of roof on the building.
	* @param Rooms 			- How many rooms that are in the building.
	* @param length 		- The length of the building.
	* @param width 			- The width of the building.
	*/
	Building(String StreetAddress, String State, String City, int zip,
	int Floors, String Foundation,String Roof,
	int Rooms, float length, float width)
	{
		Building.totalNumberofBuilding = Building.totalNumberofBuilding +1;
		ID = Building.totalNumberofBuilding;
		A1 = new Address(StreetAddress,State,City,zip);
		this.floors = Floors;
		this.Foundation = Foundation;
		this.Roof = Roof;
		this.rooms = Rooms;
		this.length = length;
		this.width = width;
		//System.out.println("Stop");
	}
	
	/**
	* Getter for TotalNumberofbuilding
	* @return TotalNumberofbuilding
	*/
	public static int getTotalNumberofBuilding()
	{
		return totalNumberofBuilding;
	}
	
	/**
	* Setter for totalNumberofBuilding
	* @param totalNumberofBuilding is the totalNumberofBuilding to set
	*/
	public static void setTotalNumberofBuilding(int totalNumberofBuilding)
	{
		Building.totalNumberofBuilding = totalNumberofBuilding;
	}
	
	/**
	* Getter for address
	* @return the address
	*/
	public Address getA1()
	{
		return A1;
	}
	
	/**
	* Setter for address
	* @param a1 is the a1 to set
	*/
	public void setA1(Address a1)
	{
		A1 = a1;
	}
	
	/**
	* Getter for floors
	* @return floors
	*/
	public int getFloors()
	{
		return floors;
	}
	
	/**
	* Setter for floors
	* @param floors is the floors to set
	*/
	public void setFloors(int floors)
	{
		this.floors = floors;
	}
	
	/**
	* Getter for Foundation
	* @return the foundation
	*/
	public String getFoundation()
	{
		return Foundation;
	}
	/**
	* Setter for foundation
	* @param foundation is the foundation to set
	*/
	public void setFoundation(String foundation)
	{
		Foundation = foundation;
	}
	
	/**
	* Getter for rooms
	* @return  the rooms
	*/
	public int getRooms()
	{
		return rooms;
	}
	
	/**
	* Setter for rooms
	* @param rooms is the rooms to set
	*/
	public void setRooms(int rooms)
	{
		this.rooms = rooms;
	}
	
	/**
	* Getter for the roof
	* @return the roof
	*/
	public String getRoof()
	{
		return Roof;
	}
	
	/**
	* Setter for the roof
	* @param roof is the roof to set
	*/
	public void setRoof(String roof)
	{
		Roof = roof;
	}
	
	/**
	* Getter for the width
	* @return the width
	*/
	public float getWidth()
	{
		return width;
	}
	
	/**
	* Setter for the width
	* @param width is the width to set
	*/
	public void setWidth(float width)
	{
		this.width = width;
	}
	
	/**
	* Getter for the length
	* @return the length
	*/
	public float getLength()
	{
		return length;
	}
	
	/**
	* Setter for the length
	* @param length is the length to set
	*/
	public void setLength(float length)
	{
		this.length = length;
	}
	
	/**
	* Getter for the id
	* @return the id
	*/
	public int getID()
	{
		return ID;
	}
	
	/**
	* The toString for the variables
	*/
	public String toString()
	{
		 String CSV = A1.toString() + "|" + floors +
		 "|" + Foundation + "|" + rooms + "|"
		 + Roof + "|" + width + "|" + length + ""
		  + "|" + ID;
		 return CSV;
	}
	
	/**
	* Prints the variables to the console in an orderly fashion
	*/
	public void printAll()
	{
		System.out.println("Rooms: " +  rooms);
		System.out.println("Foundation: " + Foundation);
		System.out.println("Roof: " + Roof);
		System.out.println("Width: " + width);
		System.out.println("Length: " + length);
		System.out.println("floors: " + floors);
		System.out.println("ID: " + ID);
		
		A1.printAll();
	}
	
	/**
	* Returns the square feet of the building.
	* @return width * length
	*/
	public float calcsqft()
	{
		return length * width;
	}

}