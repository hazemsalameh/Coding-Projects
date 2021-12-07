package conditional;
import java.util.Scanner;
public class review3 {
	
	public static void main (String[] args) {
		//Review #3 -Hurricane
		
		//create variables
		int category = 0;
		
		//create Scanner
		Scanner input = new Scanner (System.in);
		
		//ask user for category:
		System.out.println("Which hurricane category (1-5) would you like?");
		String strCategory = input.nextLine();
		category = Integer.parseInt(strCategory);
		
		switch (category) {
		case 1: //if (category == 1){
			System.out.println("Category 1: 74-95mph or 64-82 kt or 119-153 km/hr");
			break;
		case 2: //else if (category == 2) {
			System.out.println("Category 2: 96-110 mph or 83-95 kt or 154-177 km/hr ");
			break;
		case 3:
			System.out.println("Category 3: 111-130 mph or 96-113 kt or 178-209 km/hr");
			break;
		case 4:
			System.out.println("Category 4: 131-155 mph or 114-135 kt or 210-249 km/hr");
			break;
		case 5:
			System.out.println("Category 5: greater than 155 mph or 135 kt or 249 km/hr");
		}
		
	}

}
