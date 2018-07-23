package com.endava.drodriguez.domainmodel;

public class Address {
    private int id;
    private String lineOne;
    private String lineTwo;
    private String city;
    private String country;
    private boolean billingAddress;

    public String getAddress(){
        return lineOne+ " " + lineTwo + ", " + city + "(" + country + ")";
    }
}
