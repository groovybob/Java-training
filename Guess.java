import java.util.*;
public class Tutorial3 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome, please enter your name.");
		String userName = in.nextLine();
		System.out.println("please enter your password");
		String userpwd = in.nextLine();
		String password = "groovybob";
		while (!password.equals(userpwd))
		{
			System.out.println("sorry wrong password, please try again.");
			System.out.println("please re-enter your password");
			userpwd = in.nextLine();
		}
		System.out.println("welcome " + userName + " lets have some fun!");
		
		Random random = new Random(10);
		int target = random.nextInt(10);
		System.out.println("Im thinking of a number between 0 and 10.\n can you guess what it is? You have 5 attempts");
		int guess = in.nextInt();
		int n = 0;
		while (guess!=target)
		{
			System.out.println("WRONG!! Thats not the number I was thinking of!! \nTry again " +userName+".");
			guess = in.nextInt();
			n+=1;
			System.out.println("attempt "+ n);
			if (n == 5)
			{System.out.println("Sorry " +userName+" you loose!");
			break;
			}
		if (guess == target)
		{
			System.out.println("WOW " +userName+" Well done you win!!");
		}
		}
	}

}
