/**
 * A test case for the School class
 * @author Gibson Holben
 * @version 0.0.0.3
 *
 */
public class SchoolDriver
{

	public static void main(String[] args)
	{
		System.out.println("**************************************S1");
		//Testing the default constructors
		School s1 = new School();
		System.out.println("**************************************\n");
		
		System.out.println("**************************************S2");
		//Testing the middle constructor
		Address A1 = new Address("4934 Pear2 Lane", "Clarkston2", "MI", 48353);
		School s2 = new School(A1, 4, "OSTC", (short) 130, "Concreete");
		System.out.println("**************************************\n");
		
		
		System.out.println("**************************************S3");
		//Testing the main constructor
		School s3 = new School("532 gibson road", 
								"MI",
								"Gibsonville",
								95724,
								4,
								"Strong",
								"Flat",
								26,
								14.5f,
								74.1f,
								"GibsonSmartSchool",
								(short) 345,
								"asphalt",
								(short) 14,
								(short) 18);
		
		
		System.out.println(s3.toString());
		
		System.out.println("Testing printAll");
		
		s3.printAll();
		
		System.out.println("Testing the calcTotalStudents");
		System.out.println("Number of classrooms: " + s3.getNumOfClassrooms());
		System.out.println("number of stuents per classroom: " + s3.getNumOfStudentsPerClass());
		System.out.println("The total number of students is: " + s3.calcTotalStudents());
		
		 testGettersandSetters(s3);
		System.out.println("**************************************\n");

	}
	
	/**
	 * Tests the getters and setters
	 * @param s the School that the test is run on
	 */
	public static void testGettersandSetters(School s)
	{
		System.out.println("Getters / setters");
		System.out.println(s.getName());
		System.out.println(s.getNumOfParkingLotSpaces());
		System.out.println(s.getParkingLotType());
		System.out.println(s.getNumOfClassrooms());
		System.out.println(s.getNumOfStudentsPerClass());
		
		s.setName("NewNameSchool");
		s.setNumOfParkingLotSpaces((short) 123);
		s.setParkingLotType("BIG");
		s.setNumOfClassrooms((short) 24);
		
		System.out.println(s.getName());
		System.out.println(s.getNumOfParkingLotSpaces());
		System.out.println(s.getParkingLotType());
		System.out.println(s.getNumOfClassrooms());
		System.out.println(s.getNumOfStudentsPerClass());
	}

}
