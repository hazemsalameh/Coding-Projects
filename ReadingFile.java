package array;
import java.io.*; //the 2 checked lines are all that’s needed to set up file streams

import java.io.BufferedReader;

import java.io.FileReader;
public class ReadingFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phrase;
		try {

	        FileReader in = new FileReader("schoolfile.txt"); //create FileReader object

	        BufferedReader readFile = new BufferedReader(in);

	        //create BufferedReader object which buffers the data

	        while ((phrase = readFile.readLine()) != null) { //read new line

	            System.out.println(phrase);

	        }



	        readFile.close();

	        in.close();

	    }catch (IOException e) { //this is the minimum catch syntax needed

	        System.out.println("Problem Reading File");

	        System.err.println("IOException " + e.getMessage());



	}

	}

}
