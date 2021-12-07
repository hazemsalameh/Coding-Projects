import java.util.Scanner;
public class Donations {

	public static void main(String[] args) {
		// Task: Give the user 2 chances to donate to a charity. At the end, state 
		// the total amount they have donated.
		//Karel dog = new Karel();
		Scanner input = new Scanner(System.in);
		System.out.println("State your 1st donation amount:");
		String StrMoney = input.nextLine(); //method
		double money = Double.parseDouble(StrMoney);
		System.out.println(money);
		System.out.println("State your 2nd donation amount:");
		String Money = input.nextLine(); //method
		double coins = Double.parseDouble(Money);
		System.out.println(coins); 
		double cent = money+coins;
		System.out.println ("your total donation is:" + cent);
		System.out.println("Thank you for donating:" +cent);
	}
}
