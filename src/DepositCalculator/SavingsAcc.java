package DepositCalculator;

public class SavingsAcc {

    double percent;

    public SavingsAcc(double percent) {
        this.percent = percent;
    }

    public void capitalization(double amount){
        double balance = amount;
        double profit = 0;

        for (int i = 1; i <= 12; i++) {
            profit=balance*percent*.81/12;
            balance+=profit;
            System.out.println("Miesiąc "+i+ " kwota z kapitalizacją:"+balance);
        }
    }

}
