package com.alena;

import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour {
    private final List<Actor> visitors = new ArrayList<>();
    private final List<Actor> queue = new ArrayList<>();

    @Override
    public void acceptToMarket(Actor actor) {
        visitors.add(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actorList) {
        this.visitors.removeAll(actorList);
        queue.removeAll(actorList);
    }

    @Override
    public void update() {
        if(queue.isEmpty()) return;
        Actor actor = queue.get(0);
        if (actor.isTakeOrder) releaseFromQueue();
        if (actor.isMakeOrder) giveOrders();
        System.out.println(queue);
    }

    @Override
    public void takeInQueue(Actor actor) {
        queue.add(actor);
    }

    @Override
    public void takeOrders() {
        if(queue.isEmpty()) return;
        Actor actor = queue.get(0);
        actor.isMakeOrder = true;
    }

    @Override
    public void giveOrders() {
        if(queue.isEmpty()) return;
        Actor actor = queue.get(0);
        actor.isTakeOrder = true;
    }

    @Override
    public void releaseFromQueue() {
        if(queue.isEmpty()) return;
        queue.remove(0);
    }
}
