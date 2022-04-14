package DicePig;

public class MainScene {
    public static void main(String[] args) {
        DiceDie diceDie = new DiceDie();
        Rules rules = new Rules();

        System.out.println(rules.rules);
        diceDie.diceDie();
    }
}
