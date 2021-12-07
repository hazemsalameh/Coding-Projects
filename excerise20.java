package conditional;
import java.util.Scanner;
public class excerise20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating scanner
		Scanner input = new Scanner (System.in);
		
		// ask for text
		System.out.println("Please enter text");
		String userword = input.nextLine();
		
		//identifying vowels
		int counter =0;
		for (int i=0; i<userword.length(); i++) {
			char ch = userword.charAt(i);
			if (ch== 'a'|| ch== 'A' ||ch== 'e'||ch== 'E'||ch== 'y'||ch== 'Y'||ch== 'i'|| ch== 'I'|| ch== 'o'|| ch== 'O'|| ch== 'u'||ch== 'U'
					) { counter++;
					
					}
		}
		//printout number of vowels
		System.out.println("The number of vowels in" + userword + "is" + counter);

	}

}
