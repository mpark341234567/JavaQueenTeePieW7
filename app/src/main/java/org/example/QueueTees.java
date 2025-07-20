package org.example;

import java.util.ArrayList;

public class QueueTees {
    private ArrayList<Cutie> cuties = new ArrayList<>();
    private int maxSize = 3;

    public void enqueue(Cutie cutie) {
        if (cuties.size() >= maxSize) {
            throw new IllegalStateException("Queue is full. Cannot enqueue more cuties.");
        }
        cuties.add(cutie);
    }

    public Cutie dequeue() {
        if (cuties.isEmpty()) {
            throw new IllegalStateException("Queue is empty. Cannot dequeue an empty queue."); 
        }
        return cuties.remove(0);
    }

    public int size() {
        return cuties.size();
    }
}
