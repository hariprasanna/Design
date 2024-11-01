package org.example.UpsolvedPractice.ProducerConsumerProblem;

import java.util.LinkedList;

import java.util.Queue;

public class ProducerConsumerProblem {
    Queue<Integer> sharedResource;
    int bufferSize;
    public ProducerConsumerProblem(int bufferSize) {
        this.sharedResource = new LinkedList<>();
        this.bufferSize = bufferSize;
    }
    public synchronized void produce(int element) throws InterruptedException {
        if(sharedResource.size() >= bufferSize) {
            System.out.println("Buffer is full");
            wait();
        }
        sharedResource.add(element);
        notifyAll();
    }

    public synchronized int consume() throws InterruptedException {
        while(sharedResource.isEmpty()) {
            System.out.println("Buffer is empty");
            wait();
        }
        int item = sharedResource.poll();
        System.out.println("Item removed is : " + item);
        notifyAll();
        return item;
    }

}
