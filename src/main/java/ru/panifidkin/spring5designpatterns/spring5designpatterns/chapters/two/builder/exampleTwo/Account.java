package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.builder.exampleTwo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account {
    private String accountName;
    private Long accountNumber;
    private String accountHolder;
    private double balance;
    private String type;
    private double interest;

    public Account(AccountBuilder accountBuilder) {
        super();
        this.accountName = accountBuilder.accountName;
        this.accountNumber = accountBuilder.accountNumber;
        this.accountHolder = accountBuilder.accountHolder;
        this.balance = accountBuilder.balance;
        this.type = accountBuilder.type;
        this.interest = accountBuilder.interest;
    }

    public static class AccountBuilder {
        private final String accountName;
        private final Long accountNumber;
        private final String accountHolder;
        private double balance;
        private String type;
        private double interest;

        public AccountBuilder(String accountName, Long accountNumber, String accountHolder) {
            this.accountName = accountName;
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
        }

        public AccountBuilder balance(double balance) {
            this.balance = balance;
            return this;
        }

        public AccountBuilder type(String type) {
            this.type = type;
            return this;
        }

        public AccountBuilder interest(double interest) {
            this.interest = interest;
            return this;
        }

        public Account build() {
            Account user = new Account(this);
            return user;
        }
    }
    @Override
    public String toString() {
        return "Account{" +
                "accountName='" + accountName + '\'' +
                ", accountNumber=" + accountNumber +
                ", accountHolder='" + accountHolder + '\'' +
                ", balance=" + balance +
                ", type='" + type + '\'' +
                ", interest=" + interest +
                '}';
    }
}
