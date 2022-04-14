package DepositCalculator;

public class Main {

    public static void main(String[] args) {
        // write your code here

        UserInfo userInfo = new UserInfo();

        Deposit deposit1M = new Deposit(.0325, 1);
        Deposit deposit3M = new Deposit(.035, 3);
        Deposit deposit12M = new Deposit(.0375,12);

        SavingsAcc savingsAcc = new SavingsAcc(.0325);

        deposit1M.checkProfit(userInfo.getInfoFromUser());
        deposit3M.checkProfit(userInfo.getInfoFromUser());
        deposit12M.checkProfit(userInfo.getInfoFromUser());

//        savingsAcc.capitalization(100000);
    }
}
