package com.endava.drodriguez.domainmodel;

public abstract class  PaymentMethod {
    int id;

    public abstract void authorize();
    public void destroy(){

    }
}
