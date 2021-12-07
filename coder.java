package array;
import java.util.Scanner;
public class coder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		String text = "";
		System.out.println("Enter your text:");
		text = input.nextLine();
		int lengthOfText = text.length();
		int [] coded = new int[lengthOfText];
		
		for(int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			int asciiNum = (int)letter;
			if(asciiNum >= 97 || asciiNum <=120) {
				coded[i] = asciiNum + 2;	
			}
			if (asciiNum == 121 || asciiNum ==122) {
				coded [i] = asciiNum - 24;
			}
		}
for(int j = 0; j < text.length(); j++) {
	
	char Letter = (char) coded[j];
	System.out.print (Letter);
}
	}

}
