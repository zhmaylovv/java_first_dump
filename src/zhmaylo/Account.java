package zhmaylo;

import java.math.BigDecimal;

/**
 * Класс Account - счет в банке, хранит деньги в BigDecimal.
 */
public class Account {
    public BigDecimal accountBalance;

    public Account() {

        accountBalance = BigDecimal.valueOf(0);
    }

    /**
     * Внесение средств на счет.
     * @param income сумма для внесения.
     */
    public void incomeTransaction(BigDecimal income) {
        accountBalance = accountBalance.add(income);
    }

    /**
     * Списание средств со счета.
     * @param outcome сумма для списания.
     */
    public void outcomeTransaction(BigDecimal outcome) {
        accountBalance = accountBalance.subtract(outcome);
    }

    /**
     *
     * @return Возвращает сумму средств на счету.
     */
    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

}
