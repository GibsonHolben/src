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
	
	//Constructors
	/**
	 * The default constructor
	 */
	School()
	{
		super();
	}
	
	
	/**
	 * Overloaded constructor that creates a School with
	 *  a address and the parking lot
	 *  
	 * @param a1 The address object
	 * @param Floors The number of floors that the building has
	 * @param Name The name of the school
	 * @param numOfParkingLotSpaces The number of
	 * parking spaces in the parking lot
	 * @param ParkingLotType THe type of parking lot 
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
	 * @param numOfStudentsPerClass The number of students per classroom
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
	 * 
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
	 * @return the numOfClassrooms
	 */
	public short getNumOfClassrooms() {
		return numOfClassrooms;
	}


	/**
	 * @param numOfClassrooms the numOfClassrooms to set
	 */
	public void setNumOfClassrooms(short numOfClassrooms) {
		this.numOfClassrooms = numOfClassrooms;
	}


	/**
	 * @return the numOfStudentsPerClass
	 */
	public short getNumOfStudentsPerClass() {
		return numOfStudentsPerClass;
	}


	/**
	 * @param numOfStudentsPerClass the numOfStudentsPerClass to set
	 */
	public void setNumOfStudentsPerClass(short numOfStudentsPerClass) {
		this.numOfStudentsPerClass = numOfStudentsPerClass;
	}


	/**
	 * @return the numOfParkingLotSpaces
	 */
	public short getNumOfParkingLotSpaces() {
		return numOfParkingLotSpaces;
	}


	/**
	 * @param numOfParkingLotSpaces the numOfParkingLotSpaces to set
	 */
	public void setNumOfParkingLotSpaces(short numOfParkingLotSpaces) {
		this.numOfParkingLotSpaces = numOfParkingLotSpaces;
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
	 * Returns the variables of all the superclass
	 *  and the superclasses hasA is a CSV format
	 * @return super.getA1().toString() + super.toString() 
	 * + schools variables
	 */
	public String toString() 
	{
		String s1 = Name + "|" + numOfClassrooms +
				"|" + numOfStudentsPerClass + "|"
				+ numOfParkingLotSpaces + "|" + ParkingLotType; 
		return super.getA1().toString() + super.toString() + s1 ;
	}

	/**
	 * Prints all the variables from the superclass
	 *  and the superclasses hasA in an ordrly fassion
	 */
	public void printAll()
	{
		super.getA1().printAll();
		super.printAll();
		System.out.println("numOfParkingLotSpaces: " + numOfParkingLotSpaces);
		System.out.println("ParkingLotType: " + ParkingLotType);
		System.out.println("numOfClassrooms: " + numOfClassrooms);
		System.out.println("numOfStudentsPerClass: " + numOfStudentsPerClass);
	}
	
	
	
	public long calcTotalStudents()
	{
		long l = numOfStudentsPerClass * numOfClassrooms;
		return l;
	}
	
}
