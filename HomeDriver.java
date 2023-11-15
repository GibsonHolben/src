/**
 * A simple test case for Home
 * @author Gibson Holben
 * @version 0.0.1
 */
public class HomeDriver 
{

	public static void main(String[] args)
	{
		System.out.println("***************************");
		Home h1 = new Home();
		System.out.println("***************************\n");
		
		System.out.println("***************************");
		Address a1 = new Address("5356 funny street", "Silly city", "LA", 40336);
		Home h2 = new Home(a1, 4);
		
		System.out.println("***************************\n");
		
		
		
		System.out.println("***************************");
		Home h3 = new Home("123 Rainbow lane", "MI", "Detroit",
				48203, 2, "Strong", "Shingles", 4, 14.3f, 23f);
		System.out.println("***************************\n");
	}

}
