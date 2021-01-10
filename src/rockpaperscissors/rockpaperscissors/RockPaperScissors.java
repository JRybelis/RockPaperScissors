/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors;

import java.util.Scanner;

/**
 *
 * @author Jokubas
 */
public class RockPaperScissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Let's play: \"Rock: paper: scissors: lizard: Spock\"");
        System.out.println();
        System.out.println("It is variation of the classic game of \"Rock: paper: scissors\", created by the \"internet pioneer\" Sam Kass. All hail Sam Kass!");
        System.out.println();
        System.out.println("Its rules are very simple: \n scissors cut paper, \n paper covers rock, \n rock crushes lizard, \n lizard poisons Spock, \n Spock smashes scissors, \n scissors decapitate lizard, \n lizard eats paper, \n paper disproves Spock, \n Spock vapourises rock, \n and - as it always has - rock crushes scissors. ");
        System.out.println();
        System.out.println("To begin, press the number key on your keyboard, which corresponds to one of the choices below:");
        System.out.println();

        System.out.println("1. Rock");    
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        System.out.println("4. Lizard");
        System.out.println("5. Spock");
        System.out.println("0. End the game");
        
        int userInput = sc.nextInt();
        int randomiser = (int) (Math.random() * 10 + 1);
        
        float rockCpu = 0;
        float paperCpu = 0;
        float scissorsCpu = 0;
        float lizardCpu = 0;
        float spockCpu = 0;

        int rockUsr = 0;
        int paperUsr = 0;
        int scissorsUsr = 0;
        int lizardUsr = 0;
        int spockUsr = 0;
        
        // boolean rockCrush;
        // boolean rockCrush2;
        // boolean paperCover;
        // boolean paperDisprove;
        // boolean scissorsCut;
        // boolean scissorsDedapitate;
        // boolean lizardPoison;
        // boolean lizardEat;
        // boolean spockSmash;
        // boolean spockVapourise; 

        
        if (userInput != 0) {
            if (randomiser == 1 || randomiser == 2)  {
                rockCpu = randomiser; 
                System.out.println("Computer opponent plays \"rock\"");
            }
            if (randomiser == 3 || randomiser == 4) {
                paperCpu = randomiser;
                System.out.println("Computer opponent plays \"paper\"");
            }
            if (randomiser == 5 || randomiser == 6) {
                scissorsCpu = randomiser;
                System.out.println("Computer opponent plays \"scissors\"");
            }
            if (randomiser == 7 || randomiser == 8) {
                lizardCpu = randomiser;
                System.out.println("Computer opponent plays \"lizard\"");
            }
            if (randomiser == 9 || randomiser == 10) {
                spockCpu = randomiser;
                System.out.println("Computer opponent plays \"Spock\"");
            }
            if (userInput == 1) {
                rockUsr = userInput;
                System.out.println("You play \"rock\"");
            }
            if (userInput == 2) {
                paperUsr = userInput;
                System.out.println("You play \"paper\"");
            }
            if (userInput == 3) {
                scissorsUsr = userInput;
                System.out.println("You play \"scissors\"");
            }
            if (userInput == 4) {
                lizardUsr = userInput;
                System.out.println("You play \"lizard\"");
            }
            if (userInput == 5) {
                spockUsr = userInput;
                System.out.println("You play \"Spock\"");
            }
            
            if (((randomiser == 1 || randomiser == 2) && userInput == 1) || ((randomiser == 3 || randomiser == 4) && userInput == 2) || ((randomiser == 5 || randomiser == 6) && userInput == 3) || ((randomiser == 7 || randomiser == 8) && userInput == 4) || ((randomiser == 9 || randomiser == 10) && userInput == 5)) {
                System.out.println("It's a draw!");
            }
        } 
        
        System.out.println(randomiser);
        
    }
    
}
