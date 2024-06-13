package com.alena;

public abstract class Actor {


    protected final String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;


    public Actor(String name) {
        this.name = name;
    }
}
