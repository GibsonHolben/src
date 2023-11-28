/**
 * A simple test case for Home
 * @author Gibson Holben
 * @version 0.0.1
 */
public class HomeDriver 
{

	public static void main(String[] args)
	{
		System.out.println("***************************H1");
		Home h1 = new Home();
		System.out.println(h1.toString());
		System.out.println("***************************\n");
		
		
		System.out.println("***************************H2");
		Address a1 = new Address("5356 funny street", 
									"Silly city", "LA", 40336);
		Home h2 = new Home(a1, 4);
		System.out.println(h2.toString());
		System.out.println("***************************\n");
		
		
		System.out.println("***************************H3");
		Home h3 = new Home("123 Rainbow lane", "MI", "Detroit",
							48203, 2, "Strong", "Shingles",
								4, 14.3f, 23f);
		System.out.println(h3.toString());
		System.out.println("***************************\n");
		
		
		System.out.println("***************************H4");
		Address a2 = new Address("52347 boring Street", 
								"useless city", "FL", 53454);
		Home h4 = new Home(a2, 2, "Strong", "Shingles", 
				9, 19.7f, 12.87f,
				"Concreete", false, (byte) 4);
		System.out.println(h4.toString());
		System.out.println("***************************\n");
		
		
		System.out.println("***************************H5");
		Address a3 = new Address("5243 progrmmer Street",
									"codeing city", "MI", 53454);
		Home h5 = new Home(a3, "Brick", "Flat", true);
		System.out.println(h5.toString());
		System.out.println("***************************\n");
		
		
		//substitution method
		System.out.println("***************************H6");
		Home h6 = new Home(new Address("5243 happy road",
							"sad city", "SD", 27734), "Soft", 
								"pointy", true);
		System.out.println(h6.toString());
		System.out.println("***************************\n");
		

		System.out.println("***************************H7");
		Home h7 = new Home("Funny Road", "MI", "Funny city",
						24532, 24.5f, 5, "Weak", "Bricks", false);
		System.out.println(h7.toString());
		System.out.println("***************************\n");
	}

}
