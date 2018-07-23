package com.endava.drodriguez;

import com.endava.drodriguez.domainmodel.LineItem;
import com.endava.drodriguez.domainmodel.Order;
import com.endava.drodriguez.domainmodel.OrderStatus;
import com.endava.drodriguez.domainmodel.Product;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        {//Code for first point in the challenge. Domain-Model
            Order o = new Order(0, new Date(),
                    OrderStatus.DELIVERED,
                    "",
                    53000,
                    new ArrayList<>());

            o.addItem(new LineItem(4, 2700, new Product(1, "Chocorramo", "Ponqué")));
            System.out.println("Valor: " + o.setTotal());
        }
    }
}
