package DepositCalculator;

public class Sandbox {
    public static void main(String[] args) {

        int[] tablica = new int[10];


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablica[j] = randomNum();
            }
            System.out.println(java.util.Arrays.toString(tablica));
        }

    }

    public static int randomNum() {
        int random = (int) (Math.random() * 6) + 1;
//        System.out.println(random);
        return random;
    }
}
