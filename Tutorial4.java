import java.util.*;
public class Tutorial4 
{
	static int money;
	static String userName;
	static Scanner in = new Scanner(System.in);
	static Random random  = new Random();
	public static void main(String[] args) 
	{
		System.out.println("Please enter your user name....");
		userName = in.nextLine();
		money = 1000;
		System.out.println("Welcome "+ userName + ".");
		System.out.println("You have: $" + money );
		rolldice();
		
	}
	public static void rolldice()
	{
		System.out.println("Youn have $" + money);
		System.out.println("What number would you like to bet on? (1-6)");
		int betRoll = in.nextInt();
		if (betRoll>6);{
			System.out.println("You do know a Dice only has six sides!!!\n Try again dummy");
			betRoll = in.nextInt();
		}
		if (betRoll<=6);{
		System.out.println("How much do you want to bet?");
		int betAmount = in.nextInt();
		while (betAmount > money) {
			System.out.println("I'm sorry but you done have enough money!\n You have "+money+"$ left. please enter youtr bet.");
			betAmount = in.nextInt();				
		
	}
		int dice;
		dice = random.nextInt(6)+1;
		if (betAmount == dice) {
			System.out.println("Congratulations! you have won " + betAmount*6 +"$");
			money+=(betAmount*6);			
		}
		else {
			System.out.println("You loose! ");
			money-=betAmount;
					
		}
		if (money<=0){
			System.out.println("OOPS! You are broke!");
			System.exit(0);
			}
		else {
			rolldice();
		}
		}
	}
	
}
