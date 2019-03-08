import java.util.*;
public class Tutorial3 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome! Please enter your name!");
		String userName = in.nextLine();
		System.out.println("Please enter the passcode of the user " + userName + ".");
		int passcodeFromUser=in.nextInt();
		int passcode = 7001;
		if (passcodeFromUser == passcode)
		{
			System.out.println("Welcome " + userName + "!");
			Random random = new Random(userName.hashCode());// basing random generator on a seed makes it repeatable
			System.out.println("Here are your random numbers:");
			System.out.println(random.nextInt(100) + ", " + 
			random.nextInt(100) + ", " + 
			random.nextInt(100));
		}
		else
		{
			Random random = new Random(userName.hashCode());
			System.out.println("Access denied!");
			System.out.println("Here's an odd random number for you...");
			System.out.println(random.nextInt(6)+10);//random number between 5 and 15
		}
	}
}