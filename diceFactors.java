package conditional;

public class diceFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating randnumbers and printing out * for multiples of 6 
		int i;
		for (int i1=0; i1< 16; i1++) {
			int randnum = (int)(Math.random()*(40-10+1)) + 10;
			if(randnum % 6 ==0) {
				System.out.println(randnum + "*");
			}
			else {
				System.out.println(randnum);
			}
		}
		//2 blank lines
		System.out.println();
		System.out.println();
		
		//3 dice rolls
		int dicenum1 = 0;
		int dicenum2 = 0;
		int dicenum3 = 0;
		int product = 0;
		while (product < 12) {
			product = dicenum1*dicenum2*dicenum3;
			dicenum1 = (int)(Math.random()*(6-1+1)) + 1;
			dicenum2 = (int)(Math.random()*(6-1+1)) + 1;
			dicenum3 = (int)(Math.random()*(6-1+1)) + 1;
			System.out.println(dicenum1 + "\t" + dicenum2 + dicenum3 +"\t" + "*");
		}
		

	}

}
