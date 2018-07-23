package com.endava.drodriguez.domainmodel;

import java.util.Date;

public class DebitCard extends PaymentMethod{
    private int number;
    private Date expDate;
    private Issuer issuer;

    public DebitCard(int number, Date expDate, Issuer issuer) {
        this.number = number;
        this.expDate = expDate;
        this.issuer = issuer;
    }

    @Override
    public void authorize() {
        System.out.println("Check number: " + number + " -- authorized");
    }
}
