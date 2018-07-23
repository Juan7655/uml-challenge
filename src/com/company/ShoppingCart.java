package com.company;

import java.util.List;

class ShoppingCart {
    private List<LineItem> items;

    public void addItem(LineItem i){
        this.items.add(i);
    }

    public void cleanCart(){
        this.items.clear();
    }
}
