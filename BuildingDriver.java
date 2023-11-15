public class BuildingDriver
{

	public static void main(String[] args)
	{
		//default constructor
		Building BG1 = new Building();
		//Testing
		Building BG2 = new Building("123 Rainbow lane", "MI", "Detroit", 48203, 2);
		
		Building BG3 = new Building("123 Rainbow lane", "MI", "Detroit",
		48203, 2, "Strong", "Shingles", 4, 14.3f, 23f);
		
		
		
		//Address
		System.out.println(BG1.getA1());
		Address A2 = new Address("4934 Pear Lane", "Clarckton", "MI", 48353);
		BG1.setA1(A2);
		System.out.println(BG1.getA1());
		
		//floors
		System.out.println(BG1.getFloors());
		BG1.setFloors(5);
		System.out.println(BG1.getFloors());
		
		//Foundation
		System.out.println(BG1.getFoundation());
		BG1.setFoundation("Concrete");
		System.out.println(BG1.getFoundation());
		
		//rooms
		System.out.println(BG1.getRooms());
		BG1.setRooms(10);
		System.out.println(BG1.getRooms());
		
		//Roof
		System.out.println(BG1.getRoof());
		BG1.setRoof("Pointy");
		System.out.println(BG1.getRoof());
		
		//width
		System.out.println(BG1.getWidth());
		BG1.setWidth(33.0f);
		System.out.println(BG1.getWidth());
		
		//length
		System.out.println(BG1.getLength());
		BG1.setLength(5.0f);
		System.out.println(BG1.getLength());
		
		
		System.out.println(BG3.toString());
		
		BG3.printAll();
		
		System.out.println(BG3.getWidth());
		System.out.println(BG3.getLength());
		System.out.println("Sqrft is: " + BG3.calcsqft());
		
		//Getting from address
		System.out.println(BG1.getA1().getCity());
		Address A3 = new Address("4934 Pear Lane", "Lake Orion", "MI", 48353);
		BG1.setA1(A3);
		System.out.println(BG1.getA1().getCity());
	}

}

