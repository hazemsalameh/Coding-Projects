import java.util.*;
public class myClass {;
    public static void main(String args[]) {
     Random rand  = new Random();
     int upperbound = 3;
     int int_random = rand.nextInt(upperbound);
     Scanner userInput = new Scanner(System.in);
     int counter1 = 0;
     int counter2 = 0;
     int counter3 = 0;
    
     boolean trigger = false;
     System.out.println("What is your name?");
     String name = userInput.nextLine();
     boolean play = true;
     while(play = true){
        int inputNum = 4;
        
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Rock paper or scissors?");
        String answer = userInput.nextLine();
    answer = answer.toLowerCase();
    answer = answer.trim();
        trigger = false;
        while(trigger == false){
            
            int_random = rand.nextInt(upperbound);
            if(answer.equals("rock") ||answer.equals("r")){
               inputNum = 0;
               trigger = true;
            }
            else if(answer.equals("paper")||answer.equals("p"))  {
               inputNum = 1;
               trigger = true;
            }
            else if(answer.equals("scissors")||answer.equals("s")){
                inputNum = 2;
                trigger = true;
            }
            else{
                trigger = false;
               System.out.println("Please enter a proper answer (either rock paper or scissors)"); 
               System.out.println("Rock paper or scissors?");
             answer = userInput.nextLine();
             answer = answer.toLowerCase();
             answer = answer.trim();
            }
            
         }
    
         if(int_random == 0 && inputNum == 0){
            System.out.println("Computer: Rock");
            System.out.println(name+ ": Rock");
            
         }
         else if(int_random == 0 && inputNum == 1){
            System.out.println("Computer: Rock");
            System.out.println(name+ ": Paper");
            
         }
         else if(int_random == 0 && inputNum == 2){
            System.out.println("Computer: Rock");
            System.out.println(name+ ": Scissors");
            
         }
         else if(int_random == 1 && inputNum == 0){
            System.out.println("Computer: Paper");
            System.out.println(name+ ": Rock");
         }
         else if(int_random == 1 && inputNum == 1){
            System.out.println("Computer: Paper");
            System.out.println(name+ ": Paper");
         }
         else if(int_random == 1 && inputNum == 2){
            System.out.println("Computer: Paper");
            System.out.println(name+ ": Scissors");
         }
         else if(int_random == 2 && inputNum == 2){
            System.out.println("Computer: Scissors");
            System.out.println(name+ ": Scissors");
         }
         else if(int_random == 2 && inputNum == 0){
            System.out.println("Computer: Paper");
            System.out.println(name+ ": Rock");
         }
         else if(int_random == 2 && inputNum == 1){
            System.out.println("Computer: Paper");
            System.out.println(name+ ": Paper");
         }
         else{
             System.out.println("Error");
         }

         if(int_random == 2 && inputNum == 0 ){
             inputNum = inputNum + 10;
         }
        else if(int_random == 0 && inputNum == 2 ){
            inputNum = inputNum - 10;
        }
 
         if(int_random < inputNum){

            System.out.println("You win!");
            counter2++;
            counter3++;
            System.out.println("Computer Score: " + counter1);
            System.out.println(name+ ": " + counter2);
            System.out.println("Total Matches Played: " + counter3);
         }
         else if(int_random > inputNum){
           
            System.out.println("You lose!");
            counter1++;
            counter3++;
            System.out.println("Computer Score: " + counter1);
            System.out.println(name+ ": " + counter2);
            System.out.println("Total Matches Played: " + counter3);
         }

         else {
           counter3++;
            System.out.println("Tie!");
            System.out.println("Computer Score: " + counter1);
            System.out.println(name+ ": " + counter2);
            System.out.println("Total Matches Played: " + counter3);
         }





         boolean trigger2 = false;
        
        while(trigger2 == false){
        System.out.println("Do you want to keep playing? (yes or no)");
         String playInput = userInput.nextLine();
         playInput = playInput.trim();
         playInput = playInput.toLowerCase();
         
         
            if(playInput.equals("yes")||playInput.equals("y")){
                play = true;
                trigger2 = true;
            }
            else if(playInput.equals("no")|| playInput.equals("n") )
            {
                play = false;
                trigger2 = true;
                System.out.println("Here's your final score: ");
                System.out.println("Computer Score: " + counter1);
                System.out.println(name+ ": " + counter2);
                System.out.println("Goodbye!");
                System.exit(0);
            }
            else{
               System.out.println("Please type a proper answer (yes or no)"); 
               trigger2 = false;
               
            }
         }
         
     }
     
    }
}