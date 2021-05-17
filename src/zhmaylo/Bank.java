package zhmaylo;

import java.io.FileInputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import static java.math.RoundingMode.DOWN;

public class Bank {
    public static BigDecimal moneySupply;
    private static Integer numberOfAccounts;
    private static Integer numberOfClients;
    public static Integer numberOfTransaction;
    public static Boolean log;
    public ArrayList<String> errorTrans = new ArrayList<>();
    public List<Account> listOfAccount = new ArrayList<>();
    public ArrayList<Client> listOfClients = new ArrayList<>();

    public Bank() {
        this.loadProperties();
        this.generateBankEntity();
        this.getEqualsMoneyForEverybody();

    }

    /**
     * Раздаем деньги всем, равными долями, поскольку ровно поделить не всегда получается, делим как можем, и корректируем
     * показатель денежной массы.
     */
    private void getEqualsMoneyForEverybody() {
        BigDecimal supplyCorrector = new BigDecimal(0);
        BigDecimal part = new BigDecimal(String.valueOf(moneySupply.divide(BigDecimal.valueOf(numberOfAccounts), DOWN)));
        for (Account acc : listOfAccount) {
            acc.incomeTransaction(part);
            supplyCorrector = supplyCorrector.add(part);
        }
        moneySupply = supplyCorrector;
    }

    /**
     * Генерируем банковские сущности (Счета, Клиентов)
     */
    public void generateBankEntity() {
        for (int i = 0; i < numberOfAccounts; i++) {
            createNewAccount();
        }
        for (int i = 0; i < numberOfClients; i++) {
            createNewClient();
        }
    }

    /**
     * Процедура создания клиента с добавлением его в список клиентов банка.
     */
    public void createNewClient() {
        Client newClient = new Client(this);
        this.listOfClients.add(newClient);
    }

    /**
     * Процедура создания счета с добавлением его в список счетов банка
     */
    public void createNewAccount() {
        Account newAccount = new Account();
        listOfAccount.add(newAccount);
    }

    /**
     * Процедура загрузки properties для банка
     */
    public void loadProperties() {
        Properties property = new Properties();
        try (var fis = new FileInputStream("Task_11/src/main/java/zhmaylo/resources/zhmayloConfig.properties")) {
            property.load(fis);
            moneySupply = BigDecimal.valueOf(Long.parseLong(property.getProperty("moneySupply")));
            numberOfAccounts = Integer.valueOf(property.getProperty("numberOfAccounts"));
            numberOfClients = Integer.valueOf(property.getProperty("numberOfClients"));
            numberOfTransaction = Integer.valueOf(property.getProperty("numberOfTransaction"));
            log = Boolean.parseBoolean(property.getProperty("log"));
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * Процедура перевода средств с рандомными данными. Для самого перевода используется процедура transaction.
     * Генерация данных не передана на сторону клиента, так как для этого пришлось
     * бы открывать доступ к numberOfAccounts, а это не "секюрно"
     *
     * @param client Клиент совершающий перевод
     * @throws Exception В случае обнаружения "утечки" средств (текущая денежная масса != moneySupply) выбрасывается исключение.
     */
    public void doRandomDataTransaction(Client client) throws Exception {
        Account accountTo;
        Account accountFrom = listOfAccount.get((int) (Math.random() * numberOfAccounts));
        do {
            accountTo = listOfAccount.get((int) (Math.random() * numberOfAccounts));
        } while (accountTo == accountFrom);
        BigDecimal sizeOfTransaction = BigDecimal.valueOf(Math.random()).multiply(accountFrom.getAccountBalance()).setScale(3, DOWN);
        transaction(accountTo, accountFrom, sizeOfTransaction, client);
    }

    /**
     * Процедура перевода средств с одного счета на другой.
     * На случай утечки средств, создаем
     *
     * @param accountTo   Счет зачисления
     * @param accountFrom Счет списания
     * @param size        Размер перевода
     * @param client      Клиент совершающий перевод
     * @throws Exception В случае обнаружения "утечки" средств (текущая денежная масса != moneySupply) выбрасывается исключение.
     */
    public synchronized void transaction(Account accountTo, Account accountFrom, BigDecimal size, Client client) throws Exception {
        if (size.compareTo(accountFrom.getAccountBalance()) < 0) {
            accountFrom.outcomeTransaction(size);
            accountTo.incomeTransaction(size);
            if (log) {
                System.out.println("Transaction- OK " + "Client: " + client
                        + "From: " + accountFrom
                        + ", To: " + accountTo
                        + ", size: " + size);
            }
        } else {
            if (log) {
                System.out.println("Transaction was aborted: Not enough money!");
            }
        }
    }

}
