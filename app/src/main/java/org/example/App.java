/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        // Create a bunch of objects that conform to the Cutie interface
        Puppy puppy = new Puppy();
        Kitty kitty = new Kitty();
        Bunny bunny = new Bunny();
        
        // Create a queue data structure
        QueueTees queue = new QueueTees();
        
        // The size of the queue should equal zero since there are no objects in it
        System.out.println("Queue size before enqueueing anything: " + queue.size());
        
        // Add the cuties to the queue
        queue.enqueue(puppy);
        queue.enqueue(kitty);
        queue.enqueue(bunny);
        
        // The size of the queue should equal three since there are three objects in it
         System.out.println("Queue size after enqueueing cuties: " + queue.size());

        //Enqueueing more objects than the max size should throw an exception
        try {
            queue.enqueue(new Puppy());
        } catch (IllegalStateException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } 
        
        // The first dequeue should return the puppy
        System.out.println("First dequeued element description: " + queue.dequeue().description());
        
        // The second dequeue should return the kitty
        System.out.println("Second dequeued element description: " + queue.dequeue().description());
        
        // The first dequeue should return the bunny
        System.out.println("Third dequeued element description: " + queue.dequeue().description());
        
        // The size of the queue should equal zero since all objects have been dequeued
        System.out.println("Queue size after dequeuing all cuties: " + queue.size());

        // Attempting to dequeue from an empty queue should throw an exception
        try {
            queue.dequeue();
        } catch (IllegalStateException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
