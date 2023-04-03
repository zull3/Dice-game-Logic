/* A dice game who ask user to roll 3 dice and validating the input and caldulates the total wins and loss. 
* If user enters q, the program should quit.
* 
* 1. Create constants and variables 
* 2. Enter dice number to be rolled 1 or 2 or 3
* 3. Validate user input to be an integer between 1-3 or q for quit game
* 4. Generate random numbers for dice 1-3
* 5. Check if dice has been rolled already
* 6. Calculate values and sum for dice
* 7. Print result and keep track of total score
* 8. Reset values
* 9. Start next round 
*
* @author Alexander Kraskovsky, laxkar-2
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    //Declare variables and constants
    boolean isGameOver = false;
    int number = 0;
    int sum = 0;
    int wins = 0;
    int loss = 0;
    int totalWins = 0;
    int totalLoss = 0;
    int WIN = 12;

    //Track which dice rolled
    boolean isDice1Rolled = false;
    boolean isDice2Rolled = false;
    boolean isDice3Rolled = false;

    //Track the value of the dice
    int dice1Value = 0;
    int dice2Value = 0;
    int dice3Value = 0;

    //Track the number of rolls
    int numOfRolls = 0; 

    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to the game 12! You must roll 1-3 dice and get the sum 12");
    
    while(!isGameOver) {
      System.out.print("Enter which dice you want to roll [1,2,3] (exit with q): ");
      //Validating user input
      if(input.hasNextInt()) {
        number = input.nextInt();
        if(number < 1 || number > 3) {
          System.out.println("Invalid Entry");
          continue;
     
        }
      }
      else if(input.hasNext()) {
        String inString = input.next();
        // Q and q
        if(inString.equalsIgnoreCase("q")) {
          System.out.println("Game Over!");
          isGameOver = true;
          break;
        } else {
          System.out.println("Invalid Entry");
          continue;
        }
      }

      //Processing the dice rolls
      if(number == 1 && numOfRolls < 3) {
        if(!isDice1Rolled){
          isDice1Rolled = true;
          numOfRolls++;
          dice1Value = (int) (Math.random () * 6) +1; //Random number
          System.out.println("Dice 1 rolled with value " + dice1Value);
        }
        else {
          System.out.println("Dice 1 already rolled");
        }
      }
      else if(number == 2 && numOfRolls < 3) {
        if(!isDice2Rolled){
          isDice2Rolled = true;
          numOfRolls++;
          dice2Value = (int) (Math.random () * 6) +1;  //Random number
          System.out.println("Dice 2 rolled with value " + dice2Value);
        }
         else {
          System.out.println("Dice 2 already rolled");
        }
      }
      else if(number == 3 && numOfRolls < 3) {
        if(!isDice3Rolled){
          isDice3Rolled = true;
          numOfRolls++;
          dice3Value = (int) (Math.random () * 6) +1;  //Random number
          System.out.println("Dice 3 rolled with value " + dice3Value);
        }
        else {
          System.out.println("Dice 3 already rolled");
        }
      }

      if(numOfRolls == 3) {

        sum = dice1Value + dice2Value + dice3Value;
        System.out.print("The Sum is: ");
        System.out.println(sum);
        
        if (sum > 12){
        System.out.println("You lost!");
          loss ++;
        }
        else if (sum == WIN){
        System.out.println("You Win!");
          wins ++;
        }
        else if (sum < 12){
        System.out.println("You nor win or lose");
        }
        
        totalWins = totalWins + wins;
        totalLoss = totalLoss + loss;
        
        //print wins/loss
        System.out.print("Wins: ");
        System.out.print( + totalWins);
          
        System.out.print(" Loss: ");
        System.out.print( + totalLoss);

        //reset values
        isDice1Rolled = false;
        isDice2Rolled = false;
        isDice3Rolled = false;
        numOfRolls = 0;

        numOfRolls = 0;
        sum = 0;
        wins = 0;
        loss = 0;
        
        System.out.println("\nNext Round!");
      }
    }
    input.close(); //close scanner and memory leak
  }
}
