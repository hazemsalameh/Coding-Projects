package files;
import java.io.*; 
//the 2 checked lines are all that’s needed to set up file streams
 import java.io.BufferedReader;
 import java.io.FileReader;
public class readingFiles {
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		 String phrase;
		 try {
		 FileReader in = new FileReader("marks.txt"); 
		 
		//create FileReader object
		 BufferedReader readFile = new BufferedReader(in); 
		 
		 //create BufferedReader object "readFile" which buffers the data
		 //read new line
		 int number = 0;
		 int sum = 0;
		 int counter = 0; 
		 int [] marks = new int[8];
		
		 while ((phrase = readFile.readLine()) != null) {
			 number = Integer.parseInt(phrase); //"56" -> 56
			 marks [counter] = number;
			 sum += number; //sum = sum + number 
		 System.out.println(phrase);
		 counter++; //counter += 1; //counter = counter +1;
		 }
		 //use for-loop - print(marks[i] + "/t") to show data
		 for (int i = 0; i < 8; i++) {
			 System.out.println(marks[i] + "/t");
		 }
		 
		 System.out.println("Average mark is:" + (double)sum/counter);
		 System.out.println(" counter / length of data:" + counter);
		 readFile.close();
		 in.close();
		 
		 //this is the minimum catch syntax needed
		 }catch (IOException e) {
		 System.out.println();
		 System.err.println();




	}
	}
}
