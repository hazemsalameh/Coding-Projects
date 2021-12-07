import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hey there can I get your child's name?");
		String name = input.nextLine();
		System.out.println("and their age?");
		String age = input.nextLine();
		String status = "";
		String pottyTrained = "";
		String diet = "";
		int ageInt = Integer.parseInt(age);
		if(ageInt <=3) {
			System.out.println("is your child potty trained?");
			 pottyTrained = input.nextLine();
			status = "Toddler";
			System.out.println("what about your child's diet?");
		 diet = input.nextLine();
		}
		else {
			pottyTrained = "yes";
			status = "Child";
			System.out.println("what about your child's diet?");
			 diet = input.nextLine();
		}
		
		
		
		
		
		System.out.println(name);
		System.out.println(age);
		System.out.println("Status: " + status);
		System.out.println("Diet: " + diet);
		if (pottyTrained.equals("yes") || pottyTrained.equals("Yes")){
				System.out.println("Toilet Trained: Completed");

	}
		else {
			System.out.println("Toilet Trained: Incompleted");
		}
		
		
			}
			
			
			
		

}

