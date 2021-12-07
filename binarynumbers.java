package conditional;

import java.util.Scanner;

public class binarynumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		//initiate Scanner
				Scanner input = new Scanner(System.in);
				
				//make variables
				int decimal = 0;
				int inputDecimal = 0;
				
				//two to the power of number (e.g. ten, nine, etc)
				int ten = 0;
				int nine = 0;
				int eight = 0;
				int seven = 0;
				int six = 0;
				int five = 0;
				int four = 0;
				int three = 0;
				int two = 0;
				int one = 0;
				
				//ask user for any decimal under 1024
				System.out.println("Enter a decimal under 1024: ");
				String strDecimal = input.nextLine();
				decimal = Integer.parseInt(strDecimal);
				inputDecimal = decimal;
				
				//convert decimal entered to binary
				if (decimal-512 > -1) {
					ten = 1;
					decimal = decimal - 512;
				} 
				if (decimal-256 > -1) {
					nine = 1;
					decimal = decimal - 256;
				} 
				if (decimal-128 > -1) {
					eight = 1;
					decimal = decimal - 128;
				} 
				if (decimal-64 > -1) {
					seven = 1;
					decimal = decimal - 64;
				} 
				if (decimal-32 > -1) {
					six = 1;
					decimal = decimal - 32;
				} 
				if (decimal-16 > -1) {
					five = 1;
					decimal = decimal - 16;
				} 
				if (decimal-8 > -1) {
					four = 1;
					decimal = decimal - 8;
				} 
				if (decimal-4 > -1) {
					three = 1;
					decimal = decimal - 4;
				} 
				if (decimal-2 > -1) {
					two = 1;
					decimal = decimal - 2;
				}
				if (decimal-1 > -5) {
					one = 1;
					decimal = decimal - 1;
				} 

				//printing out the final binary code
				System.out.println("The binary number for " + inputDecimal + " is: ");
				System.out.format("%s %s %s %s %s %s %s %s %s %s", ten, nine,  eight, seven, six, five, four, three, two, one);
				
				//close Scanner
				input.close();

			}

		


	}

