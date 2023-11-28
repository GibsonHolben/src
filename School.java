/**
 * A class that is used to create a school that is
 * based off of the Building class
 * <b>Extends: Building</b>
 * @author <p>Gibson Holben</p>
 * @version 0.0.0.5
 */
public class School extends Building 
{
	
	//Instance vars
	/**The schools name
	 * Default = blank*/
	private String 	Name = "";
	
	/**The number of clasrooms in the school
	 * Default = 1*/
	private short 	numOfClassrooms = 1;
	
	/**The number of stuents in each class
	 * Default = 1*/
	private short 	numOfStudentsPerClass = 1;
	
	/**The number of parking spaces in the parking lot
	 * Deafult = 1*/
	private short 	numOfParkingLotSpaces = 1;
	
	/**The type of parking lot the school has
	 * Default = Blank*/
	private String 	ParkingLotType = "";
	
	

	
	//Constructor 1 (Building)
	/**
	 * The default constructor
	 */
	School()
	{
		super();
	}
	
	//Constructor 2 (Building)
	/**
	* Overload constructor that calls the 2nd building constructor
	* @param a1 a refferance to the address class
	* @param Floors  how many floors that are in the building.
	*/
	School(Address a1, int Floors)
	{
		super(a1, Floors);
		
	}
	
	//Construcor 3 (Building)
	/**
	* Calls the 3rd constructor from the Building class
	* @param StreetAddress The address of the building
	* @param State The state that the building is in
	* @param City The city the building is in
	* @param zip The zip code for the building
	* @param Floors How many floors that are in the building
	* @param Foundation	The type of foundation for the building
	* @param Roof The type of roof on the building
	* @param Rooms How many rooms that are in the building
	* @param length The length of the building
	* @param width The width of the building
	*/
	School(String StreetAddress, String State, String City,
				int zip,
				int Floors, String Foundation,String Roof,
				int Rooms, float length, float width)
	{
		super(StreetAddress, State, City,
				zip, Floors, Foundation, Roof,
				Rooms, length, width);

	}
	
	
	//Constructor 4
	/**
	 * Constructor that takes in an existing address and
	 * creates a building + school with the passed in variables
	 * @param a1 the address object
	 * @param Floors  How many floors that are in the building
	 * @param Foundation The type of foundation for the building
	 * @param Roof The type of roof on the building
	 * @param Rooms How many rooms that are in the building
	 * @param length  The length of the building
	 * @param width the width of the building
	 * @param Name the name of the school
	 * @param numOfParkingLotSpaces the number of parking 
	 * spaces in the parking lot
	 * @param ParkingLotType the type of parking lot
	 * that the school has
	 */
	School(Address a1,
			int Floors,
			String Foundation,
			String Roof,
			int Rooms, 
			float length, 
			float width,
			String Name,
			short numberOfStudents,
			short Numberofclassrooms, 
			short numOfParkingLotSpaces, 
			String ParkingLotType)
	{
		super(a1, Floors);
		
		
		this.setFoundation(Foundation);
		this.setRoof(Roof);
		this.setRooms(Rooms);
		this.setLength(length);
		this.setWidth(width);
		
		this.Name = Name;
		this.numOfParkingLotSpaces = numOfParkingLotSpaces;
		this.ParkingLotType = ParkingLotType;
		this.numOfStudentsPerClass =  numberOfStudents;
		this.numOfClassrooms = Numberofclassrooms;
	}
	
	
	
	
	
	//Constructor 5 (done)
	/**
	 * Constructor that takes in an existing
     * address and the school variables
	 * @param a1 The address
	 * @param Floors the amount of floors
	 * @param Name the name of the school 
	 * @param numOfParkingLotSpaces the amount of 
	 * parking lot spaces
	 * @param ParkingLotType the type of parking 
	 * lot the school has
	 */
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
	

	
	
	//Constructor 6 (done)
	/**
	 * Overloaded constructor that creates a school and takes 
	 * in all the address variables, the building variables,
	 * and the school variables
	 * 
	 * @param StreetAddress The new StreetAddress
	 * @param City The new City
	 * @param State the state that the building is in
	 * @param zip The new zipCode
	 * @param Floors How many floors that are in the building.
	 * @param Foundation The type of foundation for the building
	 * @param Roof The type of roof on the building.
	 * @param Rooms How many rooms that are in the building.
	 * @param length The length of the building.
	 * @param width The width of the building.
	 * @param Name The name of the school
	 * @param numOfParkingLotSpaces The number of
	 * parking spaces in the parking lot
	 * @param ParkingLotType THe type of parking lot 
	 * @param numOfStudentsPerClass The number
	 *  of students per classroom
	 * @param numOfClassrooms The number of classrooms in the school
	 */
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

	

	
	//Getters and setters
	/**
	 * Returns name 
	 * @return the name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * Sets name
	 * @param name the new name 
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * Returns numOfClassrooms 
	 * @return the numOfClassrooms
	 */
	public short getNumOfClassrooms() {
		return numOfClassrooms;
	}

	/**
	 * Sets numOfClassrooms
	 * @param numOfClassrooms the new numOfClassrooms 
	 */
	public void setNumOfClassrooms(short numOfClassrooms) {
		this.numOfClassrooms = numOfClassrooms;
	}

	/**
	 * Returns numOfStudentsPerClass 
	 * @return the numOfStudentsPerClass
	 */
	public short getNumOfStudentsPerClass() {
		return numOfStudentsPerClass;
	}

	/**
	 * Sets numOfStudentsPerClass
	 * @param numOfStudentsPerClass the new numOfStudentsPerClass 
	 */
	public void setNumOfStudentsPerClass(short numOfStudentsPerClass) {
		this.numOfStudentsPerClass = numOfStudentsPerClass;
	}

	/**
	 * Returns numOfParkingLotSpaces 
	 * @return the numOfParkingLotSpaces
	 */
	public short getNumOfParkingLotSpaces() {
		return numOfParkingLotSpaces;
	}

	/**
	 * Sets numOfParkingLotSpaces
	 * @param numOfParkingLotSpaces the new numOfParkingLotSpaces 
	 */
	public void setNumOfParkingLotSpaces(short numOfParkingLotSpaces) {
		this.numOfParkingLotSpaces = numOfParkingLotSpaces;
	}

	/**
	 * Returns parkingLotType 
	 * @return the parkingLotType
	 */
	public String getParkingLotType() {
		return ParkingLotType;
	}

	/**
	 * Sets parkingLotType
	 * @param parkingLotType the new parkingLotType 
	 */
	public void setParkingLotType(String parkingLotType) {
		ParkingLotType = parkingLotType;
	}
	
	
	//Methods
	/**
	 * Returns the variables of all the superclass
	 * and the superclasses hasA is a CSV format
	 * @return super.getA1().toString() + super.toString() 
	 * + schools variables 
	 * Deliminator = |
	 */
	public String toString()
	{
		String s1 = Name + "|" + numOfClassrooms +
				"|" + numOfStudentsPerClass + "|"
				+ numOfParkingLotSpaces + "|" + ParkingLotType; 
		return super.toString() + "|" + s1 ;
	}


	/**
	 * Prints all the variables from the superclass
	 *  and the superclasses hasA in an ordrly fassion
	 */
	public void printAll()
	{
		super.printAll();
		System.out.println("num Of Parking Lot Spaces: " +
							numOfParkingLotSpaces);
		System.out.println("Parking Lot Type: " 		 + 
							ParkingLotType);
		System.out.println("num Of Classrooms: " 		 + 
							numOfClassrooms);
		System.out.println("num Of Students Per Class: " + 
							numOfStudentsPerClass);
	}
	
	
	/**
	 * Calculates the amount of students in the school
	 * @return numOfStudentsPerClass * numOfClassrooms
	 */
	public long calcTotalStudents()
	{
		return numOfStudentsPerClass * numOfClassrooms;
	}
}
