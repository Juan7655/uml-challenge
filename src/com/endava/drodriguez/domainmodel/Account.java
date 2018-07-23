package com.endava.drodriguez.domainmodel;

import java.util.List;

public class Account {
    private int id;
    private Customer customer;
    private AccountStatus status;
    private ShoppingCart cart;
    private List<Address> addresses;
    private List<PaymentMethod> methods;

    public void addMethod(PaymentMethod p){
        this.methods.add(p);
    }

    public void addAddress(Address a){
        this.addresses.add(a);
    }

    public void destroyMethods(){
        for (PaymentMethod p : methods){
            p.destroy();
        }
        this.methods.clear();
    }

    public void destroyAddresses(){
        this.addresses.clear();
    }
}
