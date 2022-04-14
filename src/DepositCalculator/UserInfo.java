package DepositCalculator;

import java.util.Scanner;

public class UserInfo {

    public int getInfoFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kwotę depozytu:");
        int info = scanner.nextInt();
        return info;
    }

}
