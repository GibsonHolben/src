public class BuildingDriver
{

	public static void main(String[] args)
	{
		Building BG1 = new Building();
		//Testing
		Building BG2 = new Building("123 Rainbow lane", "MI", "Detroit", 48203, 2);
		
		Building BG3 = new Building("123 Rainbow lane", "MI", "Detroit",
		48203, 2, "Strong", "Shingles", 4, 14.3f, 23f);
		
		
		
		//***********************************************************
		System.out.println("GETTERS AND SETTERS");
		System.out.println("**********************************");
		System.out.println(BG1.getA1());
		Address A2 = new Address("4934 Pear Lane", "Clarkston", "MI", 48353);
		BG1.setA1(A2);
		System.out.println(BG1.getA1());
		System.out.println(BG1.getFloors());
		BG1.setFloors(5);
		System.out.println(BG1.getFloors());
		System.out.println(BG1.getFoundation());
		BG1.setFoundation("Concrete");
		System.out.println(BG1.getFoundation());
		System.out.println(BG1.getRooms());
		BG1.setRooms(10);
		System.out.println(BG1.getRooms());
		System.out.println(BG1.getRoof());
		BG1.setRoof("Pointy");
		System.out.println(BG1.getRoof());
		System.out.println(BG1.getWidth());
		BG1.setWidth(33.0f);
		System.out.println(BG1.getWidth());
		System.out.println(BG1.getLength());
		BG1.setLength(5.0f);
		System.out.println(BG1.getLength());
		System.out.println("**********************************\n");
		
		
		
		//***********************************************************
		System.out.println("toString");
		System.out.println("**********************************");
		System.out.println(BG3.toString());
		System.out.println("**********************************\n");
		
		
		
		//***********************************************************
		System.out.println("printAll");
		System.out.println("**********************************");
		BG3.printAll();
		System.out.println("**********************************\n");
		
		
		
		//***********************************************************
		System.out.println("calcSqrFt");
		System.out.println("**********************************");
		System.out.println(BG3.getWidth());
		System.out.println(BG3.getLength());
		System.out.println("Sqrft is: " + BG3.calcsqft());
		System.out.println("**********************************\n");
		
		
		
		
		//***********************************************************
		System.out.println("Getting from address");
		System.out.println("**********************************");
		System.out.println(BG1.getA1().getCity());
		Address A3 = new Address("4934 Pear Lane", "Lake Orion", "MI", 48353);
		BG1.setA1(A3);
		System.out.println(BG1.getA1().getCity());
		System.out.println("**********************************\n");
	}

}

