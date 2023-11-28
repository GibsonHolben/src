
public class ClothingStoreDriver 
{

	public static void main(String[] args) 
	{
		Address A2 = new Address("4934 Pear Lane", 
				"Clarkston", "MI", 48353);
		
		ClothingStore CS1 = new ClothingStore();
		System.out.println("Stop");	
		
		ClothingStore CS2 = new ClothingStore(A2, 7);
		
		
		ClothingStore CS3 = new ClothingStore("5282 Main Road", 
												"MI", 
												"detroit", 
												48223, 
												2,
												"new",
												"good",
												3,
												80f,
												20f);
		

		ClothingStore CS4 = new ClothingStore(A2, 4,
				"old", "new", 4, 23f,54f, "Cam", "asphalt", 4);
		
		//String StreetAddress, String State, String City, int zip,
		//int Floors, String Foundation,String Roof,
		//int Rooms, float length, float width, String Name, 
		//String ParkingLotType, int ParkingLotSpace
		
		ClothingStore CS5 = new ClothingStore(A2,  4,
												"old",
												"new",
												4,
												23f,
												54f, 
												"Cam", 
												"asphalt",
												4);

		
		ClothingStore CS6 =  new ClothingStore("5282 Main Road", "MI", 
									"detroit", 48223, 2, "new", "good",
									3, 80f, 20f, "Cam", "asphalt", 4);
		
		//print all
		CS6.printAll();
		
		//toString
		System.out.println(CS6.toString());	
		
		//test getters and setters
		CS6.setName("foot locker");
		System.out.println(CS6.getName());	
		System.out.println(CS6.getName());
		
		CS6.setParkingLotSpace(5);
		System.out.println(CS6.getParkingLotSpace());	
		System.out.println(CS6.getParkingLotSpace());
		
		CS6.setParkingLotType("mud");
		System.out.println(CS6.getParkingLotType());
		System.out.println(CS6.getParkingLotType());
		
		
		System.out.println("Stop");	
	}

}
