package RockPaperScissors;

public class CpuTurn {

    String move;

    public String cpuPick(){
        int random = (int)(Math.random()*3)+1;
        switch (random){
            case 1:
                move = "ROCK";
                break;
            case 2:
                move = "PAPER";
                break;
            case 3:
                move = "SCISSORS";
                break;
        }
        System.out.println("CPU picked -> "+ move);
        return move;
    }
}
