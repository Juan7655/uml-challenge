package com.endava.drodriguez.pattern;

public class Client {
    private AbstractFactory factoryX = new ConcreteFactoryX();
    private AbstractFactory factoryY = new ConcreteFactoryY();

    private ProductA prodAX = factoryX.createProductA();
    private ProductA prodAY = factoryY.createProductA();
    private ProductB prodBX = factoryX.createProductB();
    private ProductB prodBY = factoryY.createProductB();

}
