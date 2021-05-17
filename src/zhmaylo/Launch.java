package zhmaylo;

import java.math.BigDecimal;

public class Launch {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Daemon daemon = new Daemon(bank);
        daemon.setDaemon(true);
        daemon.start();

        //bank.listOfAccount.get(0).incomeTransaction(BigDecimal.valueOf(5000000));
        for (Client client : bank.listOfClients) {
            client.start();
        }
    }
}
