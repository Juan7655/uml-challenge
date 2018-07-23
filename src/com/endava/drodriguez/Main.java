package com.endava.drodriguez;

import com.endava.drodriguez.domainmodel.*;
import com.endava.drodriguez.pattern.Client;

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

            Address add = new Address(1, "what", "ever", "chia", "Colombia", true);
            PaymentMethod m = new DebitCard(5,new Date(),Issuer.VISA);
            Account a = new Account(1,
                    new Customer(1, "cust1", 3, "Oscar", "Oscar1"),
                    AccountStatus.ACTIVE,
                    new ShoppingCart(),
                    new ArrayList<>(),
                    new ArrayList<>()
            );

            a.addAddress(new Address(1, "what", "ever", "bogota", "Colombia", true));
            a.addMethod(new CreditCard(34, new Date(), 3, Issuer.AMEX));
            a.addAddress(add);
            a.addMethod(m);


            a.printAddresses();
            a.printMethods();
        }

        {// code for second point. AbstractFactory pattern
            Client c = new Client();
            c.printAll();
        }
    }
}
