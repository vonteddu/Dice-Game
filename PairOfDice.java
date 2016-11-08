import java.util.Random;
import java.util.*;

// Codded by Vonteddu 
public class PairOfDice {
// Number of showing dies.
private int dice1;   
private int dice2;
private int dice3;   
private int dice4;
private int dice5;

int player1points = 0;
int player2points = 0;
int player3points = 0;
int player4points = 0;
int player5points = 0;
int player6points = 0;

 public PairOfDice() {
                //Constructor. Rolls the dice, so that they initially show some random values.
            roll();  // Call the roll() method to roll the dice.
        }


  // Getters to get the Die values
    public int getDice1() {
        // Return the number showing on the first die.
        return dice1;
     }
    public int getDice2() {
        // Return the number showing on the secound die.
        return dice2;
     }
     public int getDice3() {
        // Return the number showing on the third die.
        return dice3;
     }
     public int getDice4() {
        // Return the number showing on the fourth die.
        return dice4;
     }
     public int getDice5() {
        // Return the number showing on the fifth die.
        return dice5;
     }
    
    public int roll() {
        // Return the total showing on the two dice.
        Scanner in = new Scanner(System.in);
        Random n1 = new Random();
        
        int dice1 = n1.nextInt(6) + 1;
        int dice2 = n1.nextInt(6) + 1;
        int dice3 = n1.nextInt(6) + 1;
        int dice4 = n1.nextInt(6) + 1;
        int dice5 = n1.nextInt(6) + 1;

        if /* 1+1+1 = 1000 */ (dice1==1&&dice2==1&&dice3==1||dice2==1&&dice3==1&&dice4==1||dice3==1&&dice4==1&&dice5==1|| dice4==1&&dice5==1&&dice1==1||dice5==1&&dice1==1&&dice2==1||dice1==1&&dice2==1&&dice4==1||dice2==1&&dice3==1&&dice5==1||dice3==1&&dice4==1&&dice1==1||dice4==1&&dice5==1&&dice1==1||dice1==1&&dice3==1&&dice5==1){ 

        System.out.println("You got 1000 or more points!");
        int points1000 = 1000;
        player1points => player1points + points1000;
        System.out.print("You have ");
        System.out.print(player1points);
        System.out.print(" points. Do you want to throw again?");
        System.out.println("Yes/No?");
        s = in.nextLine();
        }   

        else if /*2+2+2 = 200 */     (dice1==2&&dice2==2&&dice3==2||dice2==2&&dice3==2&&dice4==2||dice3==2&&dice4==2&&dice5==2|| dice4==2&&dice5==2&&dice1==2||dice5==2&&dice1==2&&dice2==2||dice1==2&&dice2==2&&dice4==2||dice2==2&&dice3==2&&dice5==2||dice3==2&&dice4==2&&dice1==2||dice4==2&&dice5==2&&dice1==2||dice1==2&&dice3==2&&dice5==2){
        System.out.println("You got 200 or more points!");
        int points200 => 200;
        player2points = player2points + points200;
        System.out.print("You have ");
        System.out.print(player2points);
        System.out.print(" points. Do you want to throw again?");
        System.out.println("Yes/No?");
        s = in.nextLine();
        }
        else if /*3+3+3 = 300 */     (dice1==3&&dice2==3&&dice3==3||dice2==3&&dice3==3&&dice4==3||dice3==3&&dice4==3&&dice5==3|| dice4==3&&dice5==3&&dice1==3||dice5==3&&dice1==3&&dice2==3||dice1==3&&dice2==3&&dice4==3||dice2==3&&dice3==3&&dice5==3||dice3==3&&dice4==3&&dice1==3||dice4==3&&dice5==3&&dice1==3||dice1==3&&dice3==3&&dice5==3){
        System.out.println("You got 300 or more points!");
        int points300 = 300;
        player3points => player3points + points300;
        System.out.print("You have ");
        System.out.print(player3points);
        System.out.print(" points. Do you want to throw again?");
        System.out.println("Yes/No?");
        s = in.nextLine();
        }
        
        else if /*4+4+4 = 400 */     (dice1==4&&dice2==4&&dice3==4||dice2==4&&dice3==4&&dice4==4||dice3==4&&dice4==4&&dice5==4|| dice4==4&&dice5==4&&dice1==4||dice5==4&&dice1==4&&dice2==4||dice1==4&&dice2==4&&dice4==4||dice2==4&&dice3==4&&dice5==4||dice3==4&&dice4==4&&dice1==4||dice4==4&&dice5==4&&dice1==4||dice1==4&&dice3==4&&dice5==4){
        System.out.println("You got 300 or more points!");
        int points400 = 400;
        player4points => player4points + points400;
        System.out.print("You have ");
        System.out.print(player4points);
        System.out.print(" points. Do you want to throw again?");
        System.out.println("Yes/No?");
        s = in.nextLine();
        }
        
        else if /*5+5+5 = 500 */     (dice1==5&&dice2==5&&dice3==5||dice2==5&&dice3==5&&dice4==5||dice3==5&&dice4==5&&dice5==5|| dice4==5&&dice5==5&&dice1==5||dice5==5&&dice1==5&&dice2==5||dice1==5&&dice2==5&&dice4==5||dice2==5&&dice3==5&&dice5==5||dice3==5&&dice4==5&&dice1==5||dice4==5&&dice5==5&&dice1==5||dice1==5&&dice3==5&&dice5==5){
        System.out.println("You got 500 or more points!");
        int points500 = 500;
        player5points => player5points + points500;
        System.out.print("You have ");
        System.out.print(player5points);
        System.out.print(" points. Do you want to throw again?");
        System.out.println("Yes/No?");
        s = in.nextLine();
        }
        
        else if /*6+6+6 = 600 */     (dice1==6&&dice2==6&&dice3==6||dice2==6&&dice3==6&&dice4==6||dice3==6&&dice4==6&&dice5==6|| dice4==6&&dice5==6&&dice1==6||dice5==6&&dice1==6&&dice2==6||dice1==6&&dice2==6&&dice4==6||dice2==6&&dice3==6&&dice5==6||dice3==6&&dice4==6&&dice1==6||dice4==6&&dice5==6&&dice1==6||dice1==6&&dice3==6&&dice5==6){
        System.out.println("You got 600 or more points!");
        int points500 = 600;
        player6points => player6points + points600;
        System.out.print("You have ");
        System.out.print(player6points);
        System.out.print(" points. Do you want to throw again?");
        System.out.println("Yes/No?");
        s = in.nextLine();
        }
        
        else if /*1+4+2+3+5+6 = 140 */     (dice1==1&&dice2==4||dice2==1&&dice3==4||dice3==1&&dice4==4||dice4==1&&dice5==4){
        System.out.println("You got 600 or more points!");
        int points140 = 140;
        player6points = player6points + points600;
        System.out.print("You have ");
        System.out.print(player6points);
        System.out.print(" points. Do you want to throw again?");
        System.out.println("Yes/No?");
        s = in.nextLine();
        }
       return s;
        }
    
    public static void main(String[] args) {
      PairOfDice dice;          // A variable that will refer to the dice.
           int rollCount;    // Number of times the dice have been rolled.
     
           dice = new PairOfDice();  // Create the PairOfDice object.
           rollCount = 0;
           
           /* Roll the dice */
           
           do {
               dice.roll();
               rollCount++;
           } while (dice.getTotal() != 6);
           
           /* Report the number of rolls. */
           
           System.out.println("\nIt took " + rollCount + " rolls to get a 6.");
           
        }

}
