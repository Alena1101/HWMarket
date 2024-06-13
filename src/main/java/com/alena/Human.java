package com.alena;

public class Human extends Actor {
    public Human(String name) {
        super(name);
    }
    public String getName() {
        return name;
    }

    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    public void setMakeOrder(boolean makeOrder) {
        isMakeOrder = makeOrder;
    }

    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    public void setTakeOrder(boolean takeOrder) {
        isTakeOrder = takeOrder;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Human{");
        sb.append("name='").append(name).append('\'');
        sb.append(", isMakeOrder=").append(isMakeOrder);
        sb.append(", isTakeOrder=").append(isTakeOrder);
        sb.append('}');
        return sb.toString();
    }
}
