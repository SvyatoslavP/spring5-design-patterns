package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.builder.exampleTwo;

public class AccountBuilderTest {
    public static void main(String[] args) {
        Account account = new Account.AccountBuilder("Saving Account", 1111L, "Svayt Panfan")
                .balance(387465.34)
                .interest(3.4)
                .type("SAVING")
                .build();
        System.out.println(account);
    }
}
