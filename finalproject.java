package conditional;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class finalproject {

	public static void main(String[] args) throws IOException {
		 {
				
				// variables 
				File text = new File ("textfile (1).txt"); 
				FileReader read = new FileReader (text); 
				BufferedReader buffer = new BufferedReader (read); 
				
				Scanner input = new Scanner (System.in); 
				String line; 
				int option; 
				
				String [] name = new String [7]; 
				double[] age = new double [7]; 
				String [] children = new String [7]; 
				
				double[] inputArray = new double [7]; 
				String inputLine; 
				
				double tempRating =0; 
				String tempName,tempAge , tempChildren; 
				
				int pass =0, n=20; 
				boolean sortedflag = false; 
				
				//inputting data 
				for (int x=0; x<20; x++)
				{ inputLine = buffer.readLine(); 
				//input = inputLine.split(" "); 
				age [x]= inputArray [2]; 
				//children [x] = Double.parseDouble(inputArray [2])); 
				
				}
				
				
			}


		
	}
}
