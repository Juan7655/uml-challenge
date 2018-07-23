package com.endava.drodriguez.domainmodel;

public class Check extends PaymentMethod{
    private int number;
    private int bankId;
    private String holder;

    public Check(int number, int bankId, String holder) {
        this.number = number;
        this.bankId = bankId;
        this.holder = holder;
    }

    @Override
    public void authorize() {
        System.out.println("Check number: " + number + " -- authorized");
    }
}
