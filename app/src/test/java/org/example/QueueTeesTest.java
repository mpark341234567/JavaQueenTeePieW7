package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QueueTeesTest {
    @Test
    void testEnqueue() {
        QueueTees queue = new QueueTees();
        Cutie kitty = new Kitty();
        Cutie puppy = new Puppy();
        
        queue.enqueue(kitty);
        queue.enqueue(puppy);
        
        assertEquals(2, queue.size(), "Queue size should be 2 after enqueuing two cuties.");
    }
    @Test
    void testEnqueueFullQueue() {
        QueueTees queue = new QueueTees();
        Cutie kitty = new Kitty();
        Cutie puppy = new Puppy();
        Cutie bunny = new Bunny();
        
        queue.enqueue(kitty);
        queue.enqueue(puppy);
        queue.enqueue(bunny);
        
        assertThrows(IllegalStateException.class,() -> queue.enqueue(new Puppy()), "Enqueuing to a full queue should throw an exception.");
        
        assertEquals(3, queue.size(), "Queue size should remain 3 after trying to enqueue to a full queue.");
    }
    @Test
    void testDequeue() {
        QueueTees queue = new QueueTees();
        Cutie kitty = new Kitty();
        Cutie puppy = new Puppy();
        
        queue.enqueue(kitty);
        queue.enqueue(puppy);
        
        Cutie dequeuedCutie = queue.dequeue();
        assertNotNull(dequeuedCutie, "Dequeued cutie should not be null.");
        assertEquals(kitty.description(), dequeuedCutie.description(), "Dequeued cutie should be the kitty.");
        
        dequeuedCutie = queue.dequeue();
        assertNotNull(dequeuedCutie, "Dequeued cutie should not be null.");
        assertEquals(puppy.description(), dequeuedCutie.description(), "Dequeued cutie should be the puppy.");
        
        assertEquals(0, queue.size(), "Queue size should be 0 after dequeuing all cuties.");
    }
    @Test
    void testDequeueEmptyQueue() {
        QueueTees queue = new QueueTees();
        
        assertThrows(IllegalStateException.class, queue::dequeue, "Dequeueing from an empty queue should throw an exception.");
        
        assertEquals(0, queue.size(), "Queue size should remain 0 after dequeueing from an empty queue.");
    }
    @Test
    void testSize() {
        QueueTees queue = new QueueTees();
        
        assertEquals(0, queue.size(), "Initial queue size should be 0.");
        
        Cutie bunny = new Bunny();
        queue.enqueue(bunny);
        
        assertEquals(1, queue.size(), "Queue size should be 1 after enqueuing one cutie.");
        
        queue.dequeue();
        assertEquals(0, queue.size(), "Queue size should be 0 after dequeuing the only cutie.");
    }
}
