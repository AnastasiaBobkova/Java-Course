package homeassignments.task16;

import java.util.Set;

public class Bank {
    private Set<Account> accounts;
    private double exchangeRate;

    public Bank(Set<Account> accounts, double exchangeRate) {
        this.accounts = accounts;
        this.exchangeRate = exchangeRate;
    }

    public Set<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public void showAccountsInfo() {
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    public Account getAccountByNumber(String accountNumber) {
        for (Account accountByNumber : accounts) {
            if (accountByNumber.getAccountNumber().equals(accountNumber)) {
                return accountByNumber;
            }
        }
        return null;
    }

    public void transferMoney(String accountNumberFrom, String accountNumberTo, double amount) {
        Account accountFrom = getAccountByNumber(accountNumberFrom);
        Account accountTo = getAccountByNumber(accountNumberTo);
        checkAccountsForTransferExist(accountFrom, accountTo);
        checkCurrencySupport(accountFrom, accountTo);
        checkEnoughMoneyForTransfer(accountFrom, amount);
        withdrawFromAccount(accountFrom, amount);
        addToAccount(accountTo, amount);
    }

    public void transferMoney(String accountNumberFrom, String accountNumberTo, double amount, double exchangeRate) {
        setExchangeRate(exchangeRate);
        transferMoney(accountNumberFrom, accountNumberTo, amount);
    }

    private void checkAccountsForTransferExist(Account accountFrom, Account accountTo) {
        if (!accounts.contains(accountFrom) || !accounts.contains(accountTo)) {
            throw new AccountNotFoundException("not.found.account");
        }
    }

    private void checkCurrencySupport(Account accountFrom, Account accountTo) {
        if (!((isBynAccount(accountFrom) | isUsdAccount(accountFrom)) && (isBynAccount(accountTo) | isUsdAccount(accountTo)))) {
            throw new CurrencyNotFoundException("not.found.currency");
        }
    }

    private void checkEnoughMoneyForTransfer(Account accountFrom, double amount) {
        if (isEnoughMoney(accountFrom, amount)) {
            throw new NotEnoughMoneyException("not.enough.money");
        }
    }

    private void withdrawFromAccount(Account account, double amount) {
        if (isBynAccount(account)) {
            account.setAccountSum(account.getAccountSum() - amount);
        } else {
            account.setAccountSum(convertToUsd((convertToByn(account.getAccountSum()) - amount)));
        }
    }

    private void addToAccount(Account account, double amount) {
        if (isBynAccount(account)) {
            account.setAccountSum(account.getAccountSum() + amount);
        } else {
            account.setAccountSum(convertToUsd(convertToByn(account.getAccountSum()) + amount));
        }
    }

    private boolean isBynAccount(Account account) {
        return account.getAccountCurrency().equals("BYN");
    }

    private boolean isUsdAccount(Account account) {
        return account.getAccountCurrency().equals("USD");
    }

    private double convertToByn(double accountSum) {
        return accountSum * exchangeRate;
    }

    private double convertToUsd(double accountSum) {
        return accountSum / exchangeRate;
    }

    private boolean isEnoughMoney(Account account, double amount) {
        if (isBynAccount(account)) {
            return account.getAccountSum() < amount;
        } else {
            return convertToByn(account.getAccountSum()) < amount;
        }
    }
}