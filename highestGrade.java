package conditional;
import java.util.Scanner;
public class highestGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//add scanner
		Scanner input = new Scanner(System.in);
		
		int [] grades = new int[5];
		for (int i= 0;  i < 5; i++) {
			System.out.println("Enter Grades(" + (i+1)+"):");
			grades[i] = Integer.parseInt(input.nextLine());
		
		}
		 int compare = grades[0];
		 for (int j = 1; j<5 ; j++) {
			 if( compare < grades[j] ) {
				 compare = grades[j];
				 System.out.println("changed compare to:" +compare);
			 }
			 else {
				 //
			 }
		 }
		 System.out.println("Highest Grade is:" + compare);

	}


}