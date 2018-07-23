package com.endava.drodriguez.domainmodel;

import java.util.List;

public class ShoppingCart {
    private List<LineItem> items;

    public void addItem(LineItem i){
        this.items.add(i);
    }

    public void cleanCart(){
        this.items.clear();
    }
}
