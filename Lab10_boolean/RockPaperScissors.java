// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import java.awt.Window;

public class RockPaperScissors
{
    private char playChoice;
    private char compChoice;

    public RockPaperScissors()
    {

        playChoice='r';
        compChoice='p';

    }

    public RockPaperScissors(char player)
    {
        playChoice = player;
        // //         if (playChoice =="r" || playChoice =="p" || playChoice =="s"){
        // //             this.setPlayers(player);
        // //         }
        // //         else{
        // //             System.out.println("You have entered an incorrect response.");
        // //             this.restart();
        // //         }
        //out.print(playChoice);
        this.setPlayers(playChoice);
    }

    public void setPlayers(char player)
    {


        playChoice = player;
        out.println("you chose " + playChoice);
        double cc2 = 3*Math.random();
        int cc = (int)cc2;
        if (cc==0)
            compChoice='r';
        else if (cc==1)
            compChoice='p';
        else
            compChoice='s';

        out.println("AI chose " + compChoice);
        this.determineWinner();
    }

    public String determineWinner()
    {
        String winner="";
        
        
        //out.print("one " + playChoice);
        if(playChoice==compChoice){
            out.println("You tied! Play again?");
            winner = "You tied! Play again?";
            this.restart();
        }

        else if(playChoice == 'r'){
            switch(compChoice){
                case 'p': out.println("You lose! Paper covers rock."); winner = "You lose! Paper covers rock."; break;
                case 's': out.println("You win! Rock breacks scissors."); winner = "You win! Rock breacks scissors."; break;
                default: out.print("faillllllll");
            }
            this.restart();
        }

        else if(playChoice=='p'){
            switch(compChoice){
                case 'r': out.println("You win! Paper covers rock."); winner = "You win! Paper covers rock."; break;
                case 's': out.println("You lose! Scissors cuts paper"); winner = "You lose! Scissors cuts paper."; break;
            }
            this.restart();
        }

        else if(playChoice=='s'){
            switch(compChoice){
                case 'r': out.println("You lose! Rock breaks scissors."); winner = "You lose! Rock breaks scissors."; break;
                case 'p': out.println("You win! Scissors cut paper."); winner = "You win! Scissors cut paper."; break;
            }
            this.restart();
        }
        else {
            out.println("fail");
        }

        //out.print(" two " + compChoice);

        return winner;
    }

    public String toString()
    {
        return determineWinner();
    }
    
    public void restart(){
        Scanner k = new Scanner(System.in);
        out.print("Would you like to play? [y, n] :: ");
        char res = k.next().charAt(0);
        if (res=='y'){
            Scanner keyboard = new Scanner(System.in);
            char response;
        
            //add in a do while loop after you get the basics up and running
        
            String play;
        
            out.print("Rock-Paper-Scissors - pick your weapon [r,p,s] :: ");
            

            //read in the player value
            response = keyboard.nextLine().charAt(0);
            //play = Character.toString(response);
        
            RockPaperScissors game = new RockPaperScissors(response);
        }
        else{
            out.print("G O O D B Y E");
            System.exit(0); 
        }
    }
}