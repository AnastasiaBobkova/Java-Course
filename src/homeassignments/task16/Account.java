package homeassignments.task16;

import java.util.Objects;

public class Account {
    private int id;
    private String accountNumber;
    private String accountCurrency;
    private double accountSum;

    public Account(int id, String accountNumber, String accountCurrency, double accountSum) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.accountCurrency = accountCurrency;
        this.accountSum = accountSum;
    }

    @Override
    public String toString() {
        return "Счёт: {" +
                "Идентификатор счёта = " + id +
                ", Номер счёта = '" + accountNumber + '\'' +
                ", Валюта = '" + accountCurrency + '\'' +
                ", Сумма = " + accountSum +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id && Objects.equals(accountNumber, account.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountNumber);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountCurrency() {
        return accountCurrency;
    }

    public void setAccountCurrency(String accountCurrency) {
        this.accountCurrency = accountCurrency;
    }

    public Double getAccountSum() {
        return accountSum;
    }

    public void setAccountSum(Double accountSum) {
        this.accountSum = accountSum;
    }
}