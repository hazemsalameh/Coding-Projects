package conditional;
import java.util.Scanner;
public class excercise10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//make scanner
		Scanner input = new Scanner (System.in);
		
		//RECTANGULAR PRISM
		//length
		System.out.println("Rectangular Prism");
		System.out.println("What is the length of the rectangualr prism?");
		String number= input.nextLine();
		double number1 = Double.parseDouble(number);
		//width
		System.out.println("What is the width of the rectangular prism?");
		String number2 = input.nextLine();
		double number3 = Double.parseDouble(number2);
		//height
		System.out.println("What is the height of the rectangualr prism?");
		String number4 = input.nextLine();
		double number5 = Double.parseDouble(number4);
		//output
		System.out.println("The volume of your rectangular prism is:");
		System.out.println(number1*number3*number5);
		
		//SPHERE
		System.out.println("Sphere");
		System.out.println("What is the radius of the sphere?");
		String radius = input.nextLine();
		double radius1 = Double.parseDouble(radius);
		double diameter = radius1 + 2;
		//output
		System.out.println("The volume is:"+(3.14* diameter*diameter*diameter)/6);
		
		//CUBE
		System.out.println("Cube");
		//length
		System.out.println("What is the length of each side of the cube?");
		String side = input.nextLine();
		double side1 = Double.parseDouble(side);
		//output
		System.out.println("The volume of the cube is:"+(side1*side1*side1));
		
		//close scanner
		input.close();
				
		

	}

}
