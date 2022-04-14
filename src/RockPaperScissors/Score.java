package RockPaperScissors;

public class Score {

    int player; //players score
    int cpu; //cpus scores
    int rounds; //pints to win

    public Score(int player, int cpu, int rounds) {
        this.player = player;
        this.cpu = cpu;
        this.rounds = rounds;
    }

    UserTurn userTurn = new UserTurn();
    CpuTurn cpuTurn = new CpuTurn();

    public void scoreUpdate() {

        userTurn.userPick();
        cpuTurn.cpuPick();

        if (userTurn.move == "ROCK" && cpuTurn.move == "PAPER") {
            player += 0;
            cpu += 1;
            System.out.println("PAPER beats ROCK!");
        } else if (userTurn.move == "ROCK" && cpuTurn.move == "SCISSORS") {
            player += 1;
            cpu += 0;
            System.out.println("ROCK beats SCISSORS!");
        } else if (userTurn.move == "PAPER" && cpuTurn.move == "ROCK") {
            player += 1;
            cpu += 0;
            System.out.println("PAPER beats ROCK!");
        } else if (userTurn.move == "PAPER" && cpuTurn.move == "SCISSORS") {
            player += 0;
            cpu += 1;
            System.out.println("SCISSORS beats PAPER!");
        } else if (userTurn.move == "SCISSORS" && cpuTurn.move == "ROCK") {
            player += 0;
            cpu += 1;
            System.out.println("ROCK beats SCISSORS!");
        } else if (userTurn.move == "SCISSORS" && cpuTurn.move == "PAPER") {
            player += 1;
            cpu += 0;
            System.out.println("SCISSORS beats PAPER!");
        } else {
            player += 0;
            cpu += 0;
            System.out.println("Its a DRAW!");
        }
        System.out.println("PLAYER: " + player + " CPU: " + cpu);
    }

    public void theWinerIs() {
        if (player > cpu) {
            System.out.println("|||||||||||||||||||| ");
            System.out.println("||||| YOU WIN! ||||| ");
            System.out.println("|||||||||||||||||||| ");
        } else {
            System.out.println("||||||||||||||||||||||");
            System.out.println("||||| YOU LOOSE! |||||");
            System.out.println("||||||||||||||||||||||");
        }
        System.out.println("Thanks for playing!");
    }
}
