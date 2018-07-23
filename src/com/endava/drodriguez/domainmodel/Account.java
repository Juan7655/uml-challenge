package com.endava.drodriguez.domainmodel;

import java.util.List;

public class Account {
    private int id;
    private Customer customer;
    private AccountStatus status;
    private ShoppingCart cart;
    private List<Address> addresses;
    private List<PaymentMethod> methods;

    public Account(int id, Customer customer, AccountStatus status, ShoppingCart cart, List<Address> addresses, List<PaymentMethod> methods) {
        this.id = id;
        this.customer = customer;
        this.status = status;
        this.cart = cart;
        this.addresses = addresses;
        this.methods = methods;
    }

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

    public void printMethods(){
        for(PaymentMethod p:methods) System.out.println(p);
    }

    public void printAddresses(){
        for(Address a: addresses) System.out.println(a);
    }
}
