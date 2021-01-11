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

        // System.out.println("1. Rock");    
        // System.out.println("2. Paper");
        // System.out.println("3. Scissors");
        // System.out.println("4. Lizard");
        // System.out.println("5. Spock");
        // System.out.println("0. End the game");
        
        int rockCpu = 0;
        int paperCpu = 0;
        int scissorsCpu = 0;
        int lizardCpu = 0;
        int spockCpu = 0;

        int rockUsr = 0;
        int paperUsr = 0;
        int scissorsUsr = 0;
        int lizardUsr = 0;
        int spockUsr = 0;
        
        int roundsPlayed = 0;
        int winsCpu = 0;
        int winsUsr = 0;
        int gamesTied = 0;
     
        int userInput = 5;
        
        while (userInput != 0) {
            do {
                System.out.println();
                System.out.println();
                System.out.println("Rounds played so far: " + roundsPlayed);
                System.out.println("1. Rock");    
                System.out.println("2. Paper");
                System.out.println("3. Scissors");
                System.out.println("4. Lizard");
                System.out.println("5. Spock");
                System.out.println("0. End the game");
                userInput = sc.nextInt();
            }
            while (userInput > 5);
                int randomiser = (int) (Math.random() * 5 + 1);
                
                if (randomiser == 1 && userInput == 4) {
                    System.out.println("Computer opponent plays \"rock\".");
                    System.out.println("You play \"lizard\".");
                    System.out.println("Rock crushes lizard. Computer wins.");
                    rockCpu ++;
                    lizardUsr ++;
                    roundsPlayed ++;
                    winsCpu ++;
                }
                if (randomiser == 1 && userInput == 3) {
                    System.out.println("Computer opponent plays \"rock\".");
                    System.out.println("You play \"scissors\".");
                    System.out.println("As it always has, rock crushes scissors. Computer wins.");
                    rockCpu ++;
                    scissorsUsr ++;
                    roundsPlayed ++;
                    winsCpu ++;
                }
                if (randomiser == 2 && userInput == 5) {
                    System.out.println("Computer opponent plays \"paper\".");
                    System.out.println("You play \"Spock\".");
                    System.out.println("Paper disproves Spock. Computer wins.");
                    paperCpu ++;
                    spockUsr ++;
                    roundsPlayed ++;
                    winsCpu ++;
                }
                if (randomiser == 2 && userInput == 1) {
                    System.out.println("Computer opponent plays \"paper\".");
                    System.out.println("You play \"rock\".");
                    System.out.println("Paper covers rock. Computer wins.");
                    paperCpu ++;
                    rockUsr ++;
                    roundsPlayed ++;
                    winsCpu ++;
                }
                if (randomiser == 3 && userInput == 2) {
                    System.out.println("Computer opponent plays \"scissors\".");
                    System.out.println("You play \"paper\".");
                    System.out.println("Scissors cut paper. Computer wins.");
                    scissorsCpu ++;
                    paperUsr ++;
                    roundsPlayed ++;
                    winsCpu ++;
                }
                if (randomiser == 3 && userInput == 4) {
                    System.out.println("Computer opponent plays \"scissors\".");
                    System.out.println("You play \"lizard\".");
                    System.out.println("Scissors decapitate lizard. Computer wins.");
                    scissorsCpu ++;
                    lizardUsr ++;
                    roundsPlayed ++;
                    winsCpu ++;
                }
                if (randomiser == 4 && userInput == 5) {
                    System.out.println("Computer opponent plays \"lizard\".");
                    System.out.println("You play \"Spock\".");
                    System.out.println("Lizard poisons Spock. Computer wins.");
                    lizardCpu ++;
                    spockUsr ++;
                    roundsPlayed ++;
                    winsCpu ++;
                }
                if (randomiser == 4 && userInput == 2) {
                    System.out.println("Computer opponent plays \"lizard\".");
                    System.out.println("You play \"paper\".");
                    System.out.println("Lizard eats paper. Computer wins.");
                    lizardCpu ++;
                    paperUsr ++;
                    roundsPlayed ++;
                    winsCpu ++;
                }
                if (randomiser == 5 && userInput == 3) {
                    System.out.println("Computer opponent plays \"Spock\".");
                    System.out.println("You play \"scissors\".");
                    System.out.println("Spock smashes scissors. Computer wins.");
                    spockCpu ++;
                    scissorsUsr ++;
                    roundsPlayed ++;
                    winsCpu ++;
                }
                if (randomiser == 5 && userInput == 1) {
                    System.out.println("Computer opponent plays \"Spock\".");
                    System.out.println("You play \"rock\".");
                    System.out.println("Spock vapourises rock. Computer wins.");
                    spockCpu ++;
                    rockUsr ++;
                    roundsPlayed ++;
                    winsCpu ++;
                }

                if (userInput == 1 && randomiser == 4) {
                    System.out.println("You play \"rock\".");
                    System.out.println("Computer opponent plays \"lizard\".");
                    System.out.println("Rock crushes lizard. You win.");
                    rockUsr ++;
                    lizardCpu ++;
                    roundsPlayed ++;
                    winsUsr ++;
                }
                if (userInput == 1 && randomiser == 3) {
                    System.out.println("You play \"rock\".");
                    System.out.println("Computer opponent plays \"scissors\".");
                    System.out.println("As it always has, rock crushes scissors. You win.");
                    rockUsr ++;
                    scissorsCpu ++;
                    roundsPlayed ++;
                    winsUsr ++;
                }
                if (userInput == 2 && randomiser == 5) {
                    System.out.println("You play \"paper\".");
                    System.out.println("Computer opponent plays \"Spock\".");
                    System.out.println("Paper disproves Spock. You win.");
                    paperUsr ++;
                    spockCpu ++;
                    roundsPlayed ++;
                    winsUsr ++;
                }
                if (userInput == 2 && randomiser == 1) {
                    System.out.println("You play \"paper\".");
                    System.out.println("Computer opponent plays \"rock\".");
                    System.out.println("Paper covers rock. You win.");
                    paperUsr ++;
                    rockCpu ++;
                    roundsPlayed ++;
                    winsUsr ++;
                }
                if (userInput == 3 && randomiser == 2) {
                    System.out.println("You play \"scissors\".");
                    System.out.println("Computer opponent plays \"paper\".");
                    System.out.println("Scissors cut paper. You win.");
                    scissorsUsr ++;
                    paperCpu ++;
                    roundsPlayed ++;
                    winsUsr ++;
                }
                if (userInput == 3 && randomiser == 4) {
                    System.out.println("You play \"scissors\".");
                    System.out.println("Computer opponent plays \"lizard\".");
                    System.out.println("Scissors decapitate lizard. You win.");
                    scissorsUsr ++;
                    lizardCpu ++;
                    roundsPlayed ++;
                    winsUsr ++;
                }
                if (userInput == 4 && randomiser == 5) {
                    System.out.println("You play \"lizard\".");
                    System.out.println("Computer opponent plays \"Spock\".");
                    System.out.println("Lizard poisons Spock. You win.");
                    lizardUsr ++;
                    spockCpu ++;
                    roundsPlayed ++;
                    winsUsr ++;
                }
                if (userInput == 4 && randomiser == 2) {
                    System.out.println("You play \"lizard\".");
                    System.out.println("Computer opponent plays \"paper\".");
                    System.out.println("Lizard eats paper. You win.");
                    lizardUsr ++;
                    paperCpu ++;
                    roundsPlayed ++;
                    winsUsr ++;
                }
                if (userInput == 5 && randomiser == 3) {
                    System.out.println("You play \"Spock\".");
                    System.out.println("Computer opponent plays \"scissors\".");
                    System.out.println("Spock smashes scissors. You win.");
                    spockUsr ++;
                    scissorsCpu ++;
                    roundsPlayed ++;
                    winsUsr ++;
                }
                if (userInput == 5 && randomiser == 1) {
                    System.out.println("You play \"Spock\".");
                    System.out.println("Computer opponent plays \"rock\".");
                    System.out.println("Spock vapourises rock. You win.");
                    spockUsr ++;
                    rockCpu ++;
                    roundsPlayed ++;
                    winsUsr ++;
                }
                
                if (randomiser == userInput) {
                    gamesTied ++;
                    if (userInput == 1) {
                        System.out.println("You play \"rock\".");
                        rockUsr ++;
                    }
                    if (userInput == 2) {
                        System.out.println("You play \"paper\".");
                        paperUsr ++;
                    }
                    if (userInput == 3) {
                        System.out.println("You play \"scissors\".");
                        scissorsUsr ++;
                    }
                    if (userInput == 4) {
                        System.out.println("You play \"lizard\".");
                        lizardUsr ++;
                    }
                    if (userInput == 5) {
                        System.out.println("You play \"Spock\".");
                        spockUsr ++;
                    }

                    if (randomiser == 1) {
                        System.out.println("Computer opponent plays \"rock\".");
                        rockCpu ++;
                    }
                    if (randomiser == 2) {
                        System.out.println("Computer opponent plays \"paper\".");
                        paperCpu ++;
                    }
                    if (randomiser == 3) {
                        System.out.println("Computer opponent plays \"scissors\".");
                        scissorsCpu ++;
                    }
                    if (randomiser == 4) {
                        System.out.println("Computer opponent plays \"lizard\".");
                        lizardCpu ++;
                    }
                    if (randomiser == 5) {
                        System.out.println("Computer opponent plays \"Spock\".");
                        spockCpu ++;
                    }
                    System.out.println("It's a draw!");
                }
            }
            if (roundsPlayed != 0 && userInput == 0) { 
            int rockUsrPerCent = rockUsr * 100 / roundsPlayed;
            int paperUsrPerCent = paperUsr * 100 / roundsPlayed;
            int scissorsUsrPerCent = scissorsUsr * 100 / roundsPlayed;
            int lizardUsrPerCent = lizardUsr * 100 / roundsPlayed;
            int spockUsrPerCent = spockUsr * 100 / roundsPlayed;
            int rockCpuPerCent = rockCpu * 100 / roundsPlayed;
            int paperCpuPerCent = paperCpu * 100 / roundsPlayed;
            int scissorsCpuPerCent = scissorsCpu * 100 / roundsPlayed;
            int lizardCpuPerCent = lizardCpu * 100 / roundsPlayed;
            int spockCpuPerCent = spockCpu * 100 / roundsPlayed;
            System.out.println("Overall game statistics: ");
            System.out.println();
            System.out.println("Rounds played: " + roundsPlayed);
            System.out.println("You have won: " + winsUsr + " times.");
            System.out.println("The Computer has won: " + winsCpu + " times.");
            System.out.println("You and computer were tied: " + gamesTied + " times.");
            if ( winsCpu == winsUsr) {
                System.out.println("You are equally matched with the Computer.");
            }
            else if (winsCpu > winsUsr) {
                System.out.println("Computer won by a margin of " + (winsCpu - winsUsr) + ". Better luck next time!");
            } else {
                System.out.println("You won by a margin of " + (winsUsr - winsCpu) + ". Well done!");
            }
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
        } 
    }
}
