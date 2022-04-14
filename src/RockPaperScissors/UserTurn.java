package RockPaperScissors;

import java.util.Scanner;

public class UserTurn {

    String move;

    public String userPick() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Throw your handsign:");
        System.out.println("1 - ROCK");
        System.out.println("2 - PAPER");
        System.out.println("3 - SCISSORS");
        int pick = scanner.nextInt();
        switch (pick) {
            case 1:
                move = "ROCK";
                break;
            case 2:
                move = "PAPER";
                break;
            case 3:
                move = "SCISSORS";
                break;
            default:
                System.out.println("Incorrect choice, don't cheat!");
                userPick();
        }
        if (pick >= 1 && pick <=3){
            System.out.println("PLAYER picked -> "+ move);
        }
        return move;
    }
}
