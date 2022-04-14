package DicePig;

import java.util.Scanner;

public class DiceDie {

    int die;
    String turn = "PLAYER"; //PLAYER; CPU

    int playerScore;
    int cpuScore;
    int bank;

    public void diceDie() {
        die = (int) (Math.random() * 6) + 1;
        checkResult();
    }

    public void checkResult() {
        printScore();
        switch (die) {
            case 1:
                bank = 0;
                System.out.println("Turn lost");
                turnLost();
                break;
            default:
                bank += die;
                System.out.println("Points to hold: " + bank);
                if (turn == "PLAYER") {
                    playerMove();
                } else {
                    cpuMove();
                }
                break;
        }
    }

    public void playerMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - continue round");
        System.out.println("2 - hold the points");
        int decysion = scanner.nextInt();
        switch (decysion) {
            case 1:
                diceDie();
                break;
            case 2:
                playerScore += bank;
                System.out.println("POINTS SAVED FOR PLAYER!");
                turnLost();
            default:
                System.out.println("Pick 1 or 2, no more no less...");
                playerMove();
        }
    }

    public void printScore() {
        System.out.println("Its " + turn + "s turn.");
        System.out.println("Dice roll ---------> [" + die + "]");
    }

    public void turnLost() {
        bank = 0;
        switch (turn) {
            case "PLAYER":
                turn = "CPU";
                break;
            case "CPU":
                turn = "PLAYER";
                break;
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("PLAYER: " + playerScore + " |||  CPU: " + cpuScore);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
        win();
    }

    public void cpuMove() {
        if (cpuScore + bank >= 100 || bank >= 10) {
            cpuScore += bank;
            System.out.println("POINTS SAVED FOR CPU!");
            turnLost();
        } else {
            diceDie();
        }
    }

    public void win() {
        if (playerScore >= 100) {
            System.out.println("|||||||||||||||||||| ");
            System.out.println("||||| YOU WIN! ||||| ");
            System.out.println("|||||||||||||||||||| ");
        } else if (cpuScore >= 100) {
            System.out.println("||||||||||||||||||||||");
            System.out.println("||||| YOU LOOSE! |||||");
            System.out.println("||||||||||||||||||||||");
        } else {
            diceDie();
        }
    }


}
