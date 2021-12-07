
public class lesson4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// random number equation
		/*
		 * int randNum = (int)(Math.random() *(max-min+1)) + min;
		 * 
		 * //dice - max:6 min:1 int dice = (int)(Math.random() *(6-1+1)) + 1;
		 */
		
		
		int randTemp = (int)(Math.random() *(36-(-15)+1)) - 15;
		System.out.println(randTemp);
		
		if (randTemp == 23 ) {
			System.out.println("it's just right!");
		}
		else if (randTemp > 23) {
			System.out.println("it's too hot!");
	
		}
		else if (randTemp < 23 ) {
			System.out.println("it's too cold!");
			
		}
	}

	//Power
	int power = (int) Math.pow(2,3);
	System.out.println(power);
	
	//Modulous -> % -> calculates the remainder
	double number = 12;
	double remainder = number %7;
	System.out.println("remainder:" + remainder);
	
	//1st:531   
	int onesDigit = 531% 10;
	inttensDigit = (531 % 100)/10;	`	```	
	
	
}
