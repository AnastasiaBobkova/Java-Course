package homeassignments.task16;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        double defaultExchangeRate = 3.14;
        Set<Account> bankAccounts = createBankAccounts();
        Bank bank = new Bank(bankAccounts, defaultExchangeRate);

        try {
            bank.transferMoney("11111", "22222", 5);
        } catch (AccountNotFoundException e) {
            System.out.println("Откройте счёт в нашем банке для выполнения переводов.");
        } catch (CurrencyNotFoundException e) {
            System.out.println("Необходимо указать счёт в BYN или USD.");
        } catch (NotEnoughMoneyException e) {
            System.out.println("Недостаточно средств для перевода.");
        } finally {
            System.out.println("Спасибо, что воспользовались услугами банка.");
        }

        System.out.println("Счета банка после перевода:");
        bank.showAccountsInfo();

        double newExchangeRate = 3.15;

        System.out.println("************************************************************************************");

        try {
            bank.transferMoney("44444", "55555", 10, newExchangeRate);
        } catch (AccountNotFoundException e) {
            System.out.println("Откройте счёт в нашем банке для выполнения переводов.");
        } catch (CurrencyNotFoundException e) {
            System.out.println("Необходимо указать счёт в BYN или USD.");
        } catch (NotEnoughMoneyException e) {
            System.out.println("Недостаточно средств для перевода.");
        } finally {
            System.out.println("Спасибо, что воспользовались услугами банка.");
        }

        System.out.println("Счета банка после перевода:");
        bank.showAccountsInfo();
    }

    private static Set<Account> createBankAccounts() {
        Account account1 = new Account(1, "11111", "BYN", 10);
        Account account2 = new Account(2, "22222", "BYN", 20);
        Account account3 = new Account(3, "33333", "BYN", 30);
        Account account4 = new Account(4, "44444", "USD", 40);
        Account account5 = new Account(5, "55555", "BYN", 50);

        Set<Account> bankAccounts = new HashSet<>();

        bankAccounts.add(account1);
        bankAccounts.add(account2);
        bankAccounts.add(account3);
        bankAccounts.add(account4);
        bankAccounts.add(account5);

        return bankAccounts;
    }
}