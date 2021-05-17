package zhmaylo;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

public class Daemon extends Thread{
    private final Bank bank;

    public Daemon(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        System.out.println("Daemon started");
        BigDecimal sum = new BigDecimal(0);
        for (Account acc : bank.listOfAccount) {
            sum = sum.add(acc.accountBalance.stripTrailingZeros());
        }
        while (sum.compareTo(bank.moneySupply) == 0) {
            if (bank.log){
            System.out.println("Money supply is checked by daemon. Everything is OK! is: " + sum);
            }
            try {

                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Error. Daemon find money leak" + sum);
            e.printStackTrace();
            System.exit(0);
        }

    }
}
