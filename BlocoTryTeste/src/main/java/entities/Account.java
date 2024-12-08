package entities;

import exceptions.ExceptionClass;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {
    }

    public Account(Double balance, String holder, Integer number, Double withdrawLimit) {
        this.balance = balance;
        this.holder = holder;
        this.number = number;
        this.withdrawLimit = withdrawLimit;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit (double amount) {
        balance += amount;
    }

    public void withdraw (double amount) {
        validetWithdraw(amount);
        balance -= amount;
    }

    private void validetWithdraw (double amount) {
        if (amount > getWithdrawLimit()) {
            throw new ExceptionClass("Withdraw error: the amount excedes the limit");
        }
        if (amount > getBalance()) {
            throw new ExceptionClass("Withdrwa error: insufficient balance");
        }
    }
}
