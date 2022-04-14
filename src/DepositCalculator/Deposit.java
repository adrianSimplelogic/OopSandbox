package DepositCalculator;

public class Deposit {

    double percent;
    int period;

    public Deposit(double percent, int period) {
        this.percent = percent;
        this.period = period;
    }

    public double checkProfit(int amount){
        double profit = amount*percent*.81/12*period;

        System.out.println("Kwota lokaty: "+amount+" PLN");
        System.out.println("Oprocentowanie: "+percent*100+"%");
        System.out.println("Okres depozytu: "+period+"M");
        System.out.println("-------------------");
        System.out.println("Zysk netto: "+profit+"\n");

        return profit;
    }

}
