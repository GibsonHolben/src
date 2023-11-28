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
		Address A1 = new Address("4934 Pear2 Lane",
									"Clarkston1", "MI", 48353);
		Address A2 = new Address("1654 fruity Lane", 
									"Clarkston2", "MI", 48342);
		Address A3 = new Address("948734 absurde Lane", 
									"Clarkston3", "MI", 75353);
		//Constructor1
		System.out.println("**************************************S1");
		School s1 = new School();
		System.out.println(s1.toString());
		System.out.println("**************************************\n");
		
		//Constructor2
		System.out.println("**************************************S2");
		School s2 = new School(A1, 6);
		System.out.println(s2.toString());
		System.out.println("**************************************\n");
		
		//Constructor3
		System.out.println("**************************************S3");
		School s3 = new School("12345 happy road", "MI", 
					"Clarkston", 58395, 4, "Strong",
					"Shingles", 45, 24.5f, 24.8f);
		System.out.println(s3.toString());
		System.out.println("len:" + s3.getLength());
		System.out.println("wid:" + s3.getWidth());
		System.out.println("Calc sqft: " + s3.calcsqft());
		System.out.println("**************************************\n");
		
		//Constructor4
		System.out.println("**************************************S4");
		School s4 = new School(A2,
				24, "Weak", "Flat", 46, 13.5f, 
				26.7f, "OSTC", (short) 44, (short) 12,(short)  56, "Small");
		System.out.println(s4.toString());
		System.out.println("**************************************\n");

		
		
		//Constructor5
		System.out.println("**************************************S5");
		School s5 = new School(A3, 35, "GIBSON SCHOOL", (short) 32, "Big");
		System.out.println(s5.toString());
		System.out.println("**************************************\n");
		
		//Constructor6
		System.out.println("**************************************S6");
		School s6 = new School("532 gibson road", 
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
		
		
		//toString
		System.out.println(s6.toString());

		//print all
		System.out.println("\n");
		System.out.println("***********************PrintAll");
		s6.printAll();
		System.out.println("***********************PrintAll\n");
		
		//calc total
		System.out.println("Testing the calcTotalStudents");
		System.out.println("Number of classrooms: " +
								s6.getNumOfClassrooms());
		System.out.println("number of stuents per classroom: " +
								s6.getNumOfStudentsPerClass());
		System.out.println("The total number of students is: " +
								s6.calcTotalStudents());
		
		//getters and setters
		testGettersandSetters(s6);
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
		s.setName("NewNameSchool");
		System.out.println(s.getName());
		
		System.out.println(s.getNumOfParkingLotSpaces());
		s.setNumOfParkingLotSpaces((short) 123);
		System.out.println(s.getNumOfParkingLotSpaces());
		
		System.out.println(s.getParkingLotType());
		s.setParkingLotType("BIG");
		System.out.println(s.getParkingLotType());
		
		System.out.println(s.getNumOfClassrooms());
		s.setNumOfClassrooms((short) 24);
		System.out.println(s.getNumOfClassrooms());
		
		System.out.println(s.getNumOfStudentsPerClass());
		s.setNumOfStudentsPerClass((short) 20);
		System.out.println(s.getNumOfStudentsPerClass());
	}

}
