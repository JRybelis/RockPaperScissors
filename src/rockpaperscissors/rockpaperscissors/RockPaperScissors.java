/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors;

import java.io.Console;
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
        
        int roundsPlayed = 0;
        int winsCpu = 0;
        int winsUsr = 0;
        int gamesTied = 0;
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

        
        while (userInput != 0) {
            do {
                System.out.println("Rounds played so far: " + roundsPlayed);
                System.out.println("1. Rock");    
                System.out.println("2. Paper");
                System.out.println("3. Scissors");
                System.out.println("4. Lizard");
                System.out.println("5. Spock");
                System.out.println("0. End the game");
                int userInput = sc.nextInt();
            }
            while (userInput > 5 || userInput < 0);
                int randomiser = (int) (Math.random() * 10 + 1);
                if (randomiser == 1 || randomiser == 2)  {
                    rockCpu ++; 
                    System.out.println("Computer opponent plays \"rock\"");
                }
                if (randomiser == 3 || randomiser == 4) {
                    paperCpu ++;
                    System.out.println("Computer opponent plays \"paper\"");
                }
                if (randomiser == 5 || randomiser == 6) {
                    scissorsCpu ++;
                    System.out.println("Computer opponent plays \"scissors\"");
                }
                if (randomiser == 7 || randomiser == 8) {
                    lizardCpu ++;
                    System.out.println("Computer opponent plays \"lizard\"");
                }
                if (randomiser == 9 || randomiser == 10) {
                    spockCpu ++;
                    System.out.println("Computer opponent plays \"Spock\"");
                }

                if (userInput == 1) {
                    rockUsr ++;
                    System.out.println("You play \"rock\"");
                }
                if (userInput == 2) {
                    paperUsr ++;
                    System.out.println("You play \"paper\"");
                }
                if (userInput == 3) {
                    scissorsUsr ++;
                    System.out.println("You play \"scissors\"");
                }
                if (userInput == 4) {
                    lizardUsr ++;
                    System.out.println("You play \"lizard\"");
                }
                if (userInput == 5) {
                    spockUsr ++;
                    System.out.println("You play \"Spock\"");
                }
                
                if (((randomiser == 1 || randomiser == 2) && userInput == 1) || ((randomiser == 3 || randomiser == 4) && userInput == 2) || ((randomiser == 5 || randomiser == 6) && userInput == 3) || ((randomiser == 7 || randomiser == 8) && userInput == 4) || ((randomiser == 9 || randomiser == 10) && userInput == 5)) {
                    System.out.println("It's a draw!");
                    gamesTied ++;
                }
             
            
            float rockUsrPerCent = rockUsr * 100f / roundsPlayed;
            float paperUsrPerCent = paperUsr * 100f / roundsPlayed;
            float scissorsUsrPerCent = scissorsUsr * 100f / roundsPlayed;
            float lizardUsrPerCent = lizardUsr * 100f / roundsPlayed;
            float spockUsrPerCent = spockUsr * 100f / roundsPlayed;
            float rockCpuPerCent = rockCpu * 100f / roundsPlayed;
            float paperCpuPerCent = paperCpu * 100f / roundsPlayed;
            float scissorsCpuPerCent = scissorsCpu * 100f / roundsPlayed;
            float lizardCpuPerCent = lizardCpu * 100f / roundsPlayed;
            float spockCpuPerCent = spockCpu * 100f / roundsPlayed;
            System.out.println("Overall game statistics: ");
            System.out.println("Rounds played: " + roundsPlayed);
            System.out.println("You have won: " + winsUsr + " times.");
            System.out.println("The Computer has won: " + winsCpu + " times.");
            System.out.println("You and computer were tied: " + gamesTied + " times.");
            System.out.println();
            System.out.println("Your choices: ");
            System.out.println("Rock: " + rockUsr + " times, " + rockUsrPerCent + "%");
            System.out.println("Paper: " + paperUsr + " times, " + paperUsrPerCent + "%");
            System.out.println("Scissors: " + scissorsUsr + " times, " + scissorsUsrPerCent + "%");
            System.out.println("Lizard: " + lizardUsr + " times, " + lizardUsrPerCent + "%");
            System.out.println("Spock: " + spockUsr + " times, " + spockUsrPerCent + "%");
            System.out.println();
            System.out.println("Computer choices: ");
            System.out.println("Rock: " + rockCpu + " times, " + rockCpuPerCent + "%");
            System.out.println("Paper: " + paperCpu + " times, " + paperCpuPerCent + "%");
            System.out.println("Scissors: " + scissorsCpu + " times, " + scissorsCpuPerCent + "%");
            System.out.println("Lizard: " + lizardCpu + " times, " + lizardCpuPerCent + "%");
            System.out.println("Spock: " + spockCpu + " times, " + spockCpuPerCent + "%");
            if (winsCpu > winsUsr) {
                System.out.println("Computer wins by a margin of" + (winsCpu - winsUsr) + ". Better luck next time!");
            } else {
                System.out.println("You win by a margin of" + (winsUsr - winsCpu) + ". Well done!");
            }
            }
        } 
        
        // System.out.println(randomiser);
        
    }
    
}
