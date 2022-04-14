package RockPaperScissors;

public class MainScene {


    public static void main(String[] args) {

        Score score = new Score(0, 0, 3);

        for (int i = 1; i > 0; i++) {
            if (score.player == score.rounds - 1 || score.cpu == score.rounds - 1) {
                System.out.println("----- Match Round #" + i + " -----");
            } else {
                System.out.println("----- Round #" + i + " -----");
            }
            score.scoreUpdate();
            if (score.player == score.rounds || score.cpu == score.rounds) {
                break;
            }
        }
        score.theWinerIs();
    }
}
