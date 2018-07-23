package com.endava.drodriguez.domainmodel;

import java.util.Date;
import java.util.List;

public class Order {
    private int id;
    private Date modified;
    private OrderStatus status;
    private String shippingAddress;
    private double total;
    private List<LineItem> items;

    public Order(int id, Date modified, OrderStatus status, String shippingAddress, double total, List<LineItem> items) {
        this.id = id;
        this.modified = modified;
        this.status = status;
        this.shippingAddress = shippingAddress;
        this.total = total;
        this.items = items;
    }

    public void addItem(LineItem i){
        this.items.add(i);
    }

    public double setTotal() {
        double t = 0;

        //calculates total value with the sum of the products of unitary price times quantity
        for(LineItem i : this.items) t += (i.getPrice() * i.getQuantity());

        return t;
    }
}
