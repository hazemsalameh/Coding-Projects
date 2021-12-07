import java.util.Scanner;

public class chapter4q1 {

	public static void main(String[] args) {
		
		double height =0;
		double time= 0;
		
		Scanner input = new Scanner(System.in);
		
		 System.out.println("Enter a time less than 4.5 seconds:");
		 time = input.nextDouble();
		 
		 height = 100-4.9*time*time;
		 System.out.println("The height of the object is: " + height +"meters");
		
	}

}
